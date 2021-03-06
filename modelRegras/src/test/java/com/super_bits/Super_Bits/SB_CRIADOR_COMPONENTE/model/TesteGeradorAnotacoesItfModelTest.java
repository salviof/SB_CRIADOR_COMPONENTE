/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.model;

import com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.configAppp.TesteSB_CRIADOR_COMPONENTE;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campoInstanciado.ItfCampoInstanciado;
import com.super_bits.modulosSB.SBCore.modulos.objetos.validador.ErroValidacao;

import org.junit.Test;

/**
 *
 * @author desenvolvedor
 */
public class TesteGeradorAnotacoesItfModelTest extends TesteSB_CRIADOR_COMPONENTE {

    @Test
    public void testeValidaCampo() {
        gerarCodigoModelProjeto();/// Esse método cria as classes,
        // está no TesteJunit normalmente os testes extendem essa classe costuma ser a primeira na sequencia de extenções
        //

        BeanExemplo entidadeTeste = new BeanExemplo();
        try {
            ItfCampoInstanciado campo = entidadeTeste.getCampoInstanciadoByNomeOuAnotacao("validacaoLogicaApenasPar");

//            entidadeTeste.getCampoInstanciadoByNomeOuAnotacao(CPBeanExemplo.validacaologicaapenaspar);
            campo.getValidacaoLogicaEstrategia().validar("2");

            campo.getValidacaoLogicaEstrategia().validar("2");

            campo.getValidacaoLogicaEstrategia().validar("1");

            BeanExemplo entidadeTeste2 = new BeanExemplo();

            campo = entidadeTeste2.getCampoInstanciadoByNomeOuAnotacao("validacaoLogicaApenasPar");

            campo.getValidacaoLogicaEstrategia().validar("4");
        } catch (ErroValidacao t) {
            System.out.println(t.getMensagemAoUsuario());
        }
    }
}
