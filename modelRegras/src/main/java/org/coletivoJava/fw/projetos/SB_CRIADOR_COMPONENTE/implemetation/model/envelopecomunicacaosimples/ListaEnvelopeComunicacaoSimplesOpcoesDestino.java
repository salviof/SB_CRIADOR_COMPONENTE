package org.coletivoJava.fw.projetos.SB_CRIADOR_COMPONENTE.implemetation.model.envelopecomunicacaosimples;

import com.super_bits.modulosSB.SBCore.modulos.objetos.listas.ListaDinamicaGenerica;
import org.coletivoJava.fw.projetos.SB_CRIADOR_COMPONENTE.api.model.envelopecomunicacaosimples.ListaEnvelopeComunicacaoSimples;
import org.coletivoJava.fw.projetos.SB_CRIADOR_COMPONENTE.api.model.envelopecomunicacaosimples.ListasEnvelopeComunicacaoSimples;
import com.super_bits.modulosSB.SBCore.ConfigGeral.SBCore;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campoInstanciado.ItfCampoInstanciado;

@ListaEnvelopeComunicacaoSimples(lista = ListasEnvelopeComunicacaoSimples.OPCOESDESTINO)
public class ListaEnvelopeComunicacaoSimplesOpcoesDestino
		extends
			ListaDinamicaGenerica {

	ListaEnvelopeComunicacaoSimplesOpcoesDestino(ItfCampoInstanciado pCampo) {
		super(pCampo);
	}
}