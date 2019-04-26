package org.coletivoJava.fw.projetos.SB_CRIADOR_COMPONENTE.api.model.envelopecomunicacaosimples;

import com.super_bits.modulosSB.SBCore.modulos.comunicacao.EnvelopeComunicacaoSimples;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.anotacoes.InfoReferenciaEntidade;

@InfoReferenciaEntidade(tipoObjeto = EnvelopeComunicacaoSimples.class)
public enum CPEnvelopeComunicacaoSimples {
	_ID, _DESTINATARIO, _REMETENTE, _ASSUNTO, _TEXTO, _OPCOESDESTINO;

	public static final String id = "id";
	public static final String destinatario = "destinatario";
	public static final String remetente = "remetente";
	public static final String assunto = "assunto";
	public static final String texto = "texto";
	public static final String opcoesdestino = "opcoesDestino";
}