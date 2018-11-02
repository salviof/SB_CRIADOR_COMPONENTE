package org.coletivoJava.fw.projetos.SB_CRIADOR_COMPONENTE.implemetation.model.beanexemplo;

import com.super_bits.modulosSB.SBCore.modulos.objetos.listas.ListaDinamicaGenerica;
import org.coletivoJava.fw.projetos.SB_CRIADOR_COMPONENTE.api.model.beanexemplo.ListaBeanExemplo;
import org.coletivoJava.fw.projetos.SB_CRIADOR_COMPONENTE.api.model.beanexemplo.ListasBeanExemplo;
import com.super_bits.modulosSB.SBCore.ConfigGeral.SBCore;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campoInstanciado.ItfCampoInstanciado;
import com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.model.BeanExemplo;
import com.super_bits.modulosSB.SBCore.modulos.objetos.validador.InfoReferenciaEntidade;

@ListaBeanExemplo(lista = ListasBeanExemplo.LISTADINAMICAALEATORIA)
@InfoReferenciaEntidade(tipoObjeto = BeanExemplo.class)
public class ListaBeanExemploListaDinamicaAleatoria
		extends
			ListaDinamicaGenerica {

	ListaBeanExemploListaDinamicaAleatoria(ItfCampoInstanciado pCampo) {
		super(pCampo);
	}
}