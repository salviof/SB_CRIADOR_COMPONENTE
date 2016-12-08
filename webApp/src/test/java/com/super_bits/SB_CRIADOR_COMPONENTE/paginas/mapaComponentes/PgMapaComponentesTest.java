/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.SB_CRIADOR_COMPONENTE.paginas.mapaComponentes;

import com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.model.mapaComponentes.MapaComponentes;
import com.super_bits.TestesWP_CRIADOR_COMPONENTES;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.ComponenteVisualSB;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.FabFamiliaCompVisual;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.FamiliaComponente;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

/**
 *
 * @author desenvolvedor
 */
public class PgMapaComponentesTest extends TestesWP_CRIADOR_COMPONENTES {

    @Test
    public void testaFluxoPgMapaComponentes() {

        try {

            // INSTANCIA A PAGINA A SER USADA
            //
            PgMapaComponentes mapaComponentesTeste = new PgMapaComponentes();

            // EXECUTA INIT DA PAGINA PARA SIMULAR COMPORTAMENTO REAL
            //
            mapaComponentesTeste.init();

            // APÓS A PAGINA INICIAR A LISTA DEVE ESTAR PREENCHIDA
            //
            assertNotNull("A lista de Componentes não foi preenchida!", mapaComponentesTeste.getListaComponentes());

            // DESCOBRE QUANTOS COMPONENTES TEM NA LISTA
            //
            int totalComponentes = mapaComponentesTeste.getListaComponentes().size();

            // APÓS A PAGINA INICIAR A LISTA DEVE ESTAR PREENCHIDA
            //
            assertNotNull("A lista de Familias de Componentes não foi preenchida!", mapaComponentesTeste.getListaFamiliasComponentes());

            // DESCOBRE QUANTAS FAMILIAS TEM NA LISTA
            //
            int totalFamiliasComponentes = mapaComponentesTeste.getListaFamiliasComponentes().size();

            // A AÇÃO INICIAL DEVE SER AÇÃO LISTAR
            //
            assertEquals("\n A ação selecionada no Inicio foi: " + mapaComponentesTeste.getAcaoSelecionada().getNomeAcao() + " e deveria ser: " + mapaComponentesTeste.getAcaoListar().getNomeAcao() + " \n", mapaComponentesTeste.getAcaoListar(), mapaComponentesTeste.getAcaoSelecionada());

            // O XHTML INICIAL DEVE SER O DA AÇÃO LISTAR
            //
            assertEquals("O Xhtml atual é: " + mapaComponentesTeste.getAcaoSelecionada().getComoFormulario().getXhtml() + " e deveria ser: " + mapaComponentesTeste.getAcaoListar().getComoFormulario().getXhtml(), mapaComponentesTeste.getAcaoListar().getComoFormulario().getXhtml(), mapaComponentesTeste.getAcaoSelecionada().getComoFormulario().getXhtml());

            // RELATORIO DA AÇÃO
            //
            System.out.println("\nLista de Familia de Componentes criada com Sucesso! " + "\n"
                    + totalFamiliasComponentes + " Familias na Lista" + "\n");

            // RELATORIO DA AÇÃO
            //
            exibirRelatorioListaDeComponentes(mapaComponentesTeste, mapaComponentesTeste.getListaComponentes());

            // DEFINE O PARAMETRO NOME DO COMPONENTE A SER PESQUISADO
            //
            mapaComponentesTeste.setParametroPesquisa("resumido");

            // PESQUISA OS COMPONENTES CONFORME PARAMETRO DE PESQUISA
            //
            mapaComponentesTeste.filtrarPorParametro();

            // DESCOBRE QUANTOS COMPONENTES TEM NA LISTA
            //
            totalComponentes = mapaComponentesTeste.getListaComponentes().size();

            // RELATORIO DA AÇÃO
            //
            exibirRelatorioListaDeComponentes(mapaComponentesTeste, mapaComponentesTeste.getListaComponentes());

            // SELECIONA UMA FAMILIA COMO PARAMENTRO DE PESQUISA DE COMPONENTES
            //
            mapaComponentesTeste.setFamiliaSelecionada(FabFamiliaCompVisual.INPUT.getRegistro());

            // PESQUISA OS COMPONENTES CONFORME A FAMILIA SELECIONADA
            //
            mapaComponentesTeste.filtrarPorFamilia();

            // DESCOBRE QUANTOS COMPONENTES TEM NA LISTA
            //
            totalComponentes = mapaComponentesTeste.getListaComponentes().size();

            // RELATORIO DA AÇÃO
            //
            exibirRelatorioListaDeComponentes(mapaComponentesTeste, mapaComponentesTeste.getListaComponentes());

            ComponenteVisualSB componenteTeste = new ComponenteVisualSB();

            String nomeRecuperado = (String) componenteTeste.getCampoByNomeOuAnotacao("nome").getValor();

        } catch (Throwable t) {

            lancarErroJUnit(t);

        }
    }

    public void exibirRelatorioListaDeComponentes(PgMapaComponentes pPaginaARelatar, List<ComponenteVisualSB> pListaComponentes) {

        int pTotalComponentes = pListaComponentes.size();

        System.out.println("\n" + "Lista de Componentes criada com Sucesso! " + "\n"
                + pTotalComponentes + " Componentes na Lista" + "\n");

        for (ComponenteVisualSB componenteAtual : pPaginaARelatar.getListaComponentes()) {

            System.out.println("\n" + "Componente: " + componenteAtual.getNome() + "|" + " Familia: " + componenteAtual.getFamilia().getNomeFAmilia() + "\n");

        }

    }

}
