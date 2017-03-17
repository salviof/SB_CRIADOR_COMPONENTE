/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.SB_CRIADOR_COMPONENTE.paginas;

import com.super_bits.FabAcoesHomeCriadorComponente;
import com.super_bits.InfoAcaoHomeCriacaoComponente;
import com.super_bits.modulosSB.webPaginas.JSFManagedBeans.formularios.MB_PaginaConversation;
import com.super_bits.modulosSB.webPaginas.JSFManagedBeans.formularios.reflexao.anotacoes.InfoPagina;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 *
 * Anotação Named para o Managed bean ficar acessivel direto nos XHTML <br>
 * Anotação ViewScoped indica que o ciclo de vida da instancia do objeto limita
 * a aba do navegador <br>
 * Anotação infoAcao que vincula a ação do tipo Maneged Bean <br>
 *
 *
 *
 * @author desenvolvedor
 */
@ViewScoped
@Named
@InfoAcaoHomeCriacaoComponente(acao = FabAcoesHomeCriadorComponente.PAGINA_HOME_MB)
@InfoPagina(tags = {"Home"}, nomeCurto = "HM")
public class Pg_paginaInicial extends MB_PaginaConversation {

    private String beanExemplo;

    @PostConstruct
    public void inicio() {
        acaoSelecionada = FabAcoesHomeCriadorComponente.PAGINA_HOME_FRM_LOGIN.getAcaoDoSistema();
        xhtmlAcaoAtual = FabAcoesHomeCriadorComponente.PAGINA_HOME_FRM_LOGIN.getAcaoDoSistema().getComoFormulario().getXhtml();
    }

    public String getBeanExemplo() {
        return beanExemplo;
    }

    public void setBeanExemplo(String beanExemplo) {
        this.beanExemplo = beanExemplo;
    }

}
