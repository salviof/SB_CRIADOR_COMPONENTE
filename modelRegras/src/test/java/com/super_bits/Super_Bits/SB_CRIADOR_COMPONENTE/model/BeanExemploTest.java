/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.model;

import com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.configAppp.TesteSB_CRIADOR_COMPONENTE;
import com.super_bits.modulosSB.SBCore.ConfigGeral.SBCore;
import com.super_bits.modulosSB.SBCore.modulos.Mensagens.FabMensagens;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.CaminhoCampoExibicaoFormulario;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.FabTipoAtributoObjeto;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campoInstanciado.CampoInstanciadoEnumFabricaObjeto;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campoInstanciado.ItfCampoInstSeletorItens;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campoInstanciado.ItfCampoInstanciado;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campoInstanciado.ItfCampoLocalizacaoInstanciado;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfBeanSimples;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfBeanSimplesSomenteLeitura;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.cep.ItfBairro;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.cep.ItfCidade;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.cep.ItfUnidadeFederativa;
import java.util.Iterator;
import java.util.List;
import org.junit.Test;

/**
 *
 * @author desenvolvedor
 */
public class BeanExemploTest extends TesteSB_CRIADOR_COMPONENTE {

    public BeanExemploTest() {
    }

    /**
     * Test of getId method, of class BeanExemplo.
     */
    @Test
    public void testGetId() {
        try {
            System.out.println("getId");
            BeanExemplo beanExemplo = new BeanExemplo();

            ItfCampoInstanciado campoInstanciadoCep = beanExemplo.getCampoInstanciadoByNomeOuAnotacao("cep");
            SBCore.getCentralDeMensagens().enviarMsgAlertaAoDesenvolvedor(campoInstanciadoCep.getComponenteVisualPadrao().getXhtmlJSF());
            SBCore.getCentralDeMensagens().enviarMsgAlertaAoDesenvolvedor(campoInstanciadoCep.getComponenteDiferenciado(null).getXhtmlJSF());

            ItfCampoInstanciado campoInstanciadoObjetoFabrica = beanExemplo.getCampoInstanciadoByNomeOuAnotacao("objetoFabrica");
            System.out.println(campoInstanciadoObjetoFabrica.getTipoCampoSTR());
            System.out.println(beanExemplo.getObjetoFabrica());
            System.out.println(beanExemplo.getObjetoFabrica().name());
            System.out.println(beanExemplo.getObjetoFabrica().toString());
            System.out.println(campoInstanciadoObjetoFabrica.getValor());
            CampoInstanciadoEnumFabricaObjeto campoEnum = campoInstanciadoObjetoFabrica.getComoEnumFabricaObjeto();
            campoEnum.setStringSelecionada(FabTipoAtributoObjeto.COR.toString());

            System.out.println(campoEnum.getListaOpcoesString());

            ItfCampoInstanciado campoSeletorItensTesteSubform = beanExemplo.getCampoInstanciadoByNomeOuAnotacao("listasExemplo");
            System.out.println(campoSeletorItensTesteSubform.getValor());
            System.out.println("" + campoSeletorItensTesteSubform.isUmValorMultiploComLista());
            campoSeletorItensTesteSubform.getComoSeltorItens().adicionarItem();
            List<ItfBeanSimples> listaSubFormTeste = (List<ItfBeanSimples>) campoSeletorItensTesteSubform.getValor();
            System.out.println(campoSeletorItensTesteSubform.getGrupoSubCamposExibicao());

            for (ItfBeanSimples valorSublista : listaSubFormTeste) {
                for (CaminhoCampoExibicaoFormulario caminho : campoSeletorItensTesteSubform.getGrupoSubCamposExibicao().getCampos()) {
                    System.out.println(caminho.getCaminhoSemNomeClasse());
                    System.out.println(valorSublista.getCampoByNomeOuAnotacao(caminho.getCaminhoSemNomeClasse()).getLabel());
                }

            }
            ItfCampoInstSeletorItens seletorItens = campoSeletorItensTesteSubform.getComoSeltorItens();
            seletorItens.getCampoSeletorItens().getOrigem();

            ItfCampoInstanciado campoCNPJ = beanExemplo.getCampoInstanciadoByNomeOuAnotacao("cnpj");
            System.out.println(campoCNPJ.getMascara());

            ItfCampoInstanciado campoSeletor = beanExemplo.getCampoInstanciadoByNomeOuAnotacao("beanSelecionadoDaListaFabrica");

            System.out.println("Opções listadas=" + campoSeletor.getListaDeOpcoes().size());
            for (ItfBeanSimples opcao : campoSeletor.getListaDeOpcoes()) {
                System.out.println(opcao.getNome());
            }
            campoSeletor.setValor(FabListBeanExemplos.EXEMPLO1.getRegistro());

            ItfCampoInstanciado mascaraDoCampoSelecionado = beanExemplo.getCampoInstanciadoByNomeOuAnotacao("beanSelecionadoDaListaFabrica.cnpj");
            System.out.println(mascaraDoCampoSelecionado.getMascara());

            ItfCampoInstanciado campoSelecaoItensInstanc = beanExemplo.getCampoByNomeOuAnotacao("listasExemplo");
            ItfCampoInstSeletorItens campoSeletorInstanciado = campoSelecaoItensInstanc.getComoSeltorItens();

            System.out.println("Antes de filtrar Retornou ->" + campoSeletorInstanciado.getSeletor().getOrigem().size() + " registros,:" + campoSeletorInstanciado.getSeletor().getOrigem());

            campoSeletorInstanciado.filtrarPorAutoComplet("6");
            System.out.println("Retornou ->" + campoSeletorInstanciado.getSeletor().getOrigem().size() + " registros,:" + campoSeletorInstanciado.getSeletor().getOrigem());

            for (Iterator it = campoSeletorInstanciado.getSeletor().getOrigem().iterator(); it.hasNext();) {
                ItfBeanSimplesSomenteLeitura simples = (ItfBeanSimplesSomenteLeitura) it.next();
                System.out.println("->>>>>" + simples.getNome());
            }
            ItfCampoInstanciado campoSelecao = beanExemplo.getCampoByNomeOuAnotacao("beanSelecionadoDaListaFabrica");

            System.out.println("Lista Por fabrica=" + campoSelecao.getComoCampoSeltorItem().getSeletor().getOrigem().size() + "-" + campoSelecao.getComoCampoSeltorItem().getSeletor().getOrigem());

            campoSelecao.getComoCampoSeltorItem().filtrarPorAutoComplet("Contato");
            System.out.println("Lista Por fabrica=" + campoSelecao.getComoCampoSeltorItem().getSeletor().getOrigem().size() + "-" + campoSelecao.getComoCampoSeltorItem().getSeletor().getOrigem());

            //System.out.println("Tipo de campo=" + cp.getNomeComponente());
            //System.out.println("Tipo de campo=" + cp.getXhtmlJSF());
            ItfCampoInstanciado campoInstanciado = beanExemplo.getCampoInstanciadoByNomeOuAnotacao("localizacao");
            campoInstanciado.getComoSeltorItens();

            ItfCampoLocalizacaoInstanciado cpLocalizacao = campoInstanciado.getComoCampoLocalizacao();

            List<ItfUnidadeFederativa> lista = cpLocalizacao.metodoAutoCompleteEstado("minas");
            for (ItfUnidadeFederativa estado : lista) {
                System.out.println(estado.getNome());
            }
            cpLocalizacao.setUnidadeFederativa(lista.get(0));
            List<ItfCidade> cidades = cpLocalizacao.metodoAutoCompleteCidade("Belo Horizonte");

            cpLocalizacao.setCidade(cidades.get(0));

            List<ItfBairro> bairros = cpLocalizacao.metodoAutoCompleteBairro("Centro");
            System.out.println(bairros.get(0).getNome());
            cpLocalizacao.setBairro(bairros.get(0));
            cpLocalizacao.setNomeLocal("asdasdasd");

        } catch (Throwable t) {
            lancarErroJUnit(t);
        }

    }

}
