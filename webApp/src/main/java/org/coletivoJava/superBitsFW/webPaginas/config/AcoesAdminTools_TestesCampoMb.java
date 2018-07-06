package org.coletivoJava.superBitsFW.webPaginas.config;

import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;
import java.io.Serializable;
import com.super_bits.modulosSB.SBCore.UtilGeral.MapaAcoesSistema;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.permissoes.ItfAcaoFormulario;

@Named
@ApplicationScoped
public class AcoesAdminTools_TestesCampoMb implements Serializable {

	public ItfAcaoFormulario getTestesCampoMb() {
		return (ItfAcaoFormulario) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoDemonstracaoSB.TESTES_CAMPO_MB");
	}
}