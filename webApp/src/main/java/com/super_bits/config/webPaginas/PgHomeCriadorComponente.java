/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.config.webPaginas;

import com.super_bits.FabAcoesHomeCriadorComponente;
import com.super_bits.InfoAcaoHomeCriacaoComponente;
import com.super_bits.modulosSB.webPaginas.JSFBeans.SB.siteMap.MB_PaginaConversation;
import com.super_bits.modulosSB.webPaginas.JSFBeans.SB.siteMap.anotacoes.InfoPagina;
import javax.faces.bean.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author desenvolvedor
 */
@InfoAcaoHomeCriacaoComponente(acao = FabAcoesHomeCriadorComponente.PAGINA_HOME_MB)
@SessionScoped
@Named
@InfoPagina(nomeCurto = "HM", tags = {"home"})
public class PgHomeCriadorComponente extends MB_PaginaConversation {

}
