/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.model;

import com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.configAppp.TesteSB_CRIADOR_COMPONENTE;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campoInstanciado.ItfCampoInstanciado;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campoInstanciado.ItfCampoLocalizacaoInstanciado;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.cep.ItfUnidadeFederativa;
import java.util.List;
import org.junit.Test;

/**
 *
 * @author SalvioF
 */
public class TesteFluxoEndereco extends TesteSB_CRIADOR_COMPONENTE {

    @Test
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
        }
    }

}
