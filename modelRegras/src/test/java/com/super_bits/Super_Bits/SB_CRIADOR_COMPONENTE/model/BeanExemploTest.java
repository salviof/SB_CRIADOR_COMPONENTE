/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.model;

import com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.configAppp.TesteSB_CRIADOR_COMPONENTE;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campoInstanciado.ItfCampoInstSeletorItens;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campoInstanciado.ItfCampoInstanciado;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campoInstanciado.ItfCampoLocalizacaoInstanciado;
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

            ItfCampoInstanciado campoSelecaoItensInstanc = beanExemplo.getCampoByNomeOuAnotacao("listasExemplo");
            ItfCampoInstSeletorItens campoSeletorInstanciado = campoSelecaoItensInstanc.getCampoSeltorItens();

            System.out.println("Antes de filtrar Retornou ->" + campoSeletorInstanciado.getSeletor().getOrigem().size() + " registros,:" + campoSeletorInstanciado.getSeletor().getOrigem());

            campoSeletorInstanciado.filtrarPorAutoComplet("6");
            System.out.println("Retornou ->" + campoSeletorInstanciado.getSeletor().getOrigem().size() + " registros,:" + campoSeletorInstanciado.getSeletor().getOrigem());

            for (Iterator it = campoSeletorInstanciado.getSeletor().getOrigem().iterator(); it.hasNext();) {
                ItfBeanSimplesSomenteLeitura simples = (ItfBeanSimplesSomenteLeitura) it.next();
                System.out.println("->>>>>" + simples.getNome());
            }
            ItfCampoInstanciado campoSelecao = beanExemplo.getCampoByNomeOuAnotacao("beanSelecionadoDaListaFabrica");

            System.out.println("Lista Por fabrica=" + campoSelecao.getCampoSeltorItem().getSeletor().getOrigem().size() + "-" + campoSelecao.getCampoSeltorItem().getSeletor().getOrigem());

            campoSelecao.getCampoSeltorItem().filtrarPorAutoComplet("Contato");
            System.out.println("Lista Por fabrica=" + campoSelecao.getCampoSeltorItem().getSeletor().getOrigem().size() + "-" + campoSelecao.getCampoSeltorItem().getSeletor().getOrigem());

            //System.out.println("Tipo de campo=" + cp.getNomeComponente());
            //System.out.println("Tipo de campo=" + cp.getXhtmlJSF());
            ItfCampoInstanciado campoInstanciado = beanExemplo.getCampoInstanciadoByNomeOuAnotacao("localizacao");
            campoInstanciado.getCampoSeltorItens();

            ItfCampoLocalizacaoInstanciado cpLocalizacao = campoInstanciado.getCampoLocalizacao();

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
