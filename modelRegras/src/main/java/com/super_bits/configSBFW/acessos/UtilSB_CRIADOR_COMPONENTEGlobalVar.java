/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.configSBFW.acessos;

import com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.model.mapaComponentes.FabAcaoLabComponentes;
import com.super_bits.modulosSB.SBCore.ConfigGeral.SBCore;
import com.super_bits.modulosSB.SBCore.modulos.fabrica.ItfFabricaAcoes;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.componentes.FabCompVIsualInputsLayout;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.componentes.FabCompVisualBotaoAcao;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.componentes.FabCompVisualEndereco;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.componentes.FabCompVisualInputs;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.componentes.FabCompVisualItem;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.componentes.FabCompVisualItens;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.componentes.FabCompVisualMenu;

/**
 *
 * @author salvioF
 */
public abstract class UtilSB_CRIADOR_COMPONENTEGlobalVar {

    public static Class<? extends ItfFabricaAcoes>[] pAcoesDoSistema() {
        return new Class[]{FabAcaoLabComponentes.class};
    }

    public static void adicionarObjetosEstaticosProjeto() {

        SBCore.adicionarFabricaObjetoEstatico(FabCompVisualInputs.class);
        SBCore.adicionarFabricaObjetoEstatico(FabAcaoLabComponentes.class);
        SBCore.adicionarFabricaObjetoEstatico(FabCompVIsualInputsLayout.class);
        SBCore.adicionarFabricaObjetoEstatico(FabCompVisualItem.class);
        SBCore.adicionarFabricaObjetoEstatico(FabCompVisualItens.class);
        SBCore.adicionarFabricaObjetoEstatico(FabCompVisualMenu.class);
        SBCore.adicionarFabricaObjetoEstatico(FabCompVisualBotaoAcao.class);
        SBCore.adicionarFabricaObjetoEstatico(FabCompVisualEndereco.class);

    }

}
