package org.coletivoJava.fw.projetos.SB_CRIADOR_COMPONENTE.api.model.componentevisualsbbean;

import com.super_bits.modulosSB.SBCore.modulos.view.componenteAtributo.ComponenteVisualSBBean;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.anotacoes.InfoReferenciaEntidade;

@InfoReferenciaEntidade(tipoObjeto = ComponenteVisualSBBean.class)
public enum CPComponenteVisualSBBean {
	_BASE, _ID, _NOME, _DESCRICAO, _FAMILIA;

	public static final String base = "base";
	public static final String id = "id";
	public static final String nome = "nome";
	public static final String descricao = "descricao";
	public static final String familia = "familia";
}