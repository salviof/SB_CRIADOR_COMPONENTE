/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.model;

import com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.configAppp.TesteSB_CRIADOR_COMPONENTE;
import com.super_bits.modulosSB.SBCore.ConfigGeral.SBCore;
import com.super_bits.modulosSB.SBCore.modulos.TratamentoDeErros.FabErro;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campoInstanciado.ItfCampoInstanciado;
import org.junit.Test;

/**
 *
 * @author desenvolvedor
 */
public class TesteFluxoEndereco extends TesteSB_CRIADOR_COMPONENTE {

    @Test
    public void testeFluxo() {
        try {
            BeanExemplo bean = new BeanExemplo();
            ItfCampoInstanciado campoInstanciadoUF = bean.getCampoInstanciadoByNomeOuAnotacao("localizacao.bairro.cidade.unidadeFederativa");
            System.out.println(campoInstanciadoUF.getLabelPadrao());
        } catch (Throwable t) {
            SBCore.RelatarErro(FabErro.SOLICITAR_REPARO, "Erro obtendo campo instanciado de endereço", t);
        }
    }

}
