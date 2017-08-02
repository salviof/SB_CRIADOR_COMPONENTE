/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.model;

import com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.configAppp.TesteSB_CRIADOR_COMPONENTE;
<<<<<<< HEAD
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campoInstanciado.ItfCampoInstanciado;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campoInstanciado.ItfCampoLocalizacaoInstanciado;
=======
import com.super_bits.modulosSB.SBCore.ConfigGeral.SBCore;
import com.super_bits.modulosSB.SBCore.modulos.TratamentoDeErros.FabErro;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.FabTipoAtributoObjeto;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campoInstanciado.ItfCampoInstanciado;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.cep.ItemLocalizacao;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.cep.ItfBairro;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.cep.ItfCidade;
>>>>>>> a1fc5ee5701c957f7c686bd7e44b3b9423ed6bed
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.cep.ItfUnidadeFederativa;
import java.util.List;
import org.junit.Test;

/**
 *
<<<<<<< HEAD
 * @author SalvioF
=======
 * @author desenvolvedor
>>>>>>> a1fc5ee5701c957f7c686bd7e44b3b9423ed6bed
 */
public class TesteFluxoEndereco extends TesteSB_CRIADOR_COMPONENTE {

    @Test
<<<<<<< HEAD
    public void testePreenchimentoEndereco() {
        try {
            BeanExemplo beanExemplo = new BeanExemplo();
            beanExemplo.prepararNovoObjeto();

            ItfCampoInstanciado estado = beanExemplo.getLocalizacao().getBairro().getCidade().getCampoInstanciadoByNomeOuAnotacao("unidadeFederativa");

            ItfCampoLocalizacaoInstanciado campoLocalizacao = estado.getCampoLocalizacao();
            List<ItfUnidadeFederativa> lista = campoLocalizacao.metodoAutoCompleteEstado("minas");
            estado.getCampoLocalizacao().setUnidadeFederativa(lista.get(0));
            ItfCampoInstanciado cidade = beanExemplo.getLocalizacao().getCampoInstanciadoByNomeOuAnotacao("cidade");

        } catch (Throwable t) {
            lancarErroJUnit(t);
=======
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

            System.out.println("LabelPai=" + campoInstanciadoUF.getCampoInstanciadoRaiz().getLabel());
            //ItfCampoInstanciado campoInstanciadoCidade = bean.getCampoInstanciadoByNomeOuAnotacao("localizacao.bairro.cidade");
            System.out.println(campoInstanciadoCidade.getCampoInstanciadoRaiz());
            System.out.println("LabelPai=" + campoInstanciadoCidade.getCampoInstanciadoRaiz().getLabel());

        } catch (Throwable t) {
            SBCore.RelatarErro(FabErro.SOLICITAR_REPARO, "Erro obtendo campo instanciado de endereço", t);
>>>>>>> a1fc5ee5701c957f7c686bd7e44b3b9423ed6bed
        }
    }

}
