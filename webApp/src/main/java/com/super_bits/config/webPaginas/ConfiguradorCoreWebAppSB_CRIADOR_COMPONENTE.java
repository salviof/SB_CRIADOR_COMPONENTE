/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.config.webPaginas;

import com.google.common.collect.Lists;
import com.super_bits.FabAcoesHomeCriadorComponente;
import com.super_bits.Super_Bits.SB_AdminTools.regras_de_negocio_e_controller.admin_developer.FabAcaoAdminDeveloper;
import com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.regras_de_negocio_e_controller.dominioBeanExemploTeste.FabAcaoBeanExemploDemonstrativo;
import com.super_bits.configSBFW.acessos.UtilSB_CRIADOR_COMPONENTEGlobalVar;
import com.super_bits.modulos.SBAcessosModel.fabricas.FabAcaoProjetoSB;
import com.super_bits.modulos.SBAcessosModel.fabricas.acoesDemonstracao.FabAcaoDemonstracaoSB;
import com.super_bits.modulosSB.SBCore.ConfigGeral.ItfConfiguracaoCoreCustomizavel;
import com.super_bits.modulosSB.SBCore.modulos.fabrica.ItfFabricaAcoes;
import com.super_bits.modulosSB.SBCore.modulos.localizacao.CentralDeLocalizacaoSemPersistencia;
import com.super_bits.modulosSB.webPaginas.ConfigGeral.ConfiguradorCoreDeProjetoWebWarAbstrato;
import com.super_bits.modulosSB.webPaginas.centralAtributo.CentralAtributosWebappSemPersistencia;
import com.super_bits.modulosSB.webPaginas.controller.paginasDoSistema.FabAcaoPaginasDoSistema;
import java.util.List;
import javax.servlet.ServletContext;

/**
 *
 * @author salvioF
 */
public class ConfiguradorCoreWebAppSB_CRIADOR_COMPONENTE extends ConfiguradorCoreDeProjetoWebWarAbstrato {

    public ConfiguradorCoreWebAppSB_CRIADOR_COMPONENTE(ServletContext contexto) {

        super(contexto);
        //setIgnorarConfiguracaoPermissoes(true);
    }

    public ConfiguradorCoreWebAppSB_CRIADOR_COMPONENTE() {
        super(true);
        // setIgnorarConfiguracaoPermissoes(true);
    }

    @Override
    public void defineFabricasDeACao(ItfConfiguracaoCoreCustomizavel pConfig) {

        //setIgnorarConfiguracaoPermissoes(true);
        pConfig.setCentralDeLocalizacao(CentralDeLocalizacaoSemPersistencia.class);
        pConfig.setCentralAtributoDados(CentralAtributosWebappSemPersistencia.class);
        List<Class<? extends ItfFabricaAcoes>> listaWebApp = Lists.newArrayList(UtilSB_CRIADOR_COMPONENTEGlobalVar.pAcoesDoSistema());

        listaWebApp.add(FabAcoesHomeCriadorComponente.class);
        listaWebApp.add(FabAcaoDemonstracaoSB.class);
        listaWebApp.add(FabAcaoProjetoSB.class);
        listaWebApp.add(FabAcaoAdminDeveloper.class);
        listaWebApp.add(FabAcaoPaginasDoSistema.class);
        listaWebApp.add(FabAcaoBeanExemploDemonstrativo.class);

        pConfig.setFabricaDeAcoes(listaWebApp.toArray(new Class[listaWebApp.size()]));
    }

}
