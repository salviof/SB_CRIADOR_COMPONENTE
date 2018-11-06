package org.coletivoJava.fw.projetos.SB_CRIADOR_COMPONENTE.api.model.sbinfoconfigmodulo;

import com.super_bits.modulosSB.SBCore.ConfigGeral.model.SbInfoConfigModulo;
import com.super_bits.modulosSB.SBCore.modulos.objetos.validador.InfoReferenciaEntidade;

@InfoReferenciaEntidade(tipoObjeto = SbInfoConfigModulo.class)
public enum CPSbInfoConfigModulo {
	_ID, _NOMEMODULO;

	public static final String id = "id";
	public static final String nomemodulo = "nomeModulo";
}