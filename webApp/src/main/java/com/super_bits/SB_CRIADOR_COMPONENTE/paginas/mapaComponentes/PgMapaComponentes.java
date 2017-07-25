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
import com.super_bits.modulos.SBAcessosModel.model.acoes.AcaoDeEntidadeController;
import com.super_bits.modulos.SBAcessosModel.model.acoes.AcaoDoSistema;
import com.super_bits.modulosSB.SBCore.ConfigGeral.SBCore;
import com.super_bits.modulosSB.SBCore.UtilGeral.UtilSBCoreReflexaoObjeto;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.TIPO_PARTE_URL;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.acoes.ItfAcaoDoSistema;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.permissoes.ItfAcaoFormulario;
import com.super_bits.modulosSB.SBCore.modulos.Mensagens.FabMensagens;
import com.super_bits.modulosSB.SBCore.modulos.TratamentoDeErros.FabErro;
import com.super_bits.modulosSB.SBCore.modulos.geradorCodigo.model.EstruturaCampo;
import com.super_bits.modulosSB.SBCore.modulos.geradorCodigo.model.EstruturaDeEntidade;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.UtilSBCoreReflexaoCaminhoCampo;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campoInstanciado.CampoNaoImplementado;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campoInstanciado.ItfCampoInstanciado;
import com.super_bits.modulosSB.SBCore.modulos.objetos.MapaObjetosProjetoAtual;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfBeanSimples;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.ComponenteVisualSB;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.FabFamiliaCompVisual;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.FamiliaComponente;
import com.super_bits.modulosSB.webPaginas.JSFManagedBeans.formularios.MB_PaginaConversation;
import com.super_bits.modulosSB.webPaginas.JSFManagedBeans.formularios.reflexao.anotacoes.InfoPagina;
import com.super_bits.modulosSB.webPaginas.JSFManagedBeans.formularios.reflexao.anotacoes.beans.InfoMB_Bean;
import com.super_bits.modulosSB.webPaginas.JSFManagedBeans.formularios.reflexao.anotacoes.beans.InfoParametroURL;
import com.super_bits.modulosSB.webPaginas.JSFManagedBeans.siteMap.parametrosURL.ParametroURL;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import org.primefaces.context.RequestContext;

/**
 *
 * @author desenvolvedor
 */
@InfoAcaoLabComponentes(acao = FabAcaoLabComponentes.LAB_COMPONENTES_MB_GERENCIAR)
@InfoPagina(nomeCurto = "LabComp", tags = {"Laboratório Componentes SB"})
@Named
@ViewScoped
public class PgMapaComponentes extends MB_PaginaConversation {

    private final static String ESTRUTURA_DE_ENTIDADE_DESCRICAO = "Estrutura de Objeto";
    private final static String ESTRUTURA_DE_CAMPO_DESCRICAO = "Estrutura de Campo";

    private ComponenteVisualSB componenteSelecionado;
    private List<ComponenteVisualSB> listaComponentes;
    private FamiliaComponente familiaSelecionada;
    private List<FamiliaComponente> listaFamiliasComponentes;
    private final AcaoDoSistema acaoGerenciar = FabAcaoLabComponentes.LAB_COMPONENTES_MB_GERENCIAR.getRegistro();
    private final AcaoDoSistema acaoListar = FabAcaoLabComponentes.LAB_COMPONENTES_FRM_LISTAR.getRegistro();
    private final AcaoDoSistema acaoVisualizar = FabAcaoLabComponentes.LAB_COMPONENTES_FRM_VISUALIZAR.getRegistro();
    private final AcaoDoSistema acaoEditar = FabAcaoLabComponentes.LAB_COMPONENTES_FRM_EDITAR.getRegistro();
    private final AcaoDoSistema acaoSelecionarFamilia = FabAcaoLabComponentes.LAB_COMPONENTES_FRM_VISUALIZAR_FAMILIA_SELECIONADA.getRegistro();
    private final AcaoDoSistema acaoSelecionarComponente = FabAcaoLabComponentes.LAB_COMPONENTES_FRM_VISUALIZAR_COMPONENTE_SELECIONADO.getRegistro();

    private final AcaoDoSistema acaoLabVisualizarComponente = FabAcaoLabComponentes.LAB_COMPONENTES_FRM_LAB_INPUT_VER.getRegistro();
    private final AcaoDoSistema acaoLabOnChangeComponente = FabAcaoLabComponentes.LAB_COMPONENTES_FRM_LAB_INPUT_LISTA_SUB_FORMULARIO.getRegistro();
    private final AcaoDoSistema acaoLabValidarComponente = FabAcaoLabComponentes.LAB_COMPONENTES_FRM_LAB_FICHA_TECNICA_INPUT.getRegistro();

    private final AcaoDeEntidadeController acaoTesteModalComunicacao = (AcaoDeEntidadeController) FabAcaoLabComponentes.LAB_COMPONENTES_CTR_TESTE_COMUNICACAO.getRegistro();
    private final AcaoDeEntidadeController acaoTesteModalJustificativa = (AcaoDeEntidadeController) FabAcaoLabComponentes.LAB_COMPONENTES_CTR_TESTE_JUSTIFICATIVA.getRegistro();

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
    private String caminhoComponente;

    private List<String> beansDisponiveis;

    private Map<String, String> labelByCaminho;

    private List<AcaoDoSistema> acoesLaboratorio;
    @InfoParametroURL(nome = "componente", tipoParametro = TIPO_PARTE_URL.TEXTO)
    private ParametroURL prCaminhoComponente;
    @InfoParametroURL(nome = "conteudo", tipoParametro = TIPO_PARTE_URL.TEXTO)
    private ParametroURL prCaminhoBeanSelecionado;

    private EstruturaCampo estruturaCampoSelecionado;
    private EstruturaDeEntidade estruturaObjetoSelecionado;
    private DialogoWeb dialogoDoMomento;

    private List<ComponenteVisualSB> listaComponentesEspeciaisDisponiveis;

    private List<ItfAcaoFormulario> listasformularioExemplo;

    public void dropaCampo() {
        FacesContext context = FacesContext.getCurrentInstance();
        Map map = context.getExternalContext().getRequestParameterMap();

        String atributoEnviado = (String) map.get(paginaUtil.gerarCaminhoCompletoIDParaJavaScript("campoDropado"));
        setCaminhoBeanSelecionado(atributoEnviado);
        paginaUtil.enviaMensagem("Dropou!!!" + atributoEnviado);
        atualizarIdAreaExibicaoAcaoSelecionada();

    }

    public void dropaComponente() {
        FacesContext context = FacesContext.getCurrentInstance();
        Map map = context.getExternalContext().getRequestParameterMap();
        String atributoEnviado = (String) map.get(paginaUtil.gerarCaminhoCompletoIDParaJavaScript("componenteDropado"));
        paginaUtil.enviaMensagem("Dropou!!!" + atributoEnviado);
        setCaminhoComponente(atributoEnviado);
        paginaUtil.atualizaTelaPorID("areaMais");
        paginaUtil.atualizaTelaPorID("areaDropComponente");
        if (prCaminhoBeanSelecionado.getValor() != null) {
            setCaminhoBeanSelecionado((String) prCaminhoBeanSelecionado.getValor());
        }
        if (prCaminhoComponente.getValor() != null) {
            setCaminhoComponente((String) prCaminhoComponente.getValor());
        }

    }

    public String getCaminhoComponente() {
        return caminhoComponente;
    }

    public void setCaminhoComponente(String caminhoComponente) {
        try {

            setComponenteSelecionado((ComponenteVisualSB) SBCore.getObjetoEstatico(caminhoComponente));
            this.caminhoComponente = caminhoComponente;
        } catch (Throwable t) {
            SBCore.RelatarErro(FabErro.SOLICITAR_REPARO, "Caminho do componente não foi encontrado :" + caminhoComponente, t);
        }
    }

    public void irParaPaginaComponenteSelecionado() {
        prCaminhoBeanSelecionado.setValor(caminhoBeanSelecionado);
        prCaminhoComponente.setValor(componenteSelecionado.getCaminhoFabrica());

        paginaUtil.irParaURL(getUrlAtual());

    }

    public boolean isUmaInformacaoSelecionada() {
        return caminhoBeanSelecionado != null;
    }

    public boolean isUmComponenteSelecionado() {
        return componenteSelecionado != null;
    }

    public void limparCampoSelecionado() {
        caminhoBeanSelecionado = null;
    }

    public void limparComponenteSelecionado() {
        componenteSelecionado = null;
    }

    @PostConstruct
    public void init() {

        MapaComponentes.mapaComponentesCriarMapa();
        MapaObjetosProjetoAtual.adcionarObjeto(BeanExemplo.class);

        if (!isParametrosDeUrlPreenchido()) {
            acaoSelecionada = acaoListar;
            xhtmlAcaoAtual = acaoListar.getComoFormularioEntidade().getXhtml();
        } else {

            setCaminhoBeanSelecionado(prCaminhoBeanSelecionado.getValor().toString());
        }

        listaComponentes = MapaComponentes.getTodosComponentes();

        listaFamiliasComponentes = MapaComponentes.getTodasFamiliasComponentes();
        parametroPesquisa = "";
        beanExemplo = new BeanExemplo();

        beansDisponiveis = new ArrayList<>();
        beansDisponiveis.add(BeanExemplo.class.getSimpleName());
        labelByCaminho = new HashMap<>();
        labelByCaminho.put(BeanExemplo.class.getSimpleName(), UtilSBCoreReflexaoObjeto.getNomeObjeto(BeanExemplo.class));
        estruturaObjetoSelecionado = MapaObjetosProjetoAtual.getEstruturaObjeto(BeanExemplo.class);
        acoesLaboratorio = new ArrayList<>();
        dialogoDoMomento = new DialogoWeb();

        for (EstruturaCampo cp : MapaObjetosProjetoAtual.getEstruturaObjeto(BeanExemplo.class).getCampos()) {
            String caminhoCampo = BeanExemplo.class.getSimpleName() + "." + cp.getNomeDeclarado();
            beansDisponiveis.add(caminhoCampo);
            labelByCaminho.put(caminhoCampo, cp.getLabel());
        }
        listaComponentesEspeciaisDisponiveis = MapaComponentes.getComponentesFamilia(getCampoInstanciado().getComponenteVisualPadrao().getFamilia().getRegistro());
        listasformularioExemplo = new ArrayList<>();
        listasformularioExemplo.add(FabAcaoLabComponentes.LAB_COMPONENTES_FRM_LAB_GRUPOS_FORMULARIO_GRUPO_EXEMPLO_ATUALIZACAO_FORM.getRegistro().getComoFormulario());
        listasformularioExemplo.add(FabAcaoLabComponentes.LAB_COMPONENTES_FRM_LAB_GRUPOS_FORMULARIO_GRUPO_EXEMPLO_ATUALIZACAO_GRUPO_DO_CAMPO.getRegistro().getComoFormulario());
        listasformularioExemplo.add(FabAcaoLabComponentes.LAB_COMPONENTES_FRM_LAB_GRUPOS_FORMULARIO_GRUPO_EXEMPLO_ATUALIZACAO_ID.getRegistro().getComoFormulario());
        listasformularioExemplo.add(FabAcaoLabComponentes.LAB_COMPONENTES_FRM_LAB_GRUPOS_FORMULARIO_GRUPO_EXEMPLO_ATUALIZACAO_CAMPO.getRegistro().getComoFormulario());

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
                System.out.println("NomeObjeto[" + nomeObjeto + "]");
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

            setComponenteSelecionado(pComponente);

        }

        executarAcaoSelecionada();

        executaMetodoCaso("", metodo());
    }

    public Method metodo() {
        return null;
    }

    public void executaMetodoCaso(String pPergunta, Method pMetodo) {

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

        if (isAcaoSelecionadaIgualA(FabAcaoLabComponentes.LAB_COMPONENTES_CTR_TESTE_COMUNICACAO)) {
            switch (getRespostaAcaoAtual()) {

                case NAO:
                    SBCore.enviarAvisoAoUsuario("Envio não em teste comunicação");
                    break;
                case SIM:
                    SBCore.enviarAvisoAoUsuario("Envio Sim em teste comunicação");
                    break;
                case FECHAR:
                    break;
                default:
                    throw new AssertionError(getRespostaAcaoAtual().name());

            }
        }

        if (isAcaoSelecionadaIgualA(FabAcaoLabComponentes.LAB_COMPONENTES_CTR_TESTE_JUSTIFICATIVA)) {
            switch (getRespostaAcaoAtual()) {
                case NAO:
                    SBCore.enviarAvisoAoUsuario("Envio não em teste comunicação Justificativa");
                    break;
                case SIM:
                    SBCore.enviarAvisoAoUsuario("Envio Sim em teste comunicação Justificativa, "
                            + "Cp:" + beanExemplo.getSeletorOpcao().getNome());
                    SBCore.enviarMensagemUsuario(beanExemplo.getSeletorOpcao().getNome(), FabMensagens.ALERTA);
                    break;
                case FECHAR:
                    break;
                default:
                    throw new AssertionError(getRespostaAcaoAtual().name());

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
        if (this.caminhoBeanSelecionado == null) {
            String beanPadrao = getCampoPadraoComponente();
            if (beanPadrao != null) {
                setCaminhoBeanSelecionado(beanPadrao);
            }
        }

    }

    public String getCampoPadraoComponente() {

        for (String cp : beansDisponiveis) {

            if (componenteSelecionado != null && cp.contains(".")) {
                String nomeCampo = cp.split("\\.")[1];
                ItfCampoInstanciado campo = beanExemplo.getCampoByNomeOuAnotacao(nomeCampo);
                if (campo != null) {
                    if (campo
                            .getFabricaTipoAtributo().
                            getTipo_input_prime()
                            .equals(componenteSelecionado.getFabricaDoComponente())) {
                        return cp;

                    }
                }
            }
        }
        return null;
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
        try {
            acoesLaboratorio.clear();

            if (componenteSelecionado != null) {

                switch (componenteSelecionado.getFamilia()) {
                    case SELETOR_ITEM:
                    case INPUT:

                        acoesLaboratorio.add(FabAcaoLabComponentes.LAB_COMPONENTES_FRM_LAB_FICHA_TECNICA_INPUT.getRegistro());
                        acoesLaboratorio.add(FabAcaoLabComponentes.LAB_COMPONENTES_FRM_LAB_INPUT_VALIDACAO.getRegistro());
                        acoesLaboratorio.add(FabAcaoLabComponentes.LAB_COMPONENTES_FRM_LAB_INPUT_VER.getRegistro());
                        acoesLaboratorio.add(FabAcaoLabComponentes.LAB_COMPONENTES_FRM_LAB_INPUT_MASKARAS_PERSONALIZADAS.getRegistro());

                        break;
                    case SELETOR_ITENS:
                        acoesLaboratorio.add(FabAcaoLabComponentes.LAB_COMPONENTES_FRM_LAB_INPUT_VER.getRegistro());
                        acoesLaboratorio.add(FabAcaoLabComponentes.LAB_COMPONENTES_FRM_LAB_INPUT_LISTA_SUB_FORMULARIO.getRegistro());
                        break;
                    case LAYOUT_INPUT:
                        break;
                    case MENU:
                        break;

                    case ITEM_BEAN_SIMPLES:
                        break;
                    case ITENS_BEAN_SIMPLES:
                        break;
                    case COMPONENTE_SISTEMA:
                        break;
                    case BOTAO_DE_ACAO:
                        break;
                    case GRUPO_DE_CAMPOS:
                        acoesLaboratorio.add(FabAcaoLabComponentes.LAB_COMPONENTES_FRM_LAB_GRUPO_CAMPO_VISUALIZAR.getRegistro());
                        acoesLaboratorio.add(FabAcaoLabComponentes.LAB_COMPONENTES_FRM_LAB_GRUPO_CAMPO_TESTAR_ON_CHANGE_GPR.getRegistro());
                        acoesLaboratorio.add(FabAcaoLabComponentes.LAB_COMPONENTES_FRM_LAB_GRUPO_CAMPO_TESTAR_ON_CHANGE_FORM.getRegistro());
                        break;
                    case GRUPOS_DE_CAMPOS:
                        acoesLaboratorio.add(FabAcaoLabComponentes.LAB_COMPONENTES_FRM_LAB_GRUPOS_CAMPO_TESTAR_ONCHANGE_FRM.getRegistro());
                        acoesLaboratorio.add(FabAcaoLabComponentes.LAB_COMPONENTES_FRM_LAB_GRUPOS_CAMPO_TESTAR_ONCHANGE_GPR.getRegistro());
                        acoesLaboratorio.add(FabAcaoLabComponentes.LAB_COMPONENTES_FRM_LAB_GRUPOS_CAMPO_TESTAR_ONCHANGE_FRM.getRegistro());
                        break;
                    case FORMULARIO_DE_ACAO:
                        acoesLaboratorio.add(FabAcaoLabComponentes.LAB_COMPONENTES_FRM_LAB_FORMULARIO_VER.getRegistro());
                        break;
                    case ENUM_SELETOR:
                        acoesLaboratorio.add(FabAcaoLabComponentes.LAB_COMPONENTES_FRM_LAB_INPUT_VER.getRegistro());
                        break;

                    default:
                        throw new AssertionError(componenteSelecionado.getFamilia().name());
                }

            }
        } catch (Throwable t) {
            SBCore.RelatarErro(FabErro.SOLICITAR_REPARO, "Erro otendo ações específicas de laboratorio do componente", t);
        }
        return acoesLaboratorio;
    }

    public EstruturaCampo getEstruturaCampoSelecionado() {
        return estruturaCampoSelecionado;
    }

    public EstruturaDeEntidade getEstruturaObjetoSelecionado() {
        return estruturaObjetoSelecionado;
    }

    public ItfCampoInstanciado getCampoInstanciado() {

        if (caminhoBeanSelecionado != null) {
            String nomeCampo = UtilSBCoreReflexaoCaminhoCampo.getCampoSemNomeClasse(caminhoBeanSelecionado);
            if (nomeCampo != null) {
                return beanExemplo.getCampoByNomeOuAnotacao(UtilSBCoreReflexaoCaminhoCampo.getCampoSemNomeClasse(caminhoBeanSelecionado));
            }
        }
        return new CampoNaoImplementado();
    }

    public void testeDialogo(String arquivo) {
        Map<String, Object> options = new HashMap<String, Object>();
        options.put("modal", true);
        options.put("width", 640);
        options.put("height", 340);
        options.put("contentWidth", "100%");
        options.put("contentHeight", "100%");
        options.put("headerElement", "customheader");

        RequestContext.getCurrentInstance().openDialog(arquivo, options, null);
    }

    public void testeDestruicao() {
        for (String beanDestruct : FacesContext.getCurrentInstance().getViewRoot().getViewMap().keySet()) {
            System.out.println("[" + beanDestruct + "-->");
            System.out.println(FacesContext.getCurrentInstance().getViewRoot().getViewMap().get(beanDestruct).toString() + "]");
        }

        FacesContext.getCurrentInstance().getViewRoot().clearInitialState();

    }

    public String testeCarregarOutraViewPorCima() {
        return "/site/home.xhtml";
    }

    @Override
    @PreDestroy
    public void fecharPagina() {
        super.fecharPagina(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ItfBeanSimples getBeanSelecionado() {
        return beanExemplo;
    }

    @Override
    public void setBeanSelecionado(ItfBeanSimples pBeanSimples) {

    }

    public AcaoDeEntidadeController getAcaoTesteModalComunicacao() {
        return acaoTesteModalComunicacao;
    }

    public AcaoDeEntidadeController getAcaoTesteModalJustificativa() {
        return acaoTesteModalJustificativa;
    }

    public List<ComponenteVisualSB> getListaComponentesEspeciaisDisponiveis() {
        return listaComponentesEspeciaisDisponiveis;
    }

    public List<ItfAcaoFormulario> getListasformularioExemplo() {
        return listasformularioExemplo;
    }

    public boolean isAcaoFormularioExibicaoSelecionada() {
        if (getBeanExemplo() == null) {
            return false;
        }
        return getBeanExemplo().getAcaoGrupoTeste() != null;
    }

    @Override
    public void setAcaoSelecionada(ItfAcaoDoSistema acaoSelecionada) {
        super.setAcaoSelecionada(acaoSelecionada);
    }

}
