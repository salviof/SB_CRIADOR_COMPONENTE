package org.coletivoJava.fw.projetos.SB_CRIADOR_COMPONENTE.api.model.usuariosistemaroot;

import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.ItensGenericos.basico.UsuarioSistemaRoot;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.anotacoes.InfoReferenciaEntidade;

@InfoReferenciaEntidade(tipoObjeto = UsuarioSistemaRoot.class)
public enum CPUsuarioSistemaRoot {
    _ID, _NOME, _DATAHORAALTERACAO, _DATAHORAINSERSAO, _USUARIOINSERCAO, _USUARIOALTERACAO;

    public static final String id = "id";
    public static final String nome = "nome";
    public static final String datahoraalteracao = "dataHoraAlteracao";
    public static final String datahorainsersao = "dataHoraInsersao";
    public static final String usuarioinsercao = "usuarioInsercao";
    public static final String usuarioalteracao = "usuarioAlteracao";
}
