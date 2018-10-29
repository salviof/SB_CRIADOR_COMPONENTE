package org.coletivoJava.fw.projetos.SB_CRIADOR_COMPONENTE.api.model.componentevisualinputlayoutsb;

import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.input.ComponenteVisualInputLayoutSB;
import com.super_bits.modulosSB.SBCore.modulos.objetos.validador.InfoReferenciaEntidade;

@InfoReferenciaEntidade(tipoObjeto = ComponenteVisualInputLayoutSB.class)
public enum CPComponenteVisualInputLayoutSB {
	_ESTILOTABELA, _ESTILOLINHAS, _ESTILOCOLUNAS, _ESTILOLINHASLEITURA, _ESTILOCOLUNASLEITURA;

	static final String estilotabela = "estiloTabela";
	static final String estilolinhas = "estiloLinhas";
	static final String estilocolunas = "estiloColunas";
	static final String estilolinhasleitura = "estiloLinhasLeitura";
	static final String estilocolunasleitura = "estiloColunasLeitura";
}