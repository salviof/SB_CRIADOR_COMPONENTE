package org.coletivoJava.superBitsFW.webPaginas.config;

import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;
import java.io.Serializable;
import com.super_bits.modulosSB.SBCore.UtilGeral.MapaAcoesSistema;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.permissoes.ItfAcaoFormulario;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.permissoes.ItfAcaoFormularioEntidade;

@Named
@ApplicationScoped
public class AcoesAdminTools_ComunicacaoMb implements Serializable {

	public ItfAcaoFormulario getComunicacaoMb() {
		return (ItfAcaoFormulario) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoBeanExemploDemonstrativo.COMUNICACAO_MB");
	}

	public ItfAcaoFormularioEntidade getComunicacaoFrmEnviarMensagem() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoBeanExemploDemonstrativo.COMUNICACAO_FRM_ENVIAR_MENSAGEM");
	}
}