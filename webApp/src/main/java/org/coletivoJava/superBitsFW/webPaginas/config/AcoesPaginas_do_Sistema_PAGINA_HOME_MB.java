package org.coletivoJava.superBitsFW.webPaginas.config;

import com.super_bits.modulosSB.SBCore.UtilGeral.MapaAcoesSistema;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.permissoes.ItfAcaoFormularioEntidade;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named
@ApplicationScoped
public class AcoesPaginas_do_Sistema_PAGINA_HOME_MB {

	public ItfAcaoFormularioEntidade getPAGINA_HOME_MB() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcoesHomeCriadorComponente.PAGINA_HOME_MB");
	}

	public ItfAcaoFormularioEntidade getPAGINA_HOME_FRM_DASHBOARD() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcoesHomeCriadorComponente.PAGINA_HOME_FRM_DASHBOARD");
	}

	public ItfAcaoFormularioEntidade getPAGINA_HOME_FRM_LOGIN() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcoesHomeCriadorComponente.PAGINA_HOME_FRM_LOGIN");
	}
}