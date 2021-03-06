package org.coletivoJava.fw.projetos.SB_CRIADOR_COMPONENTE.api.model.componentevisualinputlayoutsb;

import org.coletivojava.fw.api.objetoNativo.view.componente.ComponenteVisualInputLayoutSB;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.anotacoes.InfoReferenciaEntidade;

@InfoReferenciaEntidade(tipoObjeto = ComponenteVisualInputLayoutSB.class)
public enum CPComponenteVisualInputLayoutSB {
	_ESTILOTABELA, _ESTILOLINHAS, _ESTILOCOLUNAS, _ESTILOLINHASLEITURA, _ESTILOCOLUNASLEITURA;

	public static final String estilotabela = "estiloTabela";
	public static final String estilolinhas = "estiloLinhas";
	public static final String estilocolunas = "estiloColunas";
	public static final String estilolinhasleitura = "estiloLinhasLeitura";
	public static final String estilocolunasleitura = "estiloColunasLeitura";
}