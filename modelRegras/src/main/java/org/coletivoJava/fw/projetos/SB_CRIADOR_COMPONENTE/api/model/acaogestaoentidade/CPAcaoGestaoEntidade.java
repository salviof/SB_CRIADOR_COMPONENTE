package org.coletivoJava.fw.projetos.SB_CRIADOR_COMPONENTE.api.model.acaogestaoentidade;

import com.super_bits.modulos.SBAcessosModel.model.acoes.acaoDeEntidade.AcaoGestaoEntidade;
import com.super_bits.modulosSB.SBCore.modulos.objetos.validador.InfoReferenciaEntidade;

@InfoReferenciaEntidade(tipoObjeto = AcaoGestaoEntidade.class)
public enum CPAcaoGestaoEntidade {
	_UTILIZARMESMOFORMEDITARINSERIR, _ENUMACOESVINCULADAS;

	static final String utilizarmesmoformeditarinserir = "utilizarMesmoFormEditarInserir";
	static final String enumacoesvinculadas = "enumAcoesVinculadas";
}