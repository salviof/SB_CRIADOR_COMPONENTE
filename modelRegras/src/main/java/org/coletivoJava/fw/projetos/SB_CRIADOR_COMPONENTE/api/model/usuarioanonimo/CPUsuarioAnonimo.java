package org.coletivoJava.fw.projetos.SB_CRIADOR_COMPONENTE.api.model.usuarioanonimo;

import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.ItensGenericos.basico.UsuarioAnonimo;
import com.super_bits.modulosSB.SBCore.modulos.objetos.validador.InfoReferenciaEntidade;

@InfoReferenciaEntidade(tipoObjeto = UsuarioAnonimo.class)
public enum CPUsuarioAnonimo {
	_ID, _NOME, _DATAHORAALTERACAO, _DATAHORAINSERSAO, _USUARIOINSERCAO, _USUARIOALTERACAO;

	static final String id = "id";
	static final String nome = "nome";
	static final String datahoraalteracao = "dataHoraAlteracao";
	static final String datahorainsersao = "dataHoraInsersao";
	static final String usuarioinsercao = "usuarioInsercao";
	static final String usuarioalteracao = "usuarioAlteracao";
}