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
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.ItfParametroTela;
import com.super_bits.modulosSB.SBCore.modulos.Mensagens.FabMensagens;
import com.super_bits.modulosSB.SBCore.modulos.geradorCodigo.model.EstruturaCampo;
import com.super_bits.modulosSB.SBCore.modulos.geradorCodigo.model.EstruturaDeEntidade;
import com.super_bits.modulosSB.SBCore.modulos.objetos.MapaObjetosProjetoAtual;
import com.super_bits.modulosSB.SBCore.modulos.objetos.UtilSBCoreReflexaoObjetoSuperBits;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.ComponenteVisualSB;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.FabFamiliaCompVisual;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.FamiliaComponente;
import com.super_bits.modulosSB.webPaginas.JSFBeans.SB.siteMap.MB_PaginaConversation;
import com.super_bits.modulosSB.webPaginas.JSFBeans.SB.siteMap.ParametroURL;
import com.super_bits.modulosSB.webPaginas.JSFBeans.SB.siteMap.anotacoes.InfoPagina;
import com.super_bits.modulosSB.webPaginas.JSFBeans.SB.siteMap.anotacoes.beans.InfoMB_Bean;
import com.super_bits.modulosSB.webPaginas.JSFBeans.SB.siteMap.anotacoes.beans.InfoParametroURL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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

    private final static String ESTRUTURA_DE_ENTIDADE_DESCRICAO = "Estrutura de Objeto";
    private final static String ESTRUTURA_DE_CAMPO_DESCRICAO = "Estrutura de Campo";

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

    private final AcaoDoSistema acaoLabVisualizarComponente = FabAcaoLabComponentes.LAB_COMPONENTES_FRM_LAB_VER.getAcaoDoSistema();
    private final AcaoDoSistema acaoLabOnChangeComponente = FabAcaoLabComponentes.LAB_COMPONENTES_FRM_LAB_ONCHANGE.getAcaoDoSistema();
    private final AcaoDoSistema acaoLabValidarComponente = FabAcaoLabComponentes.LAB_COMPONENTES_FRM_LAB_FICHA_TECNICA.getAcaoDoSistema();
    private String parametroPesquisa;

    private String tipoEstruturaSelecionada;
    private boolean umTipoEstruturaDeObjeto;

    /**
     * Teste
     */
    @InfoMB_Bean(descricao = "Indica se a estrutra é do tipo Atributo")
    private boolean umTipoEstruturaAtributo;
    private BeanExemplo beanExemplo;

    private String caminhoBeanSelecionado;
    private List<String> beansDisponiveis;

    private Map<String, String> labelByCaminho;

    private List<AcaoDoSistema> acoesLaboratorio;
    @InfoParametroURL(nome = "componente", tipoParametro = ItfParametroTela.TIPO_URL.ENTIDADE, tipoEntidade = ComponenteVisualSB.class)
    private ParametroURL prComponenteSelecionado;
    @InfoParametroURL(nome = "conteudo", tipoParametro = ItfParametroTela.TIPO_URL.TEXTO)
    private ParametroURL prCaminhoBeanSelecionado;

    private EstruturaCampo estruturaCampoSelecionado;
    private EstruturaDeEntidade estruturaObjetoSelecionado;

    public void dropaCampo() {
        paginaUtil.enviaMensagem("Dropou!!!");
    }

    @PostConstruct
    public void init() {

        MapaComponentes.mapaComponentesCriarMapa();

        acaoSelecionada = acaoListar;

        xhtmlAcaoAtual = acaoSelecionada.getComoFormularioEntidade().getXhtml();

        listaComponentes = MapaComponentes.getTodosComponentes();

        listaFamiliasComponentes = MapaComponentes.getTodasFamiliasComponentes();

        parametroPesquisa = "";
        beanExemplo = new BeanExemplo();

        beansDisponiveis = new ArrayList<>();
        beansDisponiveis.add(BeanExemplo.class.getSimpleName());
        labelByCaminho = new HashMap<>();
        labelByCaminho.put(BeanExemplo.class.getSimpleName(), UtilSBCoreReflexaoObjetoSuperBits.getNomeObjeto(BeanExemplo.class));
        estruturaObjetoSelecionado = MapaObjetosProjetoAtual.getEstruturaObjeto(BeanExemplo.class);

        for (EstruturaCampo cp : MapaObjetosProjetoAtual.getEstruturaObjeto(BeanExemplo.class).getCampos()) {
            String caminhoCampo = BeanExemplo.class.getSimpleName() + "." + cp.getNomeDeclarado();
            beansDisponiveis.add(caminhoCampo);
            labelByCaminho.put(caminhoCampo, cp.getLabel());
        }

    }

    /**
     *
     * @return O label pelo caminho do campo
     */
    public String getLabelPorCaminho(String pCamiho) {
        return labelByCaminho.get(pCamiho);
    }

    public String getCaminhoBeanSelecionado() {
        return caminhoBeanSelecionado;
    }

    public void setCaminhoBeanSelecionado(String pCaminhoBeanSelecionado) {
        try {
            if (!pCaminhoBeanSelecionado.contains(".")) {
                tipoEstruturaSelecionada = ESTRUTURA_DE_ENTIDADE_DESCRICAO;
                umTipoEstruturaAtributo = false;
                umTipoEstruturaDeObjeto = true;
                estruturaCampoSelecionado = null;
                estruturaObjetoSelecionado = MapaObjetosProjetoAtual.getEstruturaObjeto(pCaminhoBeanSelecionado);

            } else {
                tipoEstruturaSelecionada = ESTRUTURA_DE_CAMPO_DESCRICAO;
                String nomeObjeto = pCaminhoBeanSelecionado.split("\\.")[0];
                String nomeCampo = pCaminhoBeanSelecionado.split("\\.")[1];
                estruturaObjetoSelecionado = MapaObjetosProjetoAtual.getEstruturaObjeto(nomeObjeto);
                estruturaCampoSelecionado = estruturaObjetoSelecionado.getCampoByNomeDeclarado(nomeCampo);
                umTipoEstruturaAtributo = true;
                umTipoEstruturaDeObjeto = false;
            }
            this.caminhoBeanSelecionado = pCaminhoBeanSelecionado;
        } catch (Throwable t) {
            SBCore.enviarMensagemUsuario("Campo não Encontrado", FabMensagens.ERRO);
        }

    }

    private List<AcaoDoSistema> getAcoesDisponiveisDoComponente() {
        List<AcaoDoSistema> acoes = new ArrayList<>();

        acoes.add(acaoLabOnChangeComponente);
        acoes.add(acaoLabValidarComponente);
        acoes.add(acaoLabVisualizarComponente);
        return acoes;
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

    public AcaoDoSistema getAcaoLabVisualizarComponente() {
        return acaoLabVisualizarComponente;
    }

    public AcaoDoSistema getAcaoLabOnChangeComponente() {
        return acaoLabOnChangeComponente;
    }

    public AcaoDoSistema getAcaoLabValidarComponente() {
        return acaoLabValidarComponente;
    }

    /**
     *
     * @return Texto com o nome do tipo de Bean Selecionado
     */
    public String getTipoEstruturaSelecionada() {
        return tipoEstruturaSelecionada;
    }

    /**
     *
     * Indica que o Atributo é do tipo Objeto (quando verdadeiro)
     *
     * @return Verdadeiro se o tipo de estrutura é do tipo Objeto
     */
    public boolean isUmTipoEstruturaDeObjeto() {
        return umTipoEstruturaDeObjeto;
    }

    /**
     *
     * Indica que o Atributo é do tipo Atributo do Objeto (quando verdadeiro)
     *
     *
     * @return Verdadeiro se o tipo de estrutura é do tipo Atributo do Objeto
     */
    public boolean isUmTipoEstruturaAtributo() {
        return umTipoEstruturaAtributo;
    }

    public List<String> getBeansDisponiveis() {
        return beansDisponiveis;
    }

    public List<AcaoDoSistema> getAcoesLaboratorio() {
        return acoesLaboratorio;
    }

}
