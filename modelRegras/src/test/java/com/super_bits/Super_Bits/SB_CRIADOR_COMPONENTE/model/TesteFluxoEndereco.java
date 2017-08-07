/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.model;

import com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.configAppp.TesteSB_CRIADOR_COMPONENTE;
import com.super_bits.modulosSB.SBCore.ConfigGeral.SBCore;
import com.super_bits.modulosSB.SBCore.modulos.TratamentoDeErros.FabErro;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.FabTipoAtributoObjeto;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campoInstanciado.ItfCampoInstanciado;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.cep.ItemLocalizacao;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.cep.ItfCidade;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.cep.ItfUnidadeFederativa;
import java.util.List;
import org.junit.Test;

/**
 *
 * @author SalvioF
 *
 */
public class TesteFluxoEndereco extends TesteSB_CRIADOR_COMPONENTE {

    @Test
    public void testeFluxo() {
        try {

            ItemLocalizacao teste = new ItemLocalizacao();
            ItfCampoInstanciado cpTeste = teste.getCampoInstanciadoByNomeOuAnotacao(FabTipoAtributoObjeto.LCCEP.toString());
            BeanExemplo bean = new BeanExemplo();
            ItfCampoInstanciado campoInstanciadoUF = bean.getCampoInstanciadoByNomeOuAnotacao("localizacao.bairro.cidade.unidadeFederativa");
            System.out.println(campoInstanciadoUF.getCampoInstanciadoRaiz());
            System.out.println("LabelPai=" + campoInstanciadoUF.getCampoInstanciadoRaiz().getLabel());
            campoInstanciadoUF.getCampoInstanciadoRaiz().setLabel("Colé");
            System.out.println("TEste=" + campoInstanciadoUF.getCampoInstanciadoRaiz().getNomeCamponaClasse());
            List<ItfUnidadeFederativa> bairrosDisponiveis = (List) campoInstanciadoUF.getComoCampoLocalizacao().metodoAutoCompleteEstado("mg");
            campoInstanciadoUF.getComoCampoLocalizacao().setUnidadeFederativa((ItfUnidadeFederativa) bairrosDisponiveis.get(0));
            ItfCampoInstanciado campoInstanciadoCidade = bean.getCampoInstanciadoByNomeOuAnotacao("localizacao.bairro.cidade");
            System.out.println("Raiz=" + campoInstanciadoCidade.getNomeCompostoIdentificador());
            List<ItfCidade> cidadesDisponiveis = campoInstanciadoCidade.getComoCampoLocalizacao().metodoAutoCompleteCidade("Belo Hor");
            System.out.println(cidadesDisponiveis);
            campoInstanciadoCidade.getComoCampoLocalizacao().setCidade(cidadesDisponiveis.get(0));
            System.out.println("LabelPai=" + campoInstanciadoUF.getCampoInstanciadoRaiz().getLabel());
            //ItfCampoInstanciado campoInstanciadoCidade = bean.getCampoInstanciadoByNomeOuAnotacao("localizacao.bairro.cidade");
            System.out.println(campoInstanciadoCidade.getCampoInstanciadoRaiz());
            System.out.println("LabelPai=" + campoInstanciadoCidade.getCampoInstanciadoRaiz().getLabel());

            ItfCampoInstanciado campoLoc = bean.getCampoInstanciadoByNomeOuAnotacao("localizacao");
            System.out.println("Cidade Antes do CEP" + campoLoc.getComoCampoLocalizacao().getCidade().getNome());
            campoLoc.getComoCampoLocalizacao().setCep("30190030");
            campoLoc.getComoCampoLocalizacao().atualizarEnderecoPorCep();
            System.out.println(campoLoc.getComoCampoLocalizacao().getCidade().getNome());
//            System.out.println(campoLoc.getComoCampoLocalizacao().getLogradouroDescricao());

        }
        catch (Throwable t) {
            SBCore.RelatarErro(FabErro.SOLICITAR_REPARO, "Erro obtendo campo instanciado de endereço", t);

        }
    }

}
