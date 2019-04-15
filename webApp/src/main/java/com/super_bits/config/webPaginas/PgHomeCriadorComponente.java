/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.config.webPaginas;

import com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.regras_de_negocio_e_controller.paginasIniciais.FabAcoesHomeCriadorComponente;
import com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.regras_de_negocio_e_controller.paginasIniciais.InfoAcaoHomeCriacaoComponente;
import com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.model.BeanExemplo;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.acoes.ItfAcaoDoSistema;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.permissoes.ItfAcaoFormulario;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfBeanSimples;
import com.super_bits.modulosSB.webPaginas.JSFManagedBeans.formularios.MB_PaginaConversation;
import com.super_bits.modulosSB.webPaginas.JSFManagedBeans.formularios.reflexao.anotacoes.InfoPagina;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import org.coletivoJava.superBitsFW.webPaginas.config.AcoesAdminTools_BeanExemploMb;

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

    public List<ItfAcaoFormulario> get5Acoes() {
        List<ItfAcaoFormulario> ac5ac = new AcoesAdminTools_BeanExemploMb().getBeanExemploMb().getComoGestaoEntidade().getAcoesFormulario();
        ac5ac.remove(ac5ac.size() - 1);
        ac5ac.remove(ac5ac.size() - 1);
        ac5ac.remove(ac5ac.size() - 1);
        return ac5ac;
    }

    public List<ItfAcaoFormulario> get16Acoes() {
        List<ItfAcaoFormulario> ac15ac = new AcoesAdminTools_BeanExemploMb().getBeanExemploMb().getComoGestaoEntidade().getAcoesFormulario();
        ac15ac.addAll(new AcoesAdminTools_BeanExemploMb().getBeanExemploMb().getComoGestaoEntidade().getAcoesFormulario());
        return ac15ac;
    }

    public List<ItfAcaoFormulario> get24acoes() {
        List<ItfAcaoFormulario> ac24ac = new AcoesAdminTools_BeanExemploMb().getBeanExemploMb().getComoGestaoEntidade().getAcoesFormulario();
        ac24ac.addAll(new AcoesAdminTools_BeanExemploMb().getBeanExemploMb().getComoGestaoEntidade().getAcoesFormulario());

        return ac24ac;
    }

    public List<ItfAcaoFormulario> get32Acoes() {
        List<ItfAcaoFormulario> get32Acoes = new AcoesAdminTools_BeanExemploMb().getBeanExemploMb().getComoGestaoEntidade().getAcoesFormulario();
        get32Acoes.addAll(new AcoesAdminTools_BeanExemploMb().getBeanExemploMb().getComoGestaoEntidade().getAcoesFormulario());
        get32Acoes.addAll(new AcoesAdminTools_BeanExemploMb().getBeanExemploMb().getComoGestaoEntidade().getAcoesFormulario());
        get32Acoes.remove(get32Acoes.size() - 1);
        get32Acoes.remove(get32Acoes.size() - 1);
        return get32Acoes;
    }
}
