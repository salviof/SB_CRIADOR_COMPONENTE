package org.coletivoJava.fw.projetos.SB_CRIADOR_COMPONENTE.implemetation.model.beanexemplo;

import com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.model.BeanExemplo;
import com.super_bits.modulosSB.SBCore.modulos.objetos.validador.ValidacaoGenerica;
import org.coletivoJava.fw.projetos.SB_CRIADOR_COMPONENTE.api.model.beanexemplo.ValidadorBeanExemplo;
import org.coletivoJava.fw.projetos.SB_CRIADOR_COMPONENTE.api.model.beanexemplo.ValidadoresBeanExemplo;
import com.super_bits.modulosSB.SBCore.ConfigGeral.SBCore;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campoInstanciado.ItfCampoInstanciado;
import com.super_bits.modulosSB.SBCore.modulos.objetos.validador.ErroValidacao;

@ValidadorBeanExemplo(validador = ValidadoresBeanExemplo.VALIDACAOLOGICAAPENASPAR)
public class ValidacaoBeanExemploValidacaoLogicaApenasPar
		extends
			ValidacaoGenerica<BeanExemplo> {

	public ValidacaoBeanExemploValidacaoLogicaApenasPar(
			ItfCampoInstanciado pCampo) {
		super(pCampo);
	}

	@Override
	public Object validar(java.lang.Object o) throws ErroValidacao {
		SBCore.getCentralDeMensagens()
				.enviarMsgErroAoUsuario(
						"A Validação do campo  Validacao Logica Apenas Par não foi implementada");
		return o;
	}

	public BeanExemplo getBeanExemplo() {
		return getObjetoDoAtributo();
	}
}