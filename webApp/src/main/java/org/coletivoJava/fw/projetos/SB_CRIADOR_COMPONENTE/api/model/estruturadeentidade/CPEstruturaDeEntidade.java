package org.coletivoJava.fw.projetos.SB_CRIADOR_COMPONENTE.api.model.estruturadeentidade;

import com.super_bits.modulosSB.SBCore.modulos.geradorCodigo.model.EstruturaDeEntidade;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.anotacoes.InfoReferenciaEntidade;

@InfoReferenciaEntidade(tipoObjeto = EstruturaDeEntidade.class)
public enum CPEstruturaDeEntidade {
    _ID, _LISTAENUM, _NOMEENTIDADE, _CAMPOS, _MUITOSPARAUM, _UMPARAMUITOS, _MUITOSPARAMUITOS, _TAGS, _PLURAL, _ICONE, _TIPOENTIDADE, _CALCULOS, _LISTAS, _MAPACAMPO, _DESCRICAO, _CONFIGUROULIGACOES;

    public static final String id = "id";
    public static final String listaenum = "listaEnum";
    public static final String nomeentidade = "nomeEntidade";
    public static final String campos = "campos";
    public static final String muitosparaum = "muitosParaUm";
    public static final String umparamuitos = "umParaMuitos";
    public static final String muitosparamuitos = "muitosParaMuitos";
    public static final String tags = "tags";
    public static final String plural = "plural";
    public static final String icone = "icone";
    public static final String tipoentidade = "tipoEntidade";
    public static final String calculos = "calculos";
    public static final String listas = "listas";
    public static final String mapacampo = "mapaCampo";
    public static final String descricao = "descricao";
    public static final String configurouligacoes = "configurouLigacoes";
}
