package org.coletivoJava.superBitsFW.webPaginas.config;

import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;
import com.super_bits.modulosSB.SBCore.UtilGeral.MapaAcoesSistema;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.permissoes.ItfAcaoFormularioEntidade;

@Named
@ApplicationScoped
public class AcoesPaginas_do_Sistema_PAGINA_MB_ERRO_CRITICO {

	public ItfAcaoFormularioEntidade getPagina_mb_erro_critico() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoPaginasDoSistema.PAGINA_MB_ERRO_CRITICO");
	}

	public ItfAcaoFormularioEntidade getPagina_mb_home() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoPaginasDoSistema.PAGINA_MB_HOME");
	}

	public ItfAcaoFormularioEntidade getPagina_mb_acesso_negado() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoPaginasDoSistema.PAGINA_MB_ACESSO_NEGADO");
	}

	public ItfAcaoFormularioEntidade getPagina_mb_view_expirou() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoPaginasDoSistema.PAGINA_MB_VIEW_EXPIROU");
	}

	public ItfAcaoFormularioEntidade getPagina_mb_login() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoPaginasDoSistema.PAGINA_MB_LOGIN");
	}

	public ItfAcaoFormularioEntidade getPagina_mb_pesquisa_avancada() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoPaginasDoSistema.PAGINA_MB_PESQUISA_AVANCADA");
	}
}