/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.regras_de_negocio_e_controller;

import com.super_bits.Super_Bits.SB_AdminTools.regras_de_negocio_e_controller.admin_developer.FabAcaoAdminDeveloper;
import com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.model.mapaComponentes.FabAcaoLabComponentes;
import com.super_bits.modulos.SBAcessosModel.fabricas.FabAcaoProjetoSB;
import com.super_bits.modulos.SBAcessosModel.fabricas.acoesDemonstracao.FabAcaoDemonstracaoSB;
import com.super_bits.modulos.SBAcessosModel.model.acoes.AcaoDoSistema;
import com.super_bits.modulosSB.SBCore.modulos.Controller.AcaoTransient;
import com.super_bits.modulosSB.SBCore.modulos.view.menu.ItfFabricaMenu;
import com.super_bits.modulosSB.SBCore.modulos.view.menu.MenuSBFW;
import com.super_bits.modulosSB.SBCore.modulos.view.menu.SessaoMenuSB;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * FAbricas de menu, devem ser usadas para construção de menus do sistema.
 *
 * Voce pode adicionar sessoes e ações no menu
 *
 *
 * @author desenvolvedor
 */
public enum FabMenuCriadorComponente implements ItfFabricaMenu {
    MENU_INICIAL, MENU_RESTRITO;

    @Override
    public List<MenuSBFW> getTodosMenus() {
        List<MenuSBFW> menus = new ArrayList<>();
        for (ItfFabricaMenu menu : this.getClass().getEnumConstants()) {
            menus.add((MenuSBFW) menu.getRegistro());
        }
        return menus;
    }

    @Override
    public MenuSBFW getRegistro() {
        MenuSBFW menu = new MenuSBFW();
        AcaoDoSistema acao = new AcaoDoSistema();
        acao.setNomeAcao("Componentes");
        acao.setIconeAcao("");
        SessaoMenuSB sessaoVisaoGeral = new SessaoMenuSB(acao);
        //sessaoVisaoGeral.addAcao(FabAcaoDemonstracaoSB.DEMONSTRACAO_MB_COMPONENTE.getRegistro());
        //sessaoVisaoGeral.addAcao(FabAcaoDemonstracaoSB.DEMONSTRACAO_MB_VALIDACAO.getRegistro());
        menu.addSessao(sessaoVisaoGeral);
        SessaoMenuSB sessaoFerramentas=new SessaoMenuSB(FabAcaoProjetoSB.PROJETO_FRM_VISAO_GERAL.getRegistro());
        sessaoFerramentas.addAcao(FabAcaoLabComponentes.LAB_COMPONENTES_MB_GERENCIAR.getRegistro());
        sessaoFerramentas.addAcao(FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_MB_LAB.getRegistro());
        sessaoFerramentas.addAcao(FabAcaoAdminDeveloper.DEV_PROJETO_ADMIN_MB.getRegistro());
     //   sessaoFerramentas.addAcao(FabAcaoAdminDeveloper.FERRAMENTAS_ACAO_MB_CRIAR.getRegistro());
        sessaoFerramentas.addAcao(FabAcaoAdminDeveloper.FERRAMENTAS_BANCO_MB.getRegistro());
      //  sessaoFerramentas.addAcao(FabAcaoAdminDeveloper.FERRAMENTAS_LOGS_MB.getRegistro());
        //sessaoFerramentas.addAcao(FabAcaoAdminDeveloper.FERRAMENTAS_CONFIG_MB.getRegistro());
        sessaoFerramentas.addAcao(FabAcaoAdminDeveloper.FERRAMENTAS_OBJETO_CONTAINER_MB .getRegistro());
        
        menu.addSessao(sessaoFerramentas);
        switch (this) {
            case MENU_INICIAL:

                return menu;
            case MENU_RESTRITO:
                AcaoDoSistema acaosessao = new AcaoDoSistema();
                acaosessao.setNome("Permissões ");
                SessaoMenuSB adminUsuario = new SessaoMenuSB(acaosessao);
                //adminUsuario.addAcao(FabAcaoSeguranca.GRUPO_MB_GERENCIAR.getRegistro());
                //adminUsuario.addAcao(FabAcaoSeguranca.USUARIO_MB_GERENCIAR.getRegistro());
                menu.addSessao(adminUsuario);
                return menu;
            default:
                throw new AssertionError(this.name());

        }
    }

    @Override
    public MenuSBFW getMenuPrincipal() {
        return getRegistro();
    }

    @Override
    public MenuSBFW getMenuSecundario() {
        return new MenuSBFW();
    }

}
