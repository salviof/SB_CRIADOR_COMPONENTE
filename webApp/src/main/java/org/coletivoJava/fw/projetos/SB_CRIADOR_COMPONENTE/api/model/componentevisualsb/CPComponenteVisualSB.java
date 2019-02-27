package org.coletivoJava.fw.projetos.SB_CRIADOR_COMPONENTE.api.model.componentevisualsb;

import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.anotacoes.InfoReferenciaEntidade;
import org.coletivojava.fw.api.objetoNativo.view.componente.ComponenteVisualBase;

@InfoReferenciaEntidade(tipoObjeto = ComponenteVisualBase.class)
public enum CPComponenteVisualSB {
    _ID, _NOME, _DESCRICAO, _PARAMETROS, _XHTMLJSF, _XHTMLJSFCAMINHORELATIVO, _XHTMLANDROID, _HTMLWORDPRESS, _NOMECOMPONENTE, _FAMILIA, _IDHTMLOBJETOPRINCIPAL, _CLASSECSS, _FABRICADOCOMPONENTE, _CAMINHOFABRICA, _PESOLARGURA;

    public static final String id = "id";
    public static final String nome = "nome";
    public static final String descricao = "descricao";
    public static final String parametros = "parametros";
    public static final String xhtmljsf = "xhtmlJSF";
    public static final String xhtmljsfcaminhorelativo = "xhtmlJsfCaminhoRelativo";
    public static final String xhtmlandroid = "xhtmlAndroid";
    public static final String htmlwordpress = "htmlWordPress";
    public static final String nomecomponente = "nomeComponente";
    public static final String familia = "familia";
    public static final String idhtmlobjetoprincipal = "idHTMLObjetoPrincipal";
    public static final String classecss = "classeCSS";
    public static final String fabricadocomponente = "fabricaDoComponente";
    public static final String caminhofabrica = "caminhoFabrica";
    public static final String pesolargura = "pesoLargura";
}
