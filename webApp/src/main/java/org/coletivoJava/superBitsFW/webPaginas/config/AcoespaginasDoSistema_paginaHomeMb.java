package org.coletivoJava.superBitsFW.webPaginas.config;

import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;
import java.io.Serializable;
import com.super_bits.modulosSB.SBCore.UtilGeral.MapaAcoesSistema;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.permissoes.ItfAcaoFormulario;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.permissoes.ItfAcaoFormularioEntidade;

@Named
@ApplicationScoped
public class AcoespaginasDoSistema_paginaHomeMb implements Serializable {

	public ItfAcaoFormulario getPagina_home_mb() {
		return (ItfAcaoFormulario) MapaAcoesSistema
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