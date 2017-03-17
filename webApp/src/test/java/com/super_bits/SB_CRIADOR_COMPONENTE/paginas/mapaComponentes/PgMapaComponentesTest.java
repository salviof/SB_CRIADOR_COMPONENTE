/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.SB_CRIADOR_COMPONENTE.paginas.mapaComponentes;

import com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.model.BeanExemplo;
import com.super_bits.TestesWP_CRIADOR_COMPONENTES;
import com.super_bits.config.webPaginas.SiteMap;
import com.super_bits.modulosSB.SBCore.modulos.geradorCodigo.model.EstruturaCampo;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.Campo;
import com.super_bits.modulosSB.SBCore.modulos.objetos.MapaObjetosProjetoAtual;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.ComponenteVisualSB;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.FabFamiliaCompVisual;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.componentes.FabCompVisualInputs;
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

            new SiteMap();
            MapaObjetosProjetoAtual.adcionarObjeto(BeanExemplo.class);
            List<EstruturaCampo> campos = MapaObjetosProjetoAtual.getEstruturaObjeto(BeanExemplo.class).getCampos();

            System.out.println(campos);
            System.out.println("Componente padrão=" + MapaObjetosProjetoAtual.getVisualizacaoDoObjeto(BeanExemplo.class));
            for (EstruturaCampo cp : campos) {
                System.out.println(cp.getNomeDeclarado());
                System.out.println(cp.getNomeDoObjeto());
            }
            // INSTANCIA A PAGINA A SER USADA
            //
            PgMapaComponentes mapaComponentesTeste = new PgMapaComponentes();

            // EXECUTA INIT DA PAGINA PARA SIMULAR COMPORTAMENTO REAL
            //
            mapaComponentesTeste.init();

            mapaComponentesTeste.setComponenteSelecionado(mapaComponentesTeste.getListaComponentes().get(17));
            System.out.println(mapaComponentesTeste.getCaminhoBeanSelecionado());

            // Selecionando um campo para exibição:
            mapaComponentesTeste.setCaminhoBeanSelecionado(mapaComponentesTeste.getBeansDisponiveis().get(10));

            System.out.println(mapaComponentesTeste.getCampoInstanciado().getLabel());

            System.out.println(mapaComponentesTeste.getTipoEstruturaSelecionada());

            mapaComponentesTeste.setCaminhoBeanSelecionado(mapaComponentesTeste.getBeansDisponiveis().get(1));

            System.out.println(mapaComponentesTeste.getTipoEstruturaSelecionada());

            // APÓS A PAGINA INICIAR A LISTA DEVE ESTAR PREENCHIDA
            //
            assertNotNull("A lista de Componentes não foi preenchida!", mapaComponentesTeste.getListaComponentes());

            // APÓS A PAGINA INICIAR A LISTA DEVE ESTAR PREENCHIDA
            //
            assertNotNull("A lista de Familias de Componentes não foi preenchida!", mapaComponentesTeste.getListaFamiliasComponentes());

            // DESCOBRE QUANTAS FAMILIAS TEM NA LISTA
            //
            int totalFamiliasComponentes = mapaComponentesTeste.getListaFamiliasComponentes().size();

            // APÓS PAGINA INICIAR A LISTA DEVE ESTAR PREENCHIDA
            //
            //  assertNotNull("A lista de Campo não foi preenchida!", mapaComponentesTeste.getListaCamposDisponiveis());
            // RELATORIO DA AÇÃO
            //
            //   exibirRelatorioListaDeCampos(mapaComponentesTeste, mapaComponentesTeste.getListaCamposDisponiveis());
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

            // RELATORIO DA AÇÃO
            //
            exibirRelatorioListaDeComponentes(mapaComponentesTeste, mapaComponentesTeste.getListaComponentes());

            // SELECIONA UMA FAMILIA COMO PARAMENTRO DE PESQUISA DE COMPONENTES
            //
            mapaComponentesTeste.setFamiliaSelecionada(FabFamiliaCompVisual.INPUT.getRegistro());

            // PESQUISA OS COMPONENTES CONFORME A FAMILIA SELECIONADA
            //
            mapaComponentesTeste.filtrarPorFamilia();

            // RELATORIO DA AÇÃO
            //
            exibirRelatorioListaDeComponentes(mapaComponentesTeste, mapaComponentesTeste.getListaComponentes());

            // SELECIONA UM COMPONENTE
            //
            mapaComponentesTeste.setComponenteSelecionado(FabCompVisualInputs.CEP.getComponente());
//            mapaComponentesTeste.getc // SELECIONA UMA CAMPO A SER EDITADO
            //
            //         mapaComponentesTeste.setCampoSelecionado(FabCampos.LCCEP.getRegistro());
            // BUSCA E RETORNA O CAMPO SELECIONADO
            //
            //         ItfCampoInstanciado campoTeste = mapaComponentesTeste.getCampoInstanciado();
            //
            //
            //        assertEquals("\nO Campo instanciado não é o solicitado! " + "\n"
            //                 + "Campo Instanciado: " + campoTeste.getTipoCampo() + "\n"
            //                  + " Campo Solicitado: " + mapaComponentesTeste.getCampoSelecionado().getTipoCampo() + "\n", FabCampos.LCCEP, campoTeste.getTipoCampo());
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

    public void exibirRelatorioListaDeCampos(PgMapaComponentes pPaginaARelatar, List<Campo> pListaCampos) {

        int pTotalCampos = pListaCampos.size();

        System.out.println("\n" + "Lista de Componentes criada com Sucesso! " + "\n"
                + pTotalCampos + " Componentes na Lista" + "\n");

//        for (Campo campoAtual : pPaginaARelatar.getListaCamposDisponiveis()) {
        //         System.out.println("\n" + "Campo: " + campoAtual.getNome() + "|" + " Tipo: " + campoAtual.getTipoCampo() + "\n");
        //   }
    }

}
