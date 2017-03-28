/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.config.webPaginas;

import com.super_bits.modulosSB.SBCore.modulos.ManipulaArquivo.interfaces.ItfCentralPermissaoArquivo;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.ItfCampoArquivoEntidadeInstanciado;
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
    public boolean isUsuarioPodeAlterar(ItfUsuario pUsuario, ItfCampoArquivoEntidadeInstanciado pArquivo) {
        return ((String) pArquivo.getCampoInstanciado().getValor()).contains(".txt");

    }

    @Override
    public boolean isUsuarioPodeBaixar(ItfUsuario pUsuario, ItfCampoArquivoEntidadeInstanciado pArquivo) {
        if (((String) pArquivo.getCampoInstanciado().getValor()).contains(".pdf")) {
            return false;
        }
        return true;
    }

    @Override
    public boolean isUsuarioPodeCriar(ItfUsuario pUsuario, ItfCampoArquivoEntidadeInstanciado pArquivo) {
        return true;
    }

}
