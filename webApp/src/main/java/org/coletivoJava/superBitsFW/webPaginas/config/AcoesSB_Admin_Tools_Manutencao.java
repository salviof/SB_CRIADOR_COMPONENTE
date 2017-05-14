package org.coletivoJava.superBitsFW.webPaginas.config;

import com.super_bits.modulosSB.SBCore.UtilGeral.MapaAcoesSistema;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.permissoes.ItfAcaoFormularioEntidade;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named
@ApplicationScoped
public class AcoesSB_Admin_Tools_Manutencao {

	public ItfAcaoFormularioEntidade getDEV_PROJETO_ADMIN_MB() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.DEV_PROJETO_ADMIN_MB");
	}
}