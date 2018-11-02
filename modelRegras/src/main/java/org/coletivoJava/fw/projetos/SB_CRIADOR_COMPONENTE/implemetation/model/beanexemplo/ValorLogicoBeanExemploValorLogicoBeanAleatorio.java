package org.coletivoJava.fw.projetos.SB_CRIADOR_COMPONENTE.implemetation.model.beanexemplo;

import com.super_bits.modulosSB.SBCore.modulos.objetos.calculos.ValorLogicoCalculoGenerico;
import org.coletivoJava.fw.projetos.SB_CRIADOR_COMPONENTE.api.model.beanexemplo.ValorLogicoBeanExemplo;
import org.coletivoJava.fw.projetos.SB_CRIADOR_COMPONENTE.api.model.beanexemplo.ValoresLogicosBeanExemplo;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campoInstanciado.ItfCampoInstanciado;
import com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.model.BeanExemplo;
import com.super_bits.modulosSB.SBCore.modulos.objetos.validador.InfoReferenciaEntidade;

@InfoReferenciaEntidade(tipoObjeto = BeanExemplo.class)
@ValorLogicoBeanExemplo(calculo = ValoresLogicosBeanExemplo.VALORLOGICOBEANALEATORIO)
public class ValorLogicoBeanExemploValorLogicoBeanAleatorio
		extends
			ValorLogicoCalculoGenerico {

	ValorLogicoBeanExemploValorLogicoBeanAleatorio(ItfCampoInstanciado pCampo) {
		super(pCampo);
	}
}