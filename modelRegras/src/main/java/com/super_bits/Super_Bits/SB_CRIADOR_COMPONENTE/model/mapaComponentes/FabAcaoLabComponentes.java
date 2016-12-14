/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.model.mapaComponentes;

import com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.regras_de_negocio_e_controller.FabModulosIProjetoTesteI;
import com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.regras_de_negocio_e_controller.InfoModuloSB_CRIADOR_COMPONENTE;
import com.super_bits.modulos.SBAcessosModel.model.acoes.AcaoDoSistema;
import com.super_bits.modulos.SBAcessosModel.model.acoes.UtilFabricaDeAcoesAcessosModel;
import com.super_bits.modulosSB.SBCore.modulos.Controller.anotacoes.InfoTipoAcaoFormulario;
import com.super_bits.modulosSB.SBCore.modulos.Controller.anotacoes.InfoTipoAcaoGestaoEntidade;
import com.super_bits.modulosSB.SBCore.modulos.fabrica.ItfFabricaAcoes;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.ComponenteVisualSB;

/**
 *
 * @author desenvolvedor
 */
@InfoModuloSB_CRIADOR_COMPONENTE(modulo = FabModulosIProjetoTesteI.DEMONSTRACAO_BASICA)
public enum FabAcaoLabComponentes implements ItfFabricaAcoes {

    @InfoTipoAcaoGestaoEntidade(nomeAcao = "", descricao = "", precisaPermissao = false)
    LAB_COMPONENTES_MB_GERENCIAR,
    @InfoTipoAcaoFormulario(nomeAcao = "", descricao = "", precisaPermissao = false, campos = {"nome", "descricao"})
    LAB_COMPONENTES_FRM_LISTAR,
    @InfoTipoAcaoFormulario(nomeAcao = "", descricao = "", precisaPermissao = false)
    LAB_COMPONENTES_FRM_VISUALIZAR,
    @InfoTipoAcaoFormulario(nomeAcao = "", descricao = "", precisaPermissao = false)
    LAB_COMPONENTES_FRM_EDITAR,
    @InfoTipoAcaoFormulario(nomeAcao = "", descricao = "", precisaPermissao = false)
    LAB_COMPONENTES_FRM_FAMILIA_SELECIONADA_VISUALIZAR,
    @InfoTipoAcaoFormulario(nomeAcao = "", descricao = "", precisaPermissao = false)
    LAB_COMPONENTES_FRM_COMPONENTE_SELECIONADO_VISUALIZAR;

    @Override
    public AcaoDoSistema getRegistro() {

        return (AcaoDoSistema) UtilFabricaDeAcoesAcessosModel.getNovaAcao(this);

    }

    @Override
    public AcaoDoSistema getAcaoDoSistema() {

        return getRegistro();

    }

    @Override
    public Class getEntidadeDominio() {

        return ComponenteVisualSB.class;
    }

    @Override
    public String getNomeModulo() {

        return UtilFabricaDeAcoesAcessosModel.getModuloByFabrica(this).getNome();
    }

}
