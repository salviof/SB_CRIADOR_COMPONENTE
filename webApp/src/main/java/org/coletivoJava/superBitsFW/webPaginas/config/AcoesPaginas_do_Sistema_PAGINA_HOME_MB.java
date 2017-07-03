package org.coletivoJava.superBitsFW.webPaginas.config;

import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;
import com.super_bits.modulosSB.SBCore.UtilGeral.MapaAcoesSistema;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.permissoes.ItfAcaoFormularioEntidade;

@Named
@ApplicationScoped
public class AcoesPaginas_do_Sistema_PAGINA_HOME_MB {

	public ItfAcaoFormularioEntidade getPagina_home_mb() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcoesHomeCriadorComponente.PAGINA_HOME_MB");
	}

	public ItfAcaoFormularioEntidade getPagina_home_frm_dashboard() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcoesHomeCriadorComponente.PAGINA_HOME_FRM_DASHBOARD");
	}

	public ItfAcaoFormularioEntidade getPagina_home_frm_login() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcoesHomeCriadorComponente.PAGINA_HOME_FRM_LOGIN");
	}
}