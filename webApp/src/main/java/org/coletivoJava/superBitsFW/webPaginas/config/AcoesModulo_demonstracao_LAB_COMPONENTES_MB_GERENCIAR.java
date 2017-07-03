package org.coletivoJava.superBitsFW.webPaginas.config;

import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;
import com.super_bits.modulosSB.SBCore.UtilGeral.MapaAcoesSistema;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.permissoes.ItfAcaoFormularioEntidade;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.acoes.ItfAcaoControllerEntidade;

@Named
@ApplicationScoped
public class AcoesModulo_demonstracao_LAB_COMPONENTES_MB_GERENCIAR {

	public ItfAcaoFormularioEntidade getLab_componentes_mb_gerenciar() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoLabComponentes.LAB_COMPONENTES_MB_GERENCIAR");
	}

	public ItfAcaoFormularioEntidade getLab_componentes_frm_listar() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoLabComponentes.LAB_COMPONENTES_FRM_LISTAR");
	}

	public ItfAcaoFormularioEntidade getLab_componentes_frm_visualizar() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoLabComponentes.LAB_COMPONENTES_FRM_VISUALIZAR");
	}

	public ItfAcaoFormularioEntidade getLab_componentes_frm_visualizar_grupo_de_campos() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoLabComponentes.LAB_COMPONENTES_FRM_VISUALIZAR_GRUPO_DE_CAMPOS");
	}

	public ItfAcaoFormularioEntidade getLab_componentes_frm_editar() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoLabComponentes.LAB_COMPONENTES_FRM_EDITAR");
	}

	public ItfAcaoFormularioEntidade getLab_componentes_frm_visualizar_familia_selecionada() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoLabComponentes.LAB_COMPONENTES_FRM_VISUALIZAR_FAMILIA_SELECIONADA");
	}

	public ItfAcaoFormularioEntidade getLab_componentes_frm_visualizar_componente_selecionado() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoLabComponentes.LAB_COMPONENTES_FRM_VISUALIZAR_COMPONENTE_SELECIONADO");
	}

	public ItfAcaoFormularioEntidade getLab_componentes_frm_lab_input_ver() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoLabComponentes.LAB_COMPONENTES_FRM_LAB_INPUT_VER");
	}

	public ItfAcaoFormularioEntidade getLab_componentes_frm_lab_input_maskaras_personalizadas() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoLabComponentes.LAB_COMPONENTES_FRM_LAB_INPUT_MASKARAS_PERSONALIZADAS");
	}

	public ItfAcaoFormularioEntidade getLab_componentes_frm_lab_ficha_tecnica_input() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoLabComponentes.LAB_COMPONENTES_FRM_LAB_FICHA_TECNICA_INPUT");
	}

	public ItfAcaoFormularioEntidade getLab_componentes_frm_lab_input_lista_sub_formulario() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoLabComponentes.LAB_COMPONENTES_FRM_LAB_INPUT_LISTA_SUB_FORMULARIO");
	}

	public ItfAcaoFormularioEntidade getLab_componentes_frm_lab_input_onchange() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoLabComponentes.LAB_COMPONENTES_FRM_LAB_INPUT_ONCHANGE");
	}

	public ItfAcaoFormularioEntidade getLab_componentes_frm_lab_input_validacao() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoLabComponentes.LAB_COMPONENTES_FRM_LAB_INPUT_VALIDACAO");
	}

	public ItfAcaoFormularioEntidade getLab_componentes_frm_lab_grupo_campo_visualizar() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoLabComponentes.LAB_COMPONENTES_FRM_LAB_GRUPO_CAMPO_VISUALIZAR");
	}

	public ItfAcaoFormularioEntidade getLab_componentes_frm_lab_grupo_campo_testar_on_change_gpr() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoLabComponentes.LAB_COMPONENTES_FRM_LAB_GRUPO_CAMPO_TESTAR_ON_CHANGE_GPR");
	}

	public ItfAcaoFormularioEntidade getLab_componentes_frm_lab_grupo_campo_testar_on_change_form() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoLabComponentes.LAB_COMPONENTES_FRM_LAB_GRUPO_CAMPO_TESTAR_ON_CHANGE_FORM");
	}

	public ItfAcaoFormularioEntidade getLab_componentes_frm_lab_grupos_campo_visualizar() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoLabComponentes.LAB_COMPONENTES_FRM_LAB_GRUPOS_CAMPO_VISUALIZAR");
	}

	public ItfAcaoFormularioEntidade getLab_componentes_frm_lab_grupos_campo_testar_onchange_gpr() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoLabComponentes.LAB_COMPONENTES_FRM_LAB_GRUPOS_CAMPO_TESTAR_ONCHANGE_GPR");
	}

	public ItfAcaoFormularioEntidade getLab_componentes_frm_lab_grupos_campo_testar_onchange_frm() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoLabComponentes.LAB_COMPONENTES_FRM_LAB_GRUPOS_CAMPO_TESTAR_ONCHANGE_FRM");
	}

	public ItfAcaoFormularioEntidade getLab_componentes_frm_lab_grupos_formulario_grupo_exemplo_atualizacao_form() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoLabComponentes.LAB_COMPONENTES_FRM_LAB_GRUPOS_FORMULARIO_GRUPO_EXEMPLO_ATUALIZACAO_FORM");
	}

	public ItfAcaoFormularioEntidade getLab_componentes_frm_lab_grupos_formulario_grupo_exemplo_atualizacao_grupo_do_campo() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoLabComponentes.LAB_COMPONENTES_FRM_LAB_GRUPOS_FORMULARIO_GRUPO_EXEMPLO_ATUALIZACAO_GRUPO_DO_CAMPO");
	}

	public ItfAcaoFormularioEntidade getLab_componentes_frm_lab_grupos_formulario_grupo_exemplo_atualizacao_id() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoLabComponentes.LAB_COMPONENTES_FRM_LAB_GRUPOS_FORMULARIO_GRUPO_EXEMPLO_ATUALIZACAO_ID");
	}

	public ItfAcaoFormularioEntidade getLab_componentes_frm_lab_grupos_formulario_grupo_exemplo_atualizacao_campo() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoLabComponentes.LAB_COMPONENTES_FRM_LAB_GRUPOS_FORMULARIO_GRUPO_EXEMPLO_ATUALIZACAO_CAMPO");
	}

	public ItfAcaoFormularioEntidade getLab_componentes_frm_lab_formulario_ver() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoLabComponentes.LAB_COMPONENTES_FRM_LAB_FORMULARIO_VER");
	}

	public ItfAcaoControllerEntidade getLab_componentes_ctr_teste_justificativa() {
		return (ItfAcaoControllerEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoLabComponentes.LAB_COMPONENTES_CTR_TESTE_JUSTIFICATIVA");
	}

	public ItfAcaoControllerEntidade getLab_componentes_ctr_teste_comunicacao() {
		return (ItfAcaoControllerEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoLabComponentes.LAB_COMPONENTES_CTR_TESTE_COMUNICACAO");
	}
}