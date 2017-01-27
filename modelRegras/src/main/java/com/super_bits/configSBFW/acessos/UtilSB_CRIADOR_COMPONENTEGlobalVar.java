/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.configSBFW.acessos;

import com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.model.mapaComponentes.FabAcaoLabComponentes;
import com.super_bits.modulosSB.SBCore.modulos.fabrica.ItfFabricaAcoes;

/**
 *
 * @author salvioF
 */
public abstract class UtilSB_CRIADOR_COMPONENTEGlobalVar {

    public static Class<? extends ItfFabricaAcoes>[] pAcoesDoSistema() {
        return new Class[]{FabAcaoLabComponentes.class};
    }

}
