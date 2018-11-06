/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.configSBFW.acessos;

import com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.model.FabListBeanExemplos;
import com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.model.mapaComponentes.FabAcaoLabComponentes;
import com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.regras_de_negocio_e_controller.dominioBeanExemploTeste.FabAcaoBeanExemploDemonstrativo;
import com.super_bits.modulosSB.SBCore.ConfigGeral.SBCore;
import com.super_bits.modulosSB.SBCore.modulos.comunicacao.EnvelopeComunicacaoSimples;
import com.super_bits.modulosSB.SBCore.modulos.fabrica.ItfFabricaAcoes;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.ItensGenericos.basico.UsuarioAnonimo;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.ItensGenericos.basico.UsuarioSistemaRoot;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.TipoAtributoObjetoSB;
import com.super_bits.modulosSB.SBCore.modulos.objetos.MapaObjetosProjetoAtual;
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
        return new Class[]{FabAcaoLabComponentes.class, FabAcaoBeanExemploDemonstrativo.class};
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
        SBCore.adicionarFabricaObjetoEstatico(FabListBeanExemplos.class);
        MapaObjetosProjetoAtual.adcionarObjeto(TipoAtributoObjetoSB.class);
        MapaObjetosProjetoAtual.adcionarObjeto(UsuarioAnonimo.class);
        MapaObjetosProjetoAtual.adcionarObjeto(UsuarioSistemaRoot.class);
        MapaObjetosProjetoAtual.adcionarObjeto(EnvelopeComunicacaoSimples.class);
    }

}
