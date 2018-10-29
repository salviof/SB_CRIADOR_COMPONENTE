package org.coletivoJava.fw.projetos.SB_CRIADOR_COMPONENTE.api.model.tipoatributoobjetosb;

import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.TipoAtributoObjetoSB;
import com.super_bits.modulosSB.SBCore.modulos.objetos.validador.InfoReferenciaEntidade;

@InfoReferenciaEntidade(tipoObjeto = TipoAtributoObjetoSB.class)
public enum CPTipoAtributoObjetoSB {
	_TIPOCAMPO, _TIPOVALOR, _TIPOORIGEMVALOR, _TIPOVISUALIZACAO, _SOMENTELEITURA, _NOME, _MASCARA, _VALORPADRAO, _LABELPADRAO, _DESCRICAO, _SEGURANCA, _LISTADEOPCOES, _OBRIGATORIO, _VALORMAXIMO, _VALORMINIMO, _VALIDACAOREGEX, _SEPARADORDECIAMAL, _SEPARADORMILHAR, _NUMCASASDECIMAIS, _FRASEVALIDACAO;

	static final String tipocampo = "tipoCampo";
	static final String tipovalor = "tipoValor";
	static final String tipoorigemvalor = "tipoOrigemValor";
	static final String tipovisualizacao = "tipoVisualizacao";
	static final String somenteleitura = "somenteLeitura";
	static final String nome = "nome";
	static final String mascara = "mascara";
	static final String valorpadrao = "valorPadrao";
	static final String labelpadrao = "labelPadrao";
	static final String descricao = "descricao";
	static final String seguranca = "seguranca";
	static final String listadeopcoes = "listaDeOpcoes";
	static final String obrigatorio = "obrigatorio";
	static final String valormaximo = "valorMaximo";
	static final String valorminimo = "valorMinimo";
	static final String validacaoregex = "validacaoRegex";
	static final String separadordeciamal = "separadorDeciamal";
	static final String separadormilhar = "separadorMilhar";
	static final String numcasasdecimais = "numCasasDecimais";
	static final String frasevalidacao = "fraseValidacao";
}