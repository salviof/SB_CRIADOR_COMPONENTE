/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.SB_CRIADOR_COMPONENTE.paginas.mapaComponentes;

import com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.model.mapaComponentes.FabAcaoLabComponentes;
import com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.model.mapaComponentes.MapaComponentes;
import com.super_bits.modulos.SBAcessosModel.model.acoes.AcaoDoSistema;
import com.super_bits.modulosSB.SBCore.ConfigGeral.SBCore;
import com.super_bits.modulosSB.SBCore.modulos.Mensagens.FabMensagens;
import com.super_bits.modulosSB.SBCore.modulos.TratamentoDeErros.FabErro;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.ComponenteVisualSB;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.FamiliaComponente;
import com.super_bits.modulosSB.webPaginas.JSFBeans.SB.siteMap.MB_PaginaConversation;
import java.util.List;

/**
 *
 * @author desenvolvedor
 */
public class PgMapaComponentes extends MB_PaginaConversation {

    private ComponenteVisualSB componenteSelecionado;
    private List<ComponenteVisualSB> listaComponentes;
    private FamiliaComponente familiaSelecionada;
    private List<FamiliaComponente> listaFamiliasComponentes;
    private final AcaoDoSistema acaoGerenciar = FabAcaoLabComponentes.LAB_COMPONENTES_MB_GERENCIAR.getAcaoDoSistema();
    private final AcaoDoSistema acaoListar = FabAcaoLabComponentes.LAB_COMPONENTES_FRM_LISTAR.getAcaoDoSistema();
    private final AcaoDoSistema acaoVisualizar = FabAcaoLabComponentes.LAB_COMPONENTES_FRM_VISUALIZAR.getAcaoDoSistema();
    private final AcaoDoSistema acaoSelecionarFamilia = FabAcaoLabComponentes.LAB_COMPONENTES_FRM_FAMILIA_SELECIONADA_VISUALIZAR.getAcaoDoSistema();
    private final AcaoDoSistema acaoSelecionarComponente = FabAcaoLabComponentes.LAB_COMPONENTES_FRM_COMPONENTE_SELECIONADO_VISUALIZAR.getAcaoDoSistema();

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

}
