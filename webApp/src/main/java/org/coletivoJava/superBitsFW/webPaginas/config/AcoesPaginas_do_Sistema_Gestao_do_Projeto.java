package org.coletivoJava.superBitsFW.webPaginas.config;

import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;
import com.super_bits.modulosSB.SBCore.UtilGeral.MapaAcoesSistema;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.permissoes.ItfAcaoFormularioEntidade;

@Named
@ApplicationScoped
public class AcoesPaginas_do_Sistema_Gestao_do_Projeto {

	public ItfAcaoFormularioEntidade getPROJETO_MB_GERENCIAR() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoProjetoSB.PROJETO_MB_GERENCIAR");
	}

	public ItfAcaoFormularioEntidade getPROJETO_FRM_VISUALIZAR_ACOES() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoProjetoSB.PROJETO_FRM_VISUALIZAR_ACOES");
	}

	public ItfAcaoFormularioEntidade getPROJETO_FRM_VISUALIZAR_BANCO_DE_DADOS() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoProjetoSB.PROJETO_FRM_VISUALIZAR_BANCO_DE_DADOS");
	}

	public ItfAcaoFormularioEntidade getPROJETO_FRM_VISUALIZAR_TABELA() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoProjetoSB.PROJETO_FRM_VISUALIZAR_TABELA");
	}

	public ItfAcaoFormularioEntidade getPROJETO_FRM_VISAO_GERAL() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoProjetoSB.PROJETO_FRM_VISAO_GERAL");
	}
}