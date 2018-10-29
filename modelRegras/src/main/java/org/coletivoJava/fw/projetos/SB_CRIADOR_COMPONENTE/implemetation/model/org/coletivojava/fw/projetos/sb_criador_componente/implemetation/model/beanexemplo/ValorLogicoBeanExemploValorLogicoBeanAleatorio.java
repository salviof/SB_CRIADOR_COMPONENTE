package org.coletivoJava.fw.projetos.SB_CRIADOR_COMPONENTE.implemetation.model.org.coletivojava.fw.projetos.sb_criador_componente.implemetation.model.beanexemplo;

import com.super_bits.modulosSB.SBCore.modulos.objetos.calculos.ValorLogicoCalculoGenerico;
import org.coletivoJava.fw.projetos.SB_CRIADOR_COMPONENTE.api.model.beanexemplo.ValorLogicoBeanExemplo;
import org.coletivoJava.fw.projetos.SB_CRIADOR_COMPONENTE.api.model.beanexemplo.ValoresLogicosBeanExemplo;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campoInstanciado.ItfCampoInstanciado;

@ValorLogicoBeanExemplo(calculo = ValoresLogicosBeanExemplo.VALORLOGICOBEANALEATORIO)
public class ValorLogicoBeanExemploValorLogicoBeanAleatorio
		extends
			ValorLogicoCalculoGenerico {

	ValorLogicoBeanExemploValorLogicoBeanAleatorio(ItfCampoInstanciado pCampo) {
		super(pCampo);
	}
}