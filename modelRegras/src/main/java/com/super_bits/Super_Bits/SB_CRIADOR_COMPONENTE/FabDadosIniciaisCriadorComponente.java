/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE;

import com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.model.informacao.ConteudoGenerico;
import com.super_bits.modulosSB.SBCore.UtilGeral.UtilCRCStringGerador;
import com.super_bits.modulosSB.SBCore.UtilGeral.UtilCRCStringValidador;

import com.super_bits.modulosSB.SBCore.modulos.fabrica.ComoFabrica;

/**
 *
 * @author desenvolvedor
 */
public enum FabDadosIniciaisCriadorComponente implements ComoFabrica {

    INFO1,
    INFO2,
    INFO3,
    INFO4,
    INFO5,
    INFO6;

    @Override
    public ConteudoGenerico getRegistro() {
        ConteudoGenerico info = new ConteudoGenerico();
        info.setId((long) this.ordinal());
        info.setNome(this.toString());
        info.setDescricao(UtilCRCStringGerador.GetLorenIpsilum(5, UtilCRCStringGerador.TIPO_LOREN.PALAVRAS));
        return info;
    }
}
