/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.SB_CRIADOR_COMPONENTE.paginas;

import com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.regras_de_negocio_e_controller.dominioBeanExemploTeste.FabAcaoBeanExemploDemonstrativo;
import com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.regras_de_negocio_e_controller.dominioBeanExemploTeste.InfoAcaoBeamExemploDemo;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.ItensGenericos.basico.UsuarioAnonimo;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.ItensGenericos.basico.UsuarioOSistema;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.ItensGenericos.basico.UsuarioSistemaRoot;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.anotacoes.InfoCampo;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.FabTipoAtributoObjeto;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfBeanSimples;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfUsuario;
import com.super_bits.modulosSB.webPaginas.JSFManagedBeans.formularios.MB_PaginaConversation;
import com.super_bits.modulosSB.webPaginas.JSFManagedBeans.formularios.reflexao.anotacoes.InfoPagina;
import com.super_bits.modulosSB.webPaginas.JSFManagedBeans.formularios.reflexao.anotacoes.beans.InfoMB_Bean;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author desenvolvedor
 */
@InfoPagina(nomeCurto = "TCM", tags = "Testes Comunicacao")
@InfoAcaoBeamExemploDemo(acao = FabAcaoBeanExemploDemonstrativo.COMUNICACAO_MB)
@Named
@ViewScoped
public class PgTestesComunicacao extends MB_PaginaConversation {

    private List<ItfUsuario> usuarios;
    @InfoMB_Bean(descricao = "")
    @InfoCampo(tipo = FabTipoAtributoObjeto.OBJETO_DE_UMA_LISTA, caminhoParaLista = "usuarios")
    private ItfUsuario usuarioDEstino;
    private ItfUsuario usuarioOrigem;

    private String mesnsagem;

    @PostConstruct
    public void inicio() {
        usuarios = new ArrayList<>();
        usuarios.add(new UsuarioAnonimo());
        usuarios.add(new UsuarioSistemaRoot());
        usuarios.add(new UsuarioOSistema());
        executaAcaoSelecionadaPorEnum(FabAcaoBeanExemploDemonstrativo.COMUNICACAO_FRM_ENVIAR_MENSAGEM);
    }

    @Override
    public ItfBeanSimples getBeanSelecionado() {
        //    SBCore.getCentralDeComunicacao().gerarComunicacaoEntre_Usuairos(FabTipoComunicacao.NOTIFICAR, usuarioDEstino, pDestinatario, mesnsagem, tiposTransporte)
        return null;
    }

    @Override
    public void setBeanSelecionado(ItfBeanSimples pBeanSimples) {

    }

}
