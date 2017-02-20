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
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.icones.FabIconeFontAwesome;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.ComponenteVisualSB;

/**
 *
 * @author desenvolvedor
 */
@InfoModuloSB_CRIADOR_COMPONENTE(modulo = FabModulosIProjetoTesteI.DEMONSTRACAO_BASICA)
public enum FabAcaoLabComponentes implements ItfFabricaAcoes {

    @InfoTipoAcaoGestaoEntidade(nomeAcao = "", descricao = "", precisaPermissao = false)
    LAB_COMPONENTES_MB_GERENCIAR,
    @InfoTipoAcaoFormulario(nomeAcao = "", descricao = "", precisaPermissao = false, campos = {"nome", "descricao", "familia"})
    LAB_COMPONENTES_FRM_LISTAR,
    @InfoTipoAcaoFormulario(nomeAcao = "", descricao = "", precisaPermissao = false)
    LAB_COMPONENTES_FRM_VISUALIZAR,
    @InfoTipoAcaoFormulario(nomeAcao = "", descricao = "", precisaPermissao = false)
    LAB_COMPONENTES_FRM_EDITAR,
    @InfoTipoAcaoFormulario(nomeAcao = "", descricao = "", precisaPermissao = false)
    LAB_COMPONENTES_FRM_FAMILIA_SELECIONADA_VISUALIZAR,
    @InfoTipoAcaoFormulario(nomeAcao = "", descricao = "", precisaPermissao = false, iconeFonteAnsowame = FabIconeFontAwesome.REG_VISUALIZAR)
    LAB_COMPONENTES_FRM_COMPONENTE_SELECIONADO_VISUALIZAR,
    @InfoTipoAcaoFormulario(nomeAcao = "Ver Componente", descricao = "", precisaPermissao = false, iconeFonteAnsowame = FabIconeFontAwesome.REG_VISUALIZAR)
    LAB_COMPONENTES_FRM_LAB_VER,
    @InfoTipoAcaoFormulario(nomeAcao = "Editar Mascaras Personalizadas", descricao = "", precisaPermissao = false, iconeFonteAnsowame = FabIconeFontAwesome.REG_VISUALIZAR)
    LAB_COMPONENTES_FRM_LAB_MASKARAS_PERSONALIZADAS,
    @InfoTipoAcaoFormulario(nomeAcao = "Ver Ficha Técnica", descricao = "", precisaPermissao = false, iconeFonteAnsowame = FabIconeFontAwesome.REG_VALIDAR)
    LAB_COMPONENTES_FRM_LAB_FICHA_TECNICA,
    @InfoTipoAcaoFormulario(nomeAcao = "Testar OnChange", descricao = "", precisaPermissao = false, iconeFonteAnsowame = FabIconeFontAwesome.REG_VALIDAR)
    LAB_COMPONENTES_FRM_LAB_ONCHANGE,
    @InfoTipoAcaoFormulario(nomeAcao = "Testar Validacao", descricao = "", precisaPermissao = false, iconeFonteAnsowame = FabIconeFontAwesome.REG_VALIDAR)
    LAB_COMPONENTES_FRM_LAB_VALIDACAO;

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
