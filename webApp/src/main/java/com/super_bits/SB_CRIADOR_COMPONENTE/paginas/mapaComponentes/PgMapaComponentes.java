/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.SB_CRIADOR_COMPONENTE.paginas.mapaComponentes;

import com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.model.BeanExemplo;
import com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.model.mapaComponentes.FabAcaoLabComponentes;
import com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.model.mapaComponentes.InfoAcaoLabComponentes;
import com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.model.mapaComponentes.MapaComponentes;
import com.super_bits.modulos.SBAcessosModel.model.acoes.AcaoDoSistema;
import com.super_bits.modulosSB.SBCore.ConfigGeral.SBCore;
import com.super_bits.modulosSB.SBCore.modulos.Mensagens.FabMensagens;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.Campo;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.CampoNaoImplementado;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.FabCampos;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.ItfCampoInstanciado;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.ComponenteVisualSB;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.FabFamiliaCompVisual;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.FamiliaComponente;
import com.super_bits.modulosSB.webPaginas.JSFBeans.SB.siteMap.MB_PaginaConversation;
import com.super_bits.modulosSB.webPaginas.JSFBeans.SB.siteMap.anotacoes.InfoPagina;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author desenvolvedor
 */
@InfoAcaoLabComponentes(acao = FabAcaoLabComponentes.LAB_COMPONENTES_MB_GERENCIAR)
@InfoPagina(nomeCurto = "LC", tags = {"LabComp", "Laboratório Componentes SB"})
@Named
@ViewScoped
public class PgMapaComponentes extends MB_PaginaConversation {

    private ComponenteVisualSB componenteSelecionado;
    private List<ComponenteVisualSB> listaComponentes;
    private FamiliaComponente familiaSelecionada;
    private List<FamiliaComponente> listaFamiliasComponentes;
    private final AcaoDoSistema acaoGerenciar = FabAcaoLabComponentes.LAB_COMPONENTES_MB_GERENCIAR.getAcaoDoSistema();
    private final AcaoDoSistema acaoListar = FabAcaoLabComponentes.LAB_COMPONENTES_FRM_LISTAR.getAcaoDoSistema();
    private final AcaoDoSistema acaoVisualizar = FabAcaoLabComponentes.LAB_COMPONENTES_FRM_VISUALIZAR.getAcaoDoSistema();
    private final AcaoDoSistema acaoEditar = FabAcaoLabComponentes.LAB_COMPONENTES_FRM_EDITAR.getAcaoDoSistema();
    private final AcaoDoSistema acaoSelecionarFamilia = FabAcaoLabComponentes.LAB_COMPONENTES_FRM_FAMILIA_SELECIONADA_VISUALIZAR.getAcaoDoSistema();
    private final AcaoDoSistema acaoSelecionarComponente = FabAcaoLabComponentes.LAB_COMPONENTES_FRM_COMPONENTE_SELECIONADO_VISUALIZAR.getAcaoDoSistema();
    private String parametroPesquisa;
    private BeanExemplo beanExemplo;
    private Campo campoSelecionado;
    private List<Campo> listaCamposDisponiveis;
    private List<AcaoDoSistema> listaTeste;
    private List<AcaoDoSistema> acoesLaboratorio;

    @PostConstruct
    public void init() {

        MapaComponentes.mapaComponentesCriarMapa();

        acaoSelecionada = acaoListar;

        xhtmlAcaoAtual = acaoSelecionada.getComoFormularioEntidade().getXhtml();

        listaComponentes = MapaComponentes.getTodosComponentes();

        listaFamiliasComponentes = MapaComponentes.getTodasFamiliasComponentes();

        getTodosCamposSistema();

        parametroPesquisa = "";
        beanExemplo = new BeanExemplo();

        preencheListaTeste();
    }

    public void metodoTeste() {
        SBCore.enviarAvisoAoUsuario("teste");
    }

    public boolean isComponenteSelecionadoDoTipoIntput() {
        if (componenteSelecionado == null) {
            return false;
        }
        return componenteSelecionado.getFamilia().equals(FabFamiliaCompVisual.INPUT);
    }

    public void carregarLaboratorio() {
        //acoesLaboratorio = FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_MB_LAB;
    }

    public void preencheListaTeste() {
        for (int i = 0; i < 6; i++) {
            listaTeste.add(acaoEditar);
        }
    }

    public ItfCampoInstanciado getCampoInstanciado() {

        // se não tiver nenhym componente selecionado, retorna Campo não implementado
        if (componenteSelecionado == null) {

            return new CampoNaoImplementado();
        }
        // se o componente não for um componente do tipo input, retorna componente não implementado
        if (!componenteSelecionado.getFamilia().equals(FabFamiliaCompVisual.INPUT)) {
            return new CampoNaoImplementado();
        }
        //de acordo com ocomponente selecionado retorna um campo instanciado do

        // Campos
        if (campoSelecionado == null) {
            return new CampoNaoImplementado();
        }

        return beanExemplo.getCampoInstanciadoByAnotacao(campoSelecionado.getTipoCampo());
    }

    private void getTodosCamposSistema() {

        listaCamposDisponiveis = new ArrayList<>();

        for (FabCampos enumCampo : FabCampos.class.getEnumConstants()) {

            Campo campoAtual = enumCampo.getRegistro();

            listaCamposDisponiveis.add(campoAtual);

        }

    }

    public boolean isTemCampoSelecionado() {

        return campoSelecionado != null;

    }

    public void executarAcao(ComponenteVisualSB pComponente) {

        if (pComponente != null) {

            componenteSelecionado = pComponente;

        }

        executarAcaoSelecionada();

    }

    @Override
    public void executarAcaoSelecionada() {

        super.executarAcaoSelecionada();

        if (acaoSelecionada.equals(acaoSelecionarFamilia)) {

            if (familiaSelecionada != null) {

                listaComponentes = MapaComponentes.getComponentesFamilia(familiaSelecionada);

            } else {
                SBCore.enviarMensagemUsuario("A Familia dos Componentes a serem visualizados está nula e por isso não é possivel buscar por Componentes!", FabMensagens.ALERTA);
            }

        }

    }

    public void filtrarPorFamilia() {

        listaComponentes.clear();

        listaComponentes = MapaComponentes.getComponentesFamilia(familiaSelecionada);

    }

    public BeanExemplo getBeanExemplo() {
        return beanExemplo;
    }

    public void filtrarPorParametro() {

        listaComponentes.clear();

        for (ComponenteVisualSB componentePesquisado : MapaComponentes.getTodosComponentes()) {

            if (componentePesquisado.getNome().toLowerCase().contains(parametroPesquisa.toLowerCase())) {

                listaComponentes.add(componentePesquisado);

            }

        }

    }

    public ComponenteVisualSB getComponenteSelecionado() {
        return componenteSelecionado;
    }

    public List<ComponenteVisualSB> getListaComponentes() {
        return listaComponentes;
    }

    public FamiliaComponente getFamiliaSelecionada() {
        return familiaSelecionada;
    }

    public List<FamiliaComponente> getListaFamiliasComponentes() {
        return listaFamiliasComponentes;
    }

    public AcaoDoSistema getAcaoGerenciar() {
        return acaoGerenciar;
    }

    public AcaoDoSistema getAcaoListar() {
        return acaoListar;
    }

    public AcaoDoSistema getAcaoVisualizar() {
        return acaoVisualizar;
    }

    public AcaoDoSistema getAcaoSelecionarFamilia() {
        return acaoSelecionarFamilia;
    }

    public AcaoDoSistema getAcaoSelecionarComponente() {
        return acaoSelecionarComponente;
    }

    public AcaoDoSistema getAcaoEditar() {
        return acaoEditar;
    }

    public void setFamiliaSelecionada(FamiliaComponente pFamilia) {
        familiaSelecionada = pFamilia;
        filtrarPorFamilia();
    }

    public String getParametroPesquisa() {
        return parametroPesquisa;
    }

    public void setComponenteSelecionado(ComponenteVisualSB componenteSelecionado) {
        this.componenteSelecionado = componenteSelecionado;
    }

    public void setParametroPesquisa(String parametroPesquisa) {
        this.parametroPesquisa = parametroPesquisa;
    }

    public Campo getCampoSelecionado() {
        if (campoSelecionado == null) {
            for (Campo cp : getListaCamposDisponiveis()) {

                if (componenteSelecionado != null) {
                    if (cp.getTipoCampo().
                            getTipo_input_prime()
                            .equals(componenteSelecionado.getFabricaDoComponente())) {
                        campoSelecionado = cp;
                        break;
                    }
                }
            }
        }
        return campoSelecionado;
    }

    public List<Campo> getListaCamposDisponiveis() {
        return listaCamposDisponiveis;
    }

    public void setCampoSelecionado(Campo campoSelecionado) {
        this.campoSelecionado = campoSelecionado;
    }

    public List<AcaoDoSistema> getListaTeste() {
        return listaTeste;
    }

}
