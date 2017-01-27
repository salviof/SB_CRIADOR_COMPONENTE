/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.config.webPaginas;

import com.super_bits.SB_CRIADOR_COMPONENTE.paginas.mapaComponentes.PgMapaComponentes;
import com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.regras_de_negocio_e_controller.FabMenuExemplo;
import com.super_bits.modulos.paginas.adminTools.PgAdminBanco;
import com.super_bits.modulos.paginas.adminTools.PgAdminSistema;
import com.super_bits.modulos.paginas.adminTools.PgLabProjetoAtual;
import com.super_bits.modulosSB.SBCore.modulos.view.menu.ItfFabricaMenu;
import com.super_bits.modulosSB.webPaginas.JSFBeans.SB.siteMap.ItfSiteMapa;
import com.super_bits.modulosSB.webPaginas.JSFBeans.SB.siteMap.MB_SiteMapa;
import javax.faces.bean.ApplicationScoped;
import javax.inject.Inject;

/**
 *
 *
 * Todas as paginas do seu sistema precisam ser Injetadas no SiteMAP
 *
 * O site Map, ajuda o bean paginaAtual a identificar qual pagina está sendo
 * referenciada, e serve de parametro para montar o site Map da pagina
 *
 *
 * @author Salvio
 */
@ApplicationScoped
public class SiteMap extends MB_SiteMapa implements ItfSiteMapa {

    @Inject
    private PgMapaComponentes gerenciarMapaCompoentes;
    @Inject
    private PgAdminBanco adminBanco;
    @Inject
    private PgAdminSistema adminSistema;
    @Inject
    private PgLabProjetoAtual lAbProjetoAtual;
    @Inject
    private PgHomeCriadorComponente home;

    @Override
    public Class<? extends ItfFabricaMenu> getFabricaMenu() {
        return FabMenuExemplo.class;
    }

}
