/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.config.webPaginas;

import com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.regras_de_negocio_e_controller.FabMenuCriadorComponente;
import com.super_bits.modulosSB.SBCore.modulos.view.menu.ItfFabricaMenu;
import com.super_bits.modulosSB.webPaginas.JSFManagedBeans.formularios.interfaces.ItfSiteMapa;
import com.super_bits.modulosSB.webPaginas.JSFManagedBeans.siteMap.MB_SiteMapa;
import javax.faces.bean.ApplicationScoped;

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

    @Override
    public Class<? extends ItfFabricaMenu> getFabricaMenu() {
        return FabMenuCriadorComponente.class;
    }

}
