/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.model.formularios;

import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.acoes.ItfAcaoDoSistema;
import com.super_bits.modulosSB.SBCore.modulos.Controller.anotacoes.InfoTipoAcaoFormulario;
import com.super_bits.modulosSB.SBCore.modulos.Controller.anotacoes.InfoTipoAcaoGestaoEntidade;
import com.super_bits.modulosSB.SBCore.modulos.fabrica.ItfFabricaAcoes;

/**
 *
 * @author desenvolvedor
 */
public enum FabAcaoGestaoFormulario implements ItfFabricaAcoes {
    @InfoTipoAcaoGestaoEntidade(entidade = ModeloFormularioGenerico.class)
    FORMULARIOPADRAOSB_MB,
    @InfoTipoAcaoFormulario()
    FORMULARIOPADRAOSB_FRM_LISTAR,
    @InfoTipoAcaoFormulario()
    FORMULARIOPADRAOSB_FRM_VISUALIZAR,
    FORMULARIOPADRAOSB_FRM_EDITAR;

    @Override
    public ItfAcaoDoSistema getRegistro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNomeModulo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
