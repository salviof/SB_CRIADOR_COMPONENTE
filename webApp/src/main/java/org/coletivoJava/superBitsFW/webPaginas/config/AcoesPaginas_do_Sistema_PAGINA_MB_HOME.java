package org.coletivoJava.superBitsFW.webPaginas.config;

import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;
import com.super_bits.modulosSB.SBCore.UtilGeral.MapaAcoesSistema;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.permissoes.ItfAcaoFormularioEntidade;

@Named
@ApplicationScoped
public class AcoesPaginas_do_Sistema_PAGINA_MB_HOME {

	public ItfAcaoFormularioEntidade getPAGINA_MB_HOME() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoPaginasDoSistema.PAGINA_MB_HOME");
	}

	public ItfAcaoFormularioEntidade getPAGINA_MB_ACESSO_NEGADO() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoPaginasDoSistema.PAGINA_MB_ACESSO_NEGADO");
	}

	public ItfAcaoFormularioEntidade getPAGINA_MB_VIEW_EXPIROU() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoPaginasDoSistema.PAGINA_MB_VIEW_EXPIROU");
	}

	public ItfAcaoFormularioEntidade getPAGINA_MB_LOGIN() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoPaginasDoSistema.PAGINA_MB_LOGIN");
	}

	public ItfAcaoFormularioEntidade getPAGINA_MB_ERRO_CRITICO() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoPaginasDoSistema.PAGINA_MB_ERRO_CRITICO");
	}
}