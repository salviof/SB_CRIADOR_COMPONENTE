/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.regras_de_negocio_e_controller.paginasIniciais;

import com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.model.informacao.ConteudoGenerico;
import com.super_bits.modulos.SBAcessosModel.controller.FabModulosSistemaSB;
import com.super_bits.modulos.SBAcessosModel.controller.InfoModulosSistemaSB;
import com.super_bits.modulos.SBAcessosModel.model.acoes.AcaoDoSistema;
import com.super_bits.modulos.SBAcessosModel.model.acoes.UtilFabricaDeAcoesAcessosModel;
import com.super_bits.modulosSB.SBCore.modulos.Controller.anotacoes.InfoTipoAcaoFormulario;
import com.super_bits.modulosSB.SBCore.modulos.Controller.anotacoes.InfoTipoAcaoGestaoEntidade;
import com.super_bits.modulosSB.SBCore.modulos.fabrica.ItfFabricaAcoes;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.icones.FabIconeFontAwesome;

/**
 *
 * @author desenvolvedor
 */
@InfoModulosSistemaSB(modulo = FabModulosSistemaSB.PAGINAS_DO_SISTEMA)
public enum FabAcoesHomeCriadorComponente implements ItfFabricaAcoes {
    @InfoTipoAcaoGestaoEntidade(xhtmlDaAcao = "/site/home.xhtml", iconeFonteAnsowame = FabIconeFontAwesome.COMERCIO_PRESENTE)
    PAGINA_HOME_MB_INICIO,
    @InfoTipoAcaoFormulario(iconeFonteAnsowame = FabIconeFontAwesome.REG_AGRUPAR_REGISTROS, xhtmlDaAcao = "/site/ferramentasCriacao.xhtml")
    PAGINA_HOME_FRM_DASHBOARD,
    @InfoTipoAcaoFormulario(iconeFonteAnsowame = FabIconeFontAwesome.SISTEMA_USUARIO, xhtmlDaAcao = "/site/homeLogin.xhtml")
    PAGINA_HOME_FRM_LOGIN;

    @Override
    public AcaoDoSistema getRegistro() {
        return (AcaoDoSistema) UtilFabricaDeAcoesAcessosModel.getNovaAcao(this);
    }

    @Override
    public Class getEntidadeDominio() {
        return ConteudoGenerico.class;
    }

    @Override
    public String getNomeModulo() {
        return UtilFabricaDeAcoesAcessosModel.getModuloByFabrica(this).getNome();
    }

}
