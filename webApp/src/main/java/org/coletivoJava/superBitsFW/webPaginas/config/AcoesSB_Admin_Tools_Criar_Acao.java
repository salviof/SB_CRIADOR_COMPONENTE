package org.coletivoJava.superBitsFW.webPaginas.config;

import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;
import com.super_bits.modulosSB.SBCore.UtilGeral.MapaAcoesSistema;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.permissoes.ItfAcaoFormularioEntidade;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.acoes.ItfAcaoControllerEntidade;

@Named
@ApplicationScoped
public class AcoesSB_Admin_Tools_Criar_Acao {

	public ItfAcaoFormularioEntidade getFERRAMENTAS_ACAO_MB_CRIAR() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.FERRAMENTAS_ACAO_MB_CRIAR");
	}

	public ItfAcaoFormularioEntidade getFERRAMENTAS_ACAO_FRM_DEF_NOME_SLUG_ACAO() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.FERRAMENTAS_ACAO_FRM_DEF_NOME_SLUG_ACAO");
	}

	public ItfAcaoFormularioEntidade getFERRAMENTAS_ACAO_FRM_ICONE_ACAO() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.FERRAMENTAS_ACAO_FRM_ICONE_ACAO");
	}

	public ItfAcaoFormularioEntidade getFERRAMENTAS_ACAO_FRM_XHTML_ACAO() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.FERRAMENTAS_ACAO_FRM_XHTML_ACAO");
	}

	public ItfAcaoFormularioEntidade getFERRAMENTAS_ACAO_FRM_OBJETO_ACAO() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.FERRAMENTAS_ACAO_FRM_OBJETO_ACAO");
	}

	public ItfAcaoFormularioEntidade getFERRAMENTAS_ACAO_FRM_NOME_E_DESCRICAO() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.FERRAMENTAS_ACAO_FRM_NOME_E_DESCRICAO");
	}

	public ItfAcaoControllerEntidade getFERRAMENTAS_ACAO_CTR_CRIAR() {
		return (ItfAcaoControllerEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.FERRAMENTAS_ACAO_CTR_CRIAR");
	}
}