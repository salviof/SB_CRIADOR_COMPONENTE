package org.coletivoJava.superBitsFW.webPaginas.config;

import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;
import java.io.Serializable;
import com.super_bits.modulosSB.SBCore.UtilGeral.MapaAcoesSistema;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.permissoes.ItfAcaoFormulario;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.permissoes.ItfAcaoFormularioEntidade;

@Named
@ApplicationScoped
public class AcoesPaginasDoSistema_PaginaHomeMbInicio implements Serializable {

	public ItfAcaoFormulario getPaginaHomeMbInicio() {
		return (ItfAcaoFormulario) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcoesHomeCriadorComponente.PAGINA_HOME_MB_INICIO");
	}

	public ItfAcaoFormularioEntidade getPaginaHomeFrmDashboard() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcoesHomeCriadorComponente.PAGINA_HOME_FRM_DASHBOARD");
	}

	public ItfAcaoFormularioEntidade getPaginaHomeFrmLogin() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcoesHomeCriadorComponente.PAGINA_HOME_FRM_LOGIN");
	}
}