/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.config.webPaginas;

import com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.regras_de_negocio_e_controller.paginasIniciais.FabAcoesHomeCriadorComponente;
import com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.regras_de_negocio_e_controller.paginasIniciais.InfoAcaoHomeCriacaoComponente;
import com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.model.BeanExemplo;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfBeanSimples;
import com.super_bits.modulosSB.webPaginas.JSFManagedBeans.formularios.MB_PaginaConversation;
import com.super_bits.modulosSB.webPaginas.JSFManagedBeans.formularios.reflexao.anotacoes.InfoPagina;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author desenvolvedor
 */
@InfoAcaoHomeCriacaoComponente(acao = FabAcoesHomeCriadorComponente.PAGINA_HOME_MB_INICIO)
@ViewScoped
@Named
@InfoPagina(nomeCurto = "HM", tags = {"home"})
public class PgHomeCriadorComponente extends MB_PaginaConversation {

    private BeanExemplo beanExemplo;
    private ItfBeanSimples beaSimples;

    @PostConstruct
    public void inicio() {
        beanExemplo = new BeanExemplo();
    }

    @Override
    public ItfBeanSimples getBeanSelecionado() {
        return beaSimples;
    }

    @Override
    public void setBeanSelecionado(ItfBeanSimples pBeanSimples) {
        beaSimples = pBeanSimples;
    }

    public BeanExemplo getBeanExemplo() {
        return beanExemplo;
    }

}
