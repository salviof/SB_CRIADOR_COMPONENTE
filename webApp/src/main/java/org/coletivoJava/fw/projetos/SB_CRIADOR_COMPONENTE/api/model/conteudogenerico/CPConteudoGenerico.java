package org.coletivoJava.fw.projetos.SB_CRIADOR_COMPONENTE.api.model.conteudogenerico;

import com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.model.informacao.ConteudoGenerico;
import com.super_bits.modulosSB.SBCore.modulos.objetos.validador.InfoReferenciaEntidade;

@InfoReferenciaEntidade(tipoObjeto = ConteudoGenerico.class)
public enum CPConteudoGenerico {
	_ID, _NOME, _NOMELONGO, _DESCRICAO;

	public static final String id = "id";
	public static final String nome = "nome";
	public static final String nomelongo = "nomeLongo";
	public static final String descricao = "descricao";
}