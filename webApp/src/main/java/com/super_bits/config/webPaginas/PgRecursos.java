/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.config.webPaginas;

import com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.model.informacao.ConteudoGenerico;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfBeanSimples;
import com.super_bits.modulosSB.webPaginas.JSFBeans.SBBeanModel.ItfMB_Recursos;
import com.super_bits.modulosSB.webPaginas.JSFManagedBeans.formularios.MB_PaginaConversation;
import com.super_bits.modulosSB.webPaginas.JSFManagedBeans.formularios.reflexao.anotacoes.InfoPagina;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

/**
 *
 * @author desenvolvedor
 */
@ApplicationScoped
@Named
@InfoPagina(nomeCurto = "RC", tags = {"Recursos"})
public class PgRecursos extends MB_PaginaConversation implements ItfMB_Recursos {

    private ConteudoGenerico informacao;

    @Override
    public void setId(int id) {
        System.out.println("");
    }

    @Override
    public ItfBeanSimples getBeanSelecionado() {
        return informacao;
    }

    @Override
    public void setBeanSelecionado(ItfBeanSimples pBeanSimples) {

    }

}
