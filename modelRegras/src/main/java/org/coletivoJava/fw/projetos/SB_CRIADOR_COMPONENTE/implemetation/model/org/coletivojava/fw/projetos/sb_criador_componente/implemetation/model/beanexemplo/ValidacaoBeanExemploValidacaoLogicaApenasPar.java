package org.coletivoJava.fw.projetos.SB_CRIADOR_COMPONENTE.implemetation.model.org.coletivojava.fw.projetos.sb_criador_componente.implemetation.model.beanexemplo;

import com.super_bits.modulosSB.SBCore.modulos.objetos.validador.ValidacaoGenerica;
import org.coletivoJava.fw.projetos.SB_CRIADOR_COMPONENTE.api.model.beanexemplo.ValidadorBeanExemplo;
import org.coletivoJava.fw.projetos.SB_CRIADOR_COMPONENTE.api.model.beanexemplo.ValidadoresBeanExemplo;
import com.super_bits.modulosSB.SBCore.ConfigGeral.SBCore;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campoInstanciado.ItfCampoInstanciado;

@ValidadorBeanExemplo(validador = ValidadoresBeanExemplo.VALIDACAOLOGICAAPENASPAR)
public class ValidacaoBeanExemploValidacaoLogicaApenasPar
		extends
			ValidacaoGenerica {

	ValidacaoBeanExemploValidacaoLogicaApenasPar(ItfCampoInstanciado pCampo) {
		super(pCampo);
	}

	@Override
	public Object getValidacao(java.lang.Object o) {
		SBCore.getCentralDeMensagens()
				.enviarMsgErroAoUsuario(
						"A Validação do campo  Validacao Logica Apenas Par não foi implementada");
		return o;
	}

	@Override
	public Object validarModoEdicao(java.lang.Object o) {
		SBCore.getCentralDeMensagens()
				.enviarMsgErroAoUsuario(
						"A Validação do campo  Validacao Logica Apenas Par não foi implementada");
		return o;
	}

	@Override
	public Object validarModoNovo(java.lang.Object o) {
		SBCore.getCentralDeMensagens()
				.enviarMsgErroAoUsuario(
						"A Validação do campo  Validacao Logica Apenas Par não foi implementada");
		return o;
	}
}