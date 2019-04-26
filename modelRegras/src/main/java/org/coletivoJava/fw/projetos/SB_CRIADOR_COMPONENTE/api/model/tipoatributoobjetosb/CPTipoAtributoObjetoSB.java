package org.coletivoJava.fw.projetos.SB_CRIADOR_COMPONENTE.api.model.tipoatributoobjetosb;

import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.TipoAtributoObjetoSB;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.anotacoes.InfoReferenciaEntidade;

@InfoReferenciaEntidade(tipoObjeto = TipoAtributoObjetoSB.class)
public enum CPTipoAtributoObjetoSB {
	_TIPOCAMPO, _TIPOVALOR, _TIPOORIGEMVALOR, _TIPOVISUALIZACAO, _SOMENTELEITURA, _NOME, _MASCARA, _VALORPADRAO, _LABELPADRAO, _DESCRICAO, _SEGURANCA, _LISTADEOPCOES, _OBRIGATORIO, _VALORMAXIMO, _VALORMINIMO, _VALIDACAOREGEX, _SEPARADORDECIAMAL, _SEPARADORMILHAR, _NUMCASASDECIMAIS, _FRASEVALIDACAO;

	public static final String tipocampo = "tipoCampo";
	public static final String tipovalor = "tipoValor";
	public static final String tipoorigemvalor = "tipoOrigemValor";
	public static final String tipovisualizacao = "tipoVisualizacao";
	public static final String somenteleitura = "somenteLeitura";
	public static final String nome = "nome";
	public static final String mascara = "mascara";
	public static final String valorpadrao = "valorPadrao";
	public static final String labelpadrao = "labelPadrao";
	public static final String descricao = "descricao";
	public static final String seguranca = "seguranca";
	public static final String listadeopcoes = "listaDeOpcoes";
	public static final String obrigatorio = "obrigatorio";
	public static final String valormaximo = "valorMaximo";
	public static final String valorminimo = "valorMinimo";
	public static final String validacaoregex = "validacaoRegex";
	public static final String separadordeciamal = "separadorDeciamal";
	public static final String separadormilhar = "separadorMilhar";
	public static final String numcasasdecimais = "numCasasDecimais";
	public static final String frasevalidacao = "fraseValidacao";
}