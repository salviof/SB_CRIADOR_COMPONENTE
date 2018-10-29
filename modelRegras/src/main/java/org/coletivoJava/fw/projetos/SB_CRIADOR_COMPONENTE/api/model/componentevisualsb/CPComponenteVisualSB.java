package org.coletivoJava.fw.projetos.SB_CRIADOR_COMPONENTE.api.model.componentevisualsb;

import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.ComponenteVisualSB;
import com.super_bits.modulosSB.SBCore.modulos.objetos.validador.InfoReferenciaEntidade;

@InfoReferenciaEntidade(tipoObjeto = ComponenteVisualSB.class)
public enum CPComponenteVisualSB {
	_ID, _NOME, _DESCRICAO, _PARAMETROS, _XHTMLJSF, _XHTMLJSFCAMINHORELATIVO, _XHTMLANDROID, _HTMLWORDPRESS, _NOMECOMPONENTE, _FAMILIA, _IDHTMLOBJETOPRINCIPAL, _CLASSECSS, _FABRICADOCOMPONENTE, _CAMINHOFABRICA, _PESOLARGURA;

	static final String id = "id";
	static final String nome = "nome";
	static final String descricao = "descricao";
	static final String parametros = "parametros";
	static final String xhtmljsf = "xhtmlJSF";
	static final String xhtmljsfcaminhorelativo = "xhtmlJsfCaminhoRelativo";
	static final String xhtmlandroid = "xhtmlAndroid";
	static final String htmlwordpress = "htmlWordPress";
	static final String nomecomponente = "nomeComponente";
	static final String familia = "familia";
	static final String idhtmlobjetoprincipal = "idHTMLObjetoPrincipal";
	static final String classecss = "classeCSS";
	static final String fabricadocomponente = "fabricaDoComponente";
	static final String caminhofabrica = "caminhoFabrica";
	static final String pesolargura = "pesoLargura";
}