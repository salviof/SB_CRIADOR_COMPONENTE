package org.coletivoJava.superBitsFW.webPaginas.config;

import com.super_bits.modulosSB.SBCore.UtilGeral.MapaAcoesSistema;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.acoes.ItfAcaoControllerEntidade;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.permissoes.ItfAcaoFormularioEntidade;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named
@ApplicationScoped
public class AcoesSB_Admin_Tools_Banco_de_Dados {

	public ItfAcaoFormularioEntidade getFERRAMENTAS_BANCO_MB() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.FERRAMENTAS_BANCO_MB");
	}

	public ItfAcaoFormularioEntidade getFERRAMENTAS_BANCO_FRM_IMPORTADOR() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.FERRAMENTAS_BANCO_FRM_IMPORTADOR");
	}

	public ItfAcaoFormularioEntidade getFERRAMENTAS_BANCO_FRM_ENVIAR_ARQUIVO_IMPORTACAO() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.FERRAMENTAS_BANCO_FRM_ENVIAR_ARQUIVO_IMPORTACAO");
	}

	public ItfAcaoFormularioEntidade getFERRAMENTAS_BANCO_FRM_MAPEAR_COLUNAS() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.FERRAMENTAS_BANCO_FRM_MAPEAR_COLUNAS");
	}

	public ItfAcaoFormularioEntidade getFERRAMENTAS_BANCO_FRM_RELATORIO_IMPORTACAO() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.FERRAMENTAS_BANCO_FRM_RELATORIO_IMPORTACAO");
	}

	public ItfAcaoFormularioEntidade getFERRAMENTAS_BANCO_FRM_LISTAR_DADOS() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.FERRAMENTAS_BANCO_FRM_LISTAR_DADOS");
	}

	public ItfAcaoFormularioEntidade getFERRAMENTAS_BANCO_FRM_EDITAR_SQL() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.FERRAMENTAS_BANCO_FRM_EDITAR_SQL");
	}

	public ItfAcaoFormularioEntidade getFERRAMENTAS_BANCO_FRM_EDITAR_HQL() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.FERRAMENTAS_BANCO_FRM_EDITAR_HQL");
	}

	public ItfAcaoControllerEntidade getFERRAMENTAS_BANCO_CTR_LISTAR_SQL() {
		return (ItfAcaoControllerEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.FERRAMENTAS_BANCO_CTR_LISTAR_SQL");
	}

	public ItfAcaoControllerEntidade getFERRAMENTAS_BANCO_CTR_PERSISTIR() {
		return (ItfAcaoControllerEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.FERRAMENTAS_BANCO_CTR_PERSISTIR");
	}

	public ItfAcaoControllerEntidade getFERRAMENTAS_BANCO_CTR_PROCESSAR_DADOS_IMP() {
		return (ItfAcaoControllerEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.FERRAMENTAS_BANCO_CTR_PROCESSAR_DADOS_IMP");
	}

	public ItfAcaoControllerEntidade getFERRAMENTAS_BANCO_CTR_GRAVAR_DADOS_IMP() {
		return (ItfAcaoControllerEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.FERRAMENTAS_BANCO_CTR_GRAVAR_DADOS_IMP");
	}

	public ItfAcaoControllerEntidade getFERRAMENTAS_BANCO_CTR_LISTAR_HQL() {
		return (ItfAcaoControllerEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.FERRAMENTAS_BANCO_CTR_LISTAR_HQL");
	}

	public ItfAcaoFormularioEntidade getFERRAMENTAS_BANCO_FRM_CRIAR_CONSULTA() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.FERRAMENTAS_BANCO_FRM_CRIAR_CONSULTA");
	}
}