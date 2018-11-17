/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.model.mapaComponentes;

import com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.configAppp.TesteSB_CRIADOR_COMPONENTE;

import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.FabFamiliaCompVisual;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.ItfComponenteVisualSB;

import java.util.ArrayList;
import java.util.List;
import org.coletivojava.fw.api.objetoNativo.view.componente.ComponenteVisualSB;
import org.coletivojava.fw.api.objetoNativo.view.componente.FamiliaComponente;
import org.junit.Test;

/**
 *
 * @author desenvolvedor
 */
public class MapaComponentesTest extends TesteSB_CRIADOR_COMPONENTE {

    @Test
    public void testeMapaComponetesPorFamilia() {

        MapaComponentes.mapaComponentesCriarMapa();

        for (ItfComponenteVisualSB componente : MapaComponentes.getComponentesFamilia(FabFamiliaCompVisual.BOTAO_DE_ACAO.getRegistro())) {

            System.out.println("\n"
                    + "Listando os Componentes da Familia: " + FabFamiliaCompVisual.BOTAO_DE_ACAO.getNomeFAmilia() + "\n"
                    + "Nome do Componente: " + componente.getNomeComponente() + "\n"
                    + "Familia do Componente: " + componente.getFamilia().getNomeFAmilia() + "\n"
                    + "------------------------------------------------------------------------" + "\n");

        }

        for (ItfComponenteVisualSB componente : MapaComponentes.getComponentesFamilia(FabFamiliaCompVisual.COMPONENTE_SISTEMA.getRegistro())) {

            System.out.println("\n"
                    + "Listando os Componentes da Familia: " + FabFamiliaCompVisual.COMPONENTE_SISTEMA.getNomeFAmilia() + "\n"
                    + "Nome do Componente: " + componente.getNomeComponente() + "\n"
                    + "Familia do Componente: " + componente.getFamilia().getNomeFAmilia() + "\n"
                    + "------------------------------------------------------------------------" + "\n");

        }

        for (ItfComponenteVisualSB componente : MapaComponentes.getComponentesFamilia(FabFamiliaCompVisual.INPUT.getRegistro())) {

            System.out.println("\n"
                    + "Listando os Componentes da Familia: " + FabFamiliaCompVisual.INPUT.getNomeFAmilia() + "\n"
                    + "Nome do Componente: " + componente.getNomeComponente() + "\n"
                    + "Familia do Componente: " + componente.getFamilia().getNomeFAmilia() + "\n"
                    + "------------------------------------------------------------------------" + "\n");

        }

        for (ItfComponenteVisualSB componente : MapaComponentes.getComponentesFamilia(FabFamiliaCompVisual.ITEM_BEAN_SIMPLES.getRegistro())) {

            System.out.println("\n"
                    + "Listando os Componentes da Familia: " + FabFamiliaCompVisual.ITEM_BEAN_SIMPLES.getNomeFAmilia() + "\n"
                    + "Nome do Componente: " + componente.getNomeComponente() + "\n"
                    + "Familia do Componente: " + componente.getFamilia().getNomeFAmilia() + "\n"
                    + "------------------------------------------------------------------------" + "\n");

        }

        for (ItfComponenteVisualSB componente : MapaComponentes.getComponentesFamilia(FabFamiliaCompVisual.ITENS_BEAN_SIMPLES.getRegistro())) {

            System.out.println("\n"
                    + "Listando os Componentes da Familia: " + FabFamiliaCompVisual.ITENS_BEAN_SIMPLES.getNomeFAmilia() + "\n"
                    + "Nome do Componente: " + componente.getNomeComponente() + "\n"
                    + "Familia do Componente: " + componente.getFamilia().getNomeFAmilia() + "\n"
                    + "------------------------------------------------------------------------" + "\n");

        }

        for (ItfComponenteVisualSB componente : MapaComponentes.getComponentesFamilia(FabFamiliaCompVisual.LAYOUT_INPUT.getRegistro())) {

            System.out.println("\n"
                    + "Listando os Componentes da Familia: " + FabFamiliaCompVisual.LAYOUT_INPUT.getNomeFAmilia() + "\n"
                    + "Nome do Componente: " + componente.getNomeComponente() + "\n"
                    + "Familia do Componente: " + componente.getFamilia().getNomeFAmilia() + "\n"
                    + "------------------------------------------------------------------------" + "\n");

        }

        for (ItfComponenteVisualSB componente : MapaComponentes.getComponentesFamilia(FabFamiliaCompVisual.MENU.getRegistro())) {

            System.out.println("\n"
                    + "Listando os Componentes da Familia: " + FabFamiliaCompVisual.MENU.getNomeFAmilia() + "\n"
                    + "Nome do Componente: " + componente.getNomeComponente() + "\n"
                    + "Familia do Componente: " + componente.getFamilia().getNomeFAmilia() + "\n"
                    + "------------------------------------------------------------------------" + "\n");

        }

        for (ItfComponenteVisualSB componente : MapaComponentes.getComponentesFamilia(FabFamiliaCompVisual.SELETOR_ITEM.getRegistro())) {

            System.out.println("\n"
                    + "Listando os Componentes da Familia: " + FabFamiliaCompVisual.SELETOR_ITEM.getNomeFAmilia() + "\n"
                    + "Nome do Componente: " + componente.getNomeComponente() + "\n"
                    + "Familia do Componente: " + componente.getFamilia().getNomeFAmilia() + "\n"
                    + "------------------------------------------------------------------------" + "\n");

        }

        for (ItfComponenteVisualSB componente : MapaComponentes.getComponentesFamilia(FabFamiliaCompVisual.SELETOR_ITENS.getRegistro())) {

            System.out.println("\n"
                    + "Listando os Componentes da Familia: " + FabFamiliaCompVisual.SELETOR_ITENS.getNomeFAmilia() + "\n"
                    + "Nome do Componente: " + componente.getNomeComponente() + "\n"
                    + "Familia do Componente: " + componente.getFamilia().getNomeFAmilia() + "\n"
                    + "------------------------------------------------------------------------" + "\n");

        }

    }

    @Test
    public void testaListaDeComponentes() {

        try {

            MapaComponentes.mapaComponentesCriarMapa();

            List<ItfComponenteVisualSB> listaComponentes = new ArrayList<>();

            listaComponentes = (List) MapaComponentes.getTodosComponentes();

            assertNotNull("A lista de Componetes não foi definida!", listaComponentes);

            System.out.println("\n" + "Lista de Componentes criada com Sucesso! " + "\n"
                    + listaComponentes.size() + " Componentes na Lista" + "\n");

        } catch (Throwable t) {

            lancarErroJUnit(t);

        }

    }

    @Test
    public void testaListaDeFamiliasDeComponentes() {

        try {

            MapaComponentes.mapaComponentesCriarMapa();

            List<FamiliaComponente> listaFamiliaComponentes = new ArrayList<>();

            listaFamiliaComponentes = MapaComponentes.getTodasFamiliasComponentes();

            assertNotNull("\n" + "A lista de Familias de Componetes não foi definida!", listaFamiliaComponentes);

            System.out.println("Lista de Familia de Componentes criada com Sucesso! " + "\n"
                    + listaFamiliaComponentes.size() + " Familias na Lista" + "\n");

        } catch (Throwable t) {

            lancarErroJUnit(t);

        }

    }

}
