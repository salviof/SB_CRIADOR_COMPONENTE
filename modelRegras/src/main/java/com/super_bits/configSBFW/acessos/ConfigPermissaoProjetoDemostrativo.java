/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.configSBFW.acessos;

import com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.regras_de_negocio_e_controller.FabMenuCriadorComponente;
import com.super_bits.modulos.SBAcessosModel.model.UsuarioSB;
import com.super_bits.modulosSB.SBCore.ConfigGeral.SBCore;
import com.super_bits.modulosSB.SBCore.modulos.Controller.ConfigPermissaoSBCoreAbstrato;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.acoes.ItfAcaoDoSistema;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.permissoes.ItfPermissao;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.ItensGenericos.basico.UsuarioAnonimo;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.ItensGenericos.basico.UsuarioSistemaRoot;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfGrupoUsuario;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfUsuario;
import com.super_bits.modulosSB.SBCore.modulos.view.menu.MenusDaSessao;
import java.util.ArrayList;
import java.util.List;
import org.coletivoJava.fw.projetos.SB_CRIADOR_COMPONENTE.servico.ModuloDemonstracaoExemplo;

/**
 *
 * @author SalvioF
 */
public class ConfigPermissaoProjetoDemostrativo extends ConfigPermissaoSBCoreAbstrato {

    public ConfigPermissaoProjetoDemostrativo() {
        super(new Class[]{ModuloDemonstracaoExemplo.class});
    }

    @Override
    public List<ItfPermissao> configuraPermissoes() {
        return new ArrayList<>();
    }

    @Override
    public List<ItfUsuario> configuraUsuarios() {
        List<ItfUsuario> usuarios = new ArrayList<>();
        usuarios.add(new UsuarioSistemaRoot());
        UsuarioSB usuarioTEste = new UsuarioSB();
        usuarioTEste.setNome("Usuário Teste");
        usuarioTEste.setSenha("123");
        usuarioTEste.setEmail("teste@teste.com.br");
        usuarioTEste.setApelido("teste");
        usuarios.add(usuarioTEste);
        usuarios.add(usuarioTEste);
        usuarios.add(new UsuarioAnonimo());
        return usuarios;

    }

    @Override
    public MenusDaSessao definirMenu(ItfGrupoUsuario pGrupo) {
        return new MenusDaSessao(FabMenuCriadorComponente.MENU_INICIAL.getRegistro(), FabMenuCriadorComponente.MENU_RESTRITO.getRegistro());

    }

    @Override
    public void atualizarInformacoesDePermissoesDoSistema() {
        System.out.println("Nada a fazer");
    }

    @Override
    public boolean isAcaoPermitidaUsuarioLogado(ItfAcaoDoSistema acao) {
        if (SBCore.getUsuarioLogado().equals(new UsuarioAnonimo())) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public boolean isAcaoPermitidaUsuario(ItfUsuario pUsuario, ItfAcaoDoSistema acao) {
        if (SBCore.getUsuarioLogado().equals(new UsuarioAnonimo())) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public boolean isPermitidoUsuario(ItfUsuario pUsuario, ItfPermissao pPermissao) {
        if (SBCore.getUsuarioLogado().equals(new UsuarioAnonimo())) {
            return false;
        } else {
            return true;
        }
    }

}
