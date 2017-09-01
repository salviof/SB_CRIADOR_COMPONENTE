/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.config.webPaginas;

import com.super_bits.modulosSB.SBCore.ConfigGeral.SBCore;
import com.super_bits.modulosSB.SBCore.modulos.ManipulaArquivo.interfaces.ItfCentralPermissaoArquivo;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campoInstanciado.ItfCampoInstArquivoEntidade;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfUsuario;

/**
 *
 * Configurador de permissão do projeto SBCriadorDeComponentes
 *
 *
 * Libera permissao para tudo, caso o arquivo seja um TXT, Caso contrario
 * Liberar apenas baixar
 *
 * Caso seja um pdf não libera nem baixar
 *
 *
 * @author desenvolvedor
 */
public class CentralPermissaoArquivoSBComponente implements ItfCentralPermissaoArquivo {

    @Override
    public boolean isUsuarioPodeAlterar(ItfUsuario pUsuario, ItfCampoInstArquivoEntidade pArquivo) {
        try {
            return ((String) pArquivo.getCampoInstanciado().getValor()).contains(".txt");
        } catch (Throwable t) {
            return true;
        }

    }

    @Override
    public boolean isUsuarioPodeBaixar(ItfUsuario pUsuario, ItfCampoInstArquivoEntidade pArquivo) {
        if (((String) pArquivo.getCampoInstanciado().getValor()).contains(".pdf")) {
            return false;
        }
        return true;
    }

    @Override
    public boolean isUsuarioPodeCriar(ItfUsuario pUsuario, ItfCampoInstArquivoEntidade pArquivo) {
        return true;
    }

    @Override
    public boolean isUsuarioLogadoPodeAlterar(ItfCampoInstArquivoEntidade pArquivo) {
        return isUsuarioPodeAlterar(SBCore.getUsuarioLogado(), pArquivo);
    }

    @Override
    public boolean isUsuarioLogadoPodeBaixar(ItfCampoInstArquivoEntidade pArquivo) {
        return isUsuarioPodeBaixar(SBCore.getUsuarioLogado(), pArquivo);
    }

    @Override
    public boolean isUsuarioLogadoPodeCriar(ItfCampoInstArquivoEntidade pArquivo) {
        return isUsuarioPodeCriar(SBCore.getUsuarioLogado(), pArquivo);
    }

}
