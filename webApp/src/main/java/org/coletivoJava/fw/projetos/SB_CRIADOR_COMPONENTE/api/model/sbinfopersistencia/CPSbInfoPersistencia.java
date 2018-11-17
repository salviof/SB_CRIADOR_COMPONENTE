package org.coletivoJava.fw.projetos.SB_CRIADOR_COMPONENTE.api.model.sbinfopersistencia;

import com.super_bits.modulosSB.SBCore.ConfigGeral.model.SbInfoPersistencia;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.anotacoes.InfoReferenciaEntidade;

@InfoReferenciaEntidade(tipoObjeto = SbInfoPersistencia.class)
public enum CPSbInfoPersistencia {
    _ID, _DESCRICAO;

    public static final String id = "id";
    public static final String descricao = "descricao";
}
