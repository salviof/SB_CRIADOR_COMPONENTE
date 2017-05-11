/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.model;

import com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.configAppp.TesteSB_CRIADOR_COMPONENTE;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.ItfCampoInstanciado;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.ItfCampoLocalizacaoInstanciado;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.cep.ItfBairro;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.cep.ItfCidade;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.cep.ItfUnidadeFederativa;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.ItfComponenteVisualSB;
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

            ItfCampoInstanciado campo = beanExemplo.getCampoByNomeOuAnotacao("listasExemplo");

            ItfComponenteVisualSB cp = campo.getComponenteVisualPadrao();

            System.out.println("Tipo de campo=" + cp.getNomeComponente());
            System.out.println("Tipo de campo=" + cp.getXhtmlJSF());

            ItfCampoInstanciado campoInstanciado = beanExemplo.getCampoInstanciadoByNomeOuAnotacao("localizacao");
            campoInstanciado.getCampoArquivoDeIntidade()

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
