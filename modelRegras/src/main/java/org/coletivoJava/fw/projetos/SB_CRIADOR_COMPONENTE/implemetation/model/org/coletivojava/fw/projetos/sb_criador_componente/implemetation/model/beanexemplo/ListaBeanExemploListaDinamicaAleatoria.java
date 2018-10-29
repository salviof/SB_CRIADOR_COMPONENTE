package org.coletivoJava.fw.projetos.SB_CRIADOR_COMPONENTE.implemetation.model.org.coletivojava.fw.projetos.sb_criador_componente.implemetation.model.beanexemplo;

import com.super_bits.modulosSB.SBCore.modulos.objetos.listas.ListaDinamicaGenerica;
import org.coletivoJava.fw.projetos.SB_CRIADOR_COMPONENTE.api.model.beanexemplo.ListaBeanExemplo;
import org.coletivoJava.fw.projetos.SB_CRIADOR_COMPONENTE.api.model.beanexemplo.ListasBeanExemplo;
import com.super_bits.modulosSB.SBCore.ConfigGeral.SBCore;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campoInstanciado.ItfCampoInstanciado;

@ListaBeanExemplo(lista = ListasBeanExemplo.LISTADINAMICAALEATORIA)
public class ListaBeanExemploListaDinamicaAleatoria
		extends
			ListaDinamicaGenerica {

	ListaBeanExemploListaDinamicaAleatoria(ItfCampoInstanciado pCampo) {
		super(pCampo);
	}
}