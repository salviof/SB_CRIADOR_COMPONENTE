/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.model.mapaComponentes;

import com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.model.BeanExemplo;
import com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.regras_de_negocio_e_controller.FabModulosIProjetoTesteI;
import com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.regras_de_negocio_e_controller.InfoModuloSB_CRIADOR_COMPONENTE;
import com.super_bits.modulos.SBAcessosModel.model.acoes.AcaoDoSistema;
import com.super_bits.modulos.SBAcessosModel.model.acoes.UtilFabricaDeAcoesAcessosModel;
import com.super_bits.modulosSB.SBCore.modulos.Controller.anotacoes.InfoTipoAcaoController;
import com.super_bits.modulosSB.SBCore.modulos.Controller.anotacoes.InfoTipoAcaoFormCamposAtualizaCampoEspecifico;
import com.super_bits.modulosSB.SBCore.modulos.Controller.anotacoes.InfoTipoAcaoFormCamposAtualizaComponentePeloId;
import com.super_bits.modulosSB.SBCore.modulos.Controller.anotacoes.InfoTipoAcaoFormCamposAtualizaForm;
import com.super_bits.modulosSB.SBCore.modulos.Controller.anotacoes.InfoTipoAcaoFormCamposAtualizaGrupoDoCampo;
import com.super_bits.modulosSB.SBCore.modulos.Controller.anotacoes.InfoTipoAcaoFormulario;
import com.super_bits.modulosSB.SBCore.modulos.Controller.anotacoes.InfoTipoAcaoGestaoEntidade;
import com.super_bits.modulosSB.SBCore.modulos.comunicacao.FabTipoComunicacao;
import com.super_bits.modulosSB.SBCore.modulos.fabrica.ItfFabricaAcoes;

import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.icones.FabIconeFontAwesome;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.ComponenteVisualSB;

/**
 *
 * @author desenvolvedor
 */
@InfoModuloSB_CRIADOR_COMPONENTE(modulo = FabModulosIProjetoTesteI.DEMONSTRACAO_BASICA)
public enum FabAcaoLabComponentes implements ItfFabricaAcoes {

    @InfoTipoAcaoGestaoEntidade(precisaPermissao = false)
    LAB_COMPONENTES_MB_GERENCIAR,
    @InfoTipoAcaoFormulario(precisaPermissao = false, campos = {"nome", "descricao", "familia"})
    LAB_COMPONENTES_FRM_LISTAR,
    @InfoTipoAcaoFormulario(precisaPermissao = false)
    LAB_COMPONENTES_FRM_VISUALIZAR,
    @InfoTipoAcaoFormulario(precisaPermissao = false)
    LAB_COMPONENTES_FRM_VISUALIZAR_GRUPO_DE_CAMPOS,
    @InfoTipoAcaoFormulario(precisaPermissao = false)
    LAB_COMPONENTES_FRM_EDITAR,
    @InfoTipoAcaoFormulario(precisaPermissao = false)
    LAB_COMPONENTES_FRM_VISUALIZAR_FAMILIA_SELECIONADA,
    @InfoTipoAcaoFormulario(precisaPermissao = false, iconeFonteAnsowame = FabIconeFontAwesome.REG_VISUALIZAR)
    LAB_COMPONENTES_FRM_VISUALIZAR_COMPONENTE_SELECIONADO,
    @InfoTipoAcaoFormulario(nomeAcao = "Ver Input", descricao = "",
            precisaPermissao = false, iconeFonteAnsowame = FabIconeFontAwesome.REG_VISUALIZAR,
            xhtmlDaAcao = "formVERInput.xhtml"
    )
    LAB_COMPONENTES_FRM_LAB_INPUT_VER,
    @InfoTipoAcaoFormulario(nomeAcao = "Visualizar Ambiente Real", iconeFonteAnsowame = FabIconeFontAwesome.REG_VISUALIZAR)
    LAB_COMPONENTES_FRM_LAB_CAMPO_ENDERECO_VISUALIZAR,
    @InfoTipoAcaoFormulario(nomeAcao = "Visualizar Ambiente Laboratorio", iconeFonteAnsowame = FabIconeFontAwesome.REG_VISUALIZAR)
    LAB_COMPONENTES_FRM_LAB_CAMPO_ENDERECO_BEAN_ENDERECAVEL_VISUALIZAR,
    @InfoTipoAcaoFormulario(nomeAcao = "Editar Mascaras Personalizadas", descricao = "",
            precisaPermissao = false, iconeFonteAnsowame = FabIconeFontAwesome.REG_VISUALIZAR,
            xhtmlDaAcao = "formLabMascarasInput.xhtml"
    )
    LAB_COMPONENTES_FRM_LAB_INPUT_MASKARAS_PERSONALIZADAS,
    @InfoTipoAcaoFormulario(nomeAcao = "Ver Ficha Técnica", descricao = "", precisaPermissao = false,
            iconeFonteAnsowame = FabIconeFontAwesome.REG_VALIDAR,
            xhtmlDaAcao = "formFichaTecnicaInput.xhtml"
    )
    LAB_COMPONENTES_FRM_LAB_FICHA_TECNICA_INPUT,
    @InfoTipoAcaoFormulario(nomeAcao = "Testar SubFormulario", descricao = "",
            xhtmlDaAcao = "formSubFormulario.xhtml",
            precisaPermissao = false, iconeFonteAnsowame = FabIconeFontAwesome.REG_VALIDAR)
    LAB_COMPONENTES_FRM_LAB_INPUT_LISTA_SUB_FORMULARIO,
    @InfoTipoAcaoFormulario(nomeAcao = "Testar Input OnChange", descricao = "",
            xhtmlDaAcao = "formONCHANGEInput.xhtml",
            precisaPermissao = false, iconeFonteAnsowame = FabIconeFontAwesome.REG_VALIDAR)
    LAB_COMPONENTES_FRM_LAB_INPUT_ONCHANGE,
    @InfoTipoAcaoFormulario(nomeAcao = "Testar Validacao", descricao = "", precisaPermissao = false, iconeFonteAnsowame = FabIconeFontAwesome.REG_VALIDAR)
    LAB_COMPONENTES_FRM_LAB_INPUT_VALIDACAO,
    @InfoTipoAcaoFormulario(nomeAcao = "Visualizar Grupo", iconeFonteAnsowame = FabIconeFontAwesome.REG_AGRUPAR_REGISTROS)
    LAB_COMPONENTES_FRM_LAB_GRUPO_CAMPO_VISUALIZAR,
    @InfoTipoAcaoFormulario(nomeAcao = "Testar Grupo OnchangeGrupo", iconeFonteAnsowame = FabIconeFontAwesome.REG_AGRUPAR_REGISTROS)
    LAB_COMPONENTES_FRM_LAB_GRUPO_CAMPO_TESTAR_ON_CHANGE_GPR,
    @InfoTipoAcaoFormulario(nomeAcao = "Testar Grupo Onchange @Form", iconeFonteAnsowame = FabIconeFontAwesome.REG_AGRUPAR_REGISTROS)
    LAB_COMPONENTES_FRM_LAB_GRUPO_CAMPO_TESTAR_ON_CHANGE_FORM,
    @InfoTipoAcaoFormulario(nomeAcao = "visualizar Grupos", iconeFonteAnsowame = FabIconeFontAwesome.REG_AGRUPAR_REGISTROS)
    LAB_COMPONENTES_FRM_LAB_GRUPOS_CAMPO_VISUALIZAR,
    @InfoTipoAcaoFormulario(nomeAcao = "Testar Grupos Onchange Grupo", iconeFonteAnsowame = FabIconeFontAwesome.REG_AGRUPAR_REGISTROS)
    LAB_COMPONENTES_FRM_LAB_GRUPOS_CAMPO_TESTAR_ONCHANGE_GPR,
    @InfoTipoAcaoFormulario(nomeAcao = "Testar Grupos Onchange @Form", iconeFonteAnsowame = FabIconeFontAwesome.REG_AGRUPAR_REGISTROS)
    LAB_COMPONENTES_FRM_LAB_GRUPOS_CAMPO_TESTAR_ONCHANGE_FRM,
    @InfoTipoAcaoFormulario(
            nomeAcao = "Exempplo Atualizacao Form",
            iconeFonteAnsowame = FabIconeFontAwesome.REG_EDITAR,
            campos = {"[separador: Dados Basicos]", "id", "email", "descritivo", "campoVinculado3",
                "[separador: Grupo com Atualizacao]", "campoVinculado1", "campoVinculado2",
                "[separador: Mascaras Identificadoras]", "inscricaoEstadual", "inscricaoEstadual", "inscricaoEstadual", "inscricaoEstadual"},
            entidade = BeanExemplo.class
    )
    @InfoTipoAcaoFormCamposAtualizaForm(campos = {"campoVinculado1", "campoVinculado2"})
    LAB_COMPONENTES_FRM_LAB_GRUPOS_FORMULARIO_GRUPO_EXEMPLO_ATUALIZACAO_FORM,
    @InfoTipoAcaoFormulario(
            nomeAcao = "Exempplo Atualização Grupo Camnpo",
            iconeFonteAnsowame = FabIconeFontAwesome.REG_EDITAR,
            campos = {"[separador: Dados Basicos]", "id", "email", "descritivo", "campoVinculado3",
                "[separador: Grupo com Atualizacao]", "campoVinculado1", "campoVinculado2",
                "[separador: Mascaras Identificadoras]", "inscricaoEstadual", "inscricaoEstadual", "inscricaoEstadual", "inscricaoEstadual"},
            entidade = BeanExemplo.class
    )
    @InfoTipoAcaoFormCamposAtualizaGrupoDoCampo(campos = {"campoVinculado1", "campoVinculado2"})
    LAB_COMPONENTES_FRM_LAB_GRUPOS_FORMULARIO_GRUPO_EXEMPLO_ATUALIZACAO_GRUPO_DO_CAMPO,
    @InfoTipoAcaoFormulario(
            nomeAcao = "Exempplo Id especidico id_atualizacao_teste",
            iconeFonteAnsowame = FabIconeFontAwesome.REG_EDITAR,
            campos = {"[separador: Dados Basicos]", "id", "email", "descritivo", "campoVinculado3",
                "[separador: Grupo com Atualizacao]", "campoVinculado1", "campoVinculado2",
                "[separador: Mascaras Identificadoras]", "inscricaoEstadual", "inscricaoEstadual", "inscricaoEstadual", "inscricaoEstadual"},
            entidade = BeanExemplo.class
    )
    @InfoTipoAcaoFormCamposAtualizaComponentePeloId(nomeID = "id_atualizacao_teste", campos = {"campoVinculado1", "campoVinculado2"})
    LAB_COMPONENTES_FRM_LAB_GRUPOS_FORMULARIO_GRUPO_EXEMPLO_ATUALIZACAO_ID,
    @InfoTipoAcaoFormulario(
            nomeAcao = "Exempplo Campo especifico",
            iconeFonteAnsowame = FabIconeFontAwesome.REG_EDITAR,
            campos = {"[separador: Dados Basicos]", "id", "email", "descritivo", "campoVinculado1",
                "[separador: Grupo com Atualizacao]", "campoVinculado2",
                "[separador: Mascaras Identificadoras]", "inscricaoEstadual", "inscricaoEstadual", "inscricaoEstadual", "inscricaoEstadual"},
            entidade = BeanExemplo.class
    )
    @InfoTipoAcaoFormCamposAtualizaCampoEspecifico(campoAtualizarAposAlterar = "campoVinculado1", campos = {"campoVinculado2"})

    LAB_COMPONENTES_FRM_LAB_GRUPOS_FORMULARIO_GRUPO_EXEMPLO_ATUALIZACAO_CAMPO,
    @InfoTipoAcaoFormulario(nomeAcao = "Ver ação de formulário", iconeFonteAnsowame = FabIconeFontAwesome.REG_AGRUPAR_REGISTROS)
    LAB_COMPONENTES_FRM_LAB_FORMULARIO_VER,
    @InfoTipoAcaoController(campoJustificativa = "seletorOpcao", comunicacao = FabTipoComunicacao.PERGUNTAR_SIM_OU_NAO)
    LAB_COMPONENTES_CTR_TESTE_JUSTIFICATIVA,
    @InfoTipoAcaoController(fraseComunicação = "", comunicacao = FabTipoComunicacao.PERGUNTAR_SIM_OU_NAO)
    LAB_COMPONENTES_CTR_TESTE_COMUNICACAO;

    @Override
    public AcaoDoSistema getRegistro() {

        return (AcaoDoSistema) UtilFabricaDeAcoesAcessosModel.getNovaAcao(this);

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
