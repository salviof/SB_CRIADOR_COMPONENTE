package org.coletivoJava.superBitsFW.webPaginas.config;

import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;
import com.super_bits.modulosSB.SBCore.UtilGeral.MapaAcoesSistema;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.permissoes.ItfAcaoFormularioEntidade;

@Named
@ApplicationScoped
public class AcoesSB_Admin_Tools_Variaveis_de_Ambiente {

	public ItfAcaoFormularioEntidade getFERRAMENTAS_CONFIG_MB() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.FERRAMENTAS_CONFIG_MB");
	}

	public ItfAcaoFormularioEntidade getFERRAMENTAS_CONFIG_FRM_SBPROJETO() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.FERRAMENTAS_CONFIG_FRM_SBPROJETO");
	}

	public ItfAcaoFormularioEntidade getFERRAMENTAS_CONFIG_FRM_CONFIGURACOES_GERAIS() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.FERRAMENTAS_CONFIG_FRM_CONFIGURACOES_GERAIS");
	}
}