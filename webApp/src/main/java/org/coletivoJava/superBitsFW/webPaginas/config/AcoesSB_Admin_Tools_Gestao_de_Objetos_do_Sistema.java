package org.coletivoJava.superBitsFW.webPaginas.config;

import com.super_bits.modulosSB.SBCore.UtilGeral.MapaAcoesSistema;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.permissoes.ItfAcaoFormularioEntidade;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named
@ApplicationScoped
public class AcoesSB_Admin_Tools_Gestao_de_Objetos_do_Sistema {

	public ItfAcaoFormularioEntidade getDEV_OBJ_PROJETO_MB_LAB() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_MB_LAB");
	}

	public ItfAcaoFormularioEntidade getDEV_OBJ_PROJETO_FRM_VER_CAMPO() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_FRM_VER_CAMPO");
	}

	public ItfAcaoFormularioEntidade getDEV_OBJ_PROJETO_FRM_VER_CAMPO_EM_TODOS_FORMATOS() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_FRM_VER_CAMPO_EM_TODOS_FORMATOS");
	}

	public ItfAcaoFormularioEntidade getDEV_OBJ_PROJETO_FRM_TESTAR_ONCHANGE() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_FRM_TESTAR_ONCHANGE");
	}

	public ItfAcaoFormularioEntidade getDEV_OBJ_PROJETO_FRM_LABORARATORIO() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_FRM_LABORARATORIO");
	}

	public ItfAcaoFormularioEntidade getDEV_OBJ_PROJETO_FRM_INSTRUCOES() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_FRM_INSTRUCOES");
	}

	public ItfAcaoFormularioEntidade getDEV_OBJ_PROJETO_FRM_CAMPO_IDS() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_FRM_CAMPO_IDS");
	}

	public ItfAcaoFormularioEntidade getDEV_OBJ_PROJETO_FRM_INSP_POSICOES() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_FRM_INSP_POSICOES");
	}

	public ItfAcaoFormularioEntidade getDEV_OBJ_PROJETO_FRM_VER_CAMPOS_DA_ACAO_FORMULARIO() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_FRM_VER_CAMPOS_DA_ACAO_FORMULARIO");
	}

	public ItfAcaoFormularioEntidade getDEV_OBJ_PROJETO_FRM_VER_CAMPOS_DO_GRUPO_FORMULARIO() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_FRM_VER_CAMPOS_DO_GRUPO_FORMULARIO");
	}

	public ItfAcaoFormularioEntidade getDEV_OBJ_PROJETO_FRM_INSPECIONAR() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_FRM_INSPECIONAR");
	}

	public ItfAcaoFormularioEntidade getDEV_OBJ_PROJETO_FRM_FICHATECNICA() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_FRM_FICHATECNICA");
	}

	public ItfAcaoFormularioEntidade getDEV_OBJ_PROJETO_FRM_INSPECIONARINPUT() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_FRM_INSPECIONARINPUT");
	}

	public ItfAcaoFormularioEntidade getDEV_OBJ_PROJETO_FRM_SELECAO_TIPO_LABORATORIO() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_FRM_SELECAO_TIPO_LABORATORIO");
	}

	public ItfAcaoFormularioEntidade getDEV_OBJ_PROJETO_FRM_INSPECIONAR_COMPONENTE_VISUAL() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_FRM_INSPECIONAR_COMPONENTE_VISUAL");
	}

	public ItfAcaoFormularioEntidade getDEV_OBJ_PROJETO_FRM_INSPECIONAR_OBJETOS() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_FRM_INSPECIONAR_OBJETOS");
	}

	public ItfAcaoFormularioEntidade getDEV_OBJ_PROJETO_FRM_SELECAO_OBJETOS() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_FRM_SELECAO_OBJETOS");
	}

	public ItfAcaoFormularioEntidade getDEV_OBJ_PROJETO_FRM_FERRAMENTAS() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_FRM_FERRAMENTAS");
	}

	public ItfAcaoFormularioEntidade getDEV_OBJ_PROJETO_FRM_SELECAO_ACAO() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_FRM_SELECAO_ACAO");
	}

	public ItfAcaoFormularioEntidade getDEV_OBJ_PROJETO_FRM_SELECAO_CAMPO() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_FRM_SELECAO_CAMPO");
	}
}