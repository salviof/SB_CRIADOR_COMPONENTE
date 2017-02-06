package org.coletivoJava.superBitsFW.webPaginas.config;

import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;
import com.super_bits.modulosSB.SBCore.UtilGeral.MapaAcoesSistema;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.permissoes.ItfAcaoFormularioEntidade;

@Named
@ApplicationScoped
public class AcoesSB_Admin_Tools_DEMONSTRACAO_MB_COMPONENTE {

	public ItfAcaoFormularioEntidade getDEMONSTRACAO_MB_COMPONENTE() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoDemonstracaoSB.DEMONSTRACAO_MB_COMPONENTE");
	}

	public ItfAcaoFormularioEntidade getDEMONSTRACAO_MB_RECURSOS() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoDemonstracaoSB.DEMONSTRACAO_MB_RECURSOS");
	}

	public ItfAcaoFormularioEntidade getDEMONSTRACAO_MB_VALIDACAO() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoDemonstracaoSB.DEMONSTRACAO_MB_VALIDACAO");
	}
}