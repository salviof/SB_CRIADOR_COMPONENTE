/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.regras_de_negocio_e_controller;

import com.super_bits.modulos.SBAcessosModel.model.ModuloAcaoSistema;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.ItfModuloAcaoSistema;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.modulo.ItfFabricaModulo;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.anotacoes.InfoObjetoDaFabrica;
import com.super_bits.modulosSB.SBCore.modulos.view.menu.ItfFabricaMenu;

/**
 *
 *
 * ARQUIVO DE EXEMPLO, PARA INICIO DE APLICAÇÃO.
 *
 * REFATORE ESTA CLASSE COM OS MODULOS DO SEU SISTEMA
 *
 *
 * @author Salvio Furbino
 */
public enum FabModulosIProjetoTesteI implements ItfFabricaModulo {
    @InfoObjetoDaFabrica(classeObjeto = ModuloAcaoSistema.class, nomeObjeto = "Módulo Demonstração", id = 1)
    DEMONSTRACAO_BASICA,
    @InfoObjetoDaFabrica(classeObjeto = ModuloAcaoSistema.class, nomeObjeto = "Módulo Acesso REstrito exemplo", id = 2)
    DEMONSTRACAO_ACESSO_RESTRITO;

    @Override
    public ItfModuloAcaoSistema getModulo() {
        ModuloAcaoSistema modulo = new ModuloAcaoSistema();
        switch (this) {
            case DEMONSTRACAO_BASICA:
                modulo.setId(1l);
                modulo.setNome("Modulo demonstração");
                modulo.setDescricao("Modulo demonstração Teste");
                break;
            case DEMONSTRACAO_ACESSO_RESTRITO:
                modulo.setId(2l);
                modulo.setNome("Modulo Acesso Restrito");
                modulo.setDescricao("");
                break;
            default:
                throw new AssertionError(this.name());

        }
        return modulo;
    }

    @Override
    public ItfFabricaMenu getMenuPadrao() {
        return FabMenuCriadorComponente.MENU_INICIAL;
    }
}
