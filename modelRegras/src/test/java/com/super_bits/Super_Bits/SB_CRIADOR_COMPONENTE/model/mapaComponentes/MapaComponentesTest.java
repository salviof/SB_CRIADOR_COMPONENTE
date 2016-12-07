/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.model.mapaComponentes;

import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.ComponenteVisualSB;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.FabFamiliaCompVisual;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.FamiliaComponente;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.ItfFabFamiliaComponenteVisual;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.ItfFabTipoComponenteVisual;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author desenvolvedor
 */
public class MapaComponentesTest {

    @Test
    public void testeMapaComponetesPorFamilia() {

        MapaComponentes.mapaComponentesCriarMapa();

        for (ComponenteVisualSB componente : MapaComponentes.getComponentesFamilia(FabFamiliaCompVisual.BOTAO_DE_ACAO.getRegistro())) {

            System.out.println("\n"
                    + "Listando os Componentes da Familia: " + FabFamiliaCompVisual.BOTAO_DE_ACAO.getNomeFAmilia() + "\n"
                    + "Nome do Componente: " + componente.getNome() + "\n"
                    + "Familia do Componente: " + componente.getFamilia().getNomeFAmilia() + "\n"
                    + "------------------------------------------------------------------------" + "\n");

        }

        for (ComponenteVisualSB componente : MapaComponentes.getComponentesFamilia(FabFamiliaCompVisual.COMPONENTE_SISTEMA.getRegistro())) {

            System.out.println("\n"
                    + "Listando os Componentes da Familia: " + FabFamiliaCompVisual.COMPONENTE_SISTEMA.getNomeFAmilia() + "\n"
                    + "Nome do Componente: " + componente.getNome() + "\n"
                    + "Familia do Componente: " + componente.getFamilia().getNomeFAmilia() + "\n"
                    + "------------------------------------------------------------------------" + "\n");

        }

        for (ComponenteVisualSB componente : MapaComponentes.getComponentesFamilia(FabFamiliaCompVisual.INPUT.getRegistro())) {

            System.out.println("\n"
                    + "Listando os Componentes da Familia: " + FabFamiliaCompVisual.INPUT.getNomeFAmilia() + "\n"
                    + "Nome do Componente: " + componente.getNome() + "\n"
                    + "Familia do Componente: " + componente.getFamilia().getNomeFAmilia() + "\n"
                    + "------------------------------------------------------------------------" + "\n");

        }

        for (ComponenteVisualSB componente : MapaComponentes.getComponentesFamilia(FabFamiliaCompVisual.ITEM_BEAN_SIMPLES.getRegistro())) {

            System.out.println("\n"
                    + "Listando os Componentes da Familia: " + FabFamiliaCompVisual.ITEM_BEAN_SIMPLES.getNomeFAmilia() + "\n"
                    + "Nome do Componente: " + componente.getNome() + "\n"
                    + "Familia do Componente: " + componente.getFamilia().getNomeFAmilia() + "\n"
                    + "------------------------------------------------------------------------" + "\n");

        }

        for (ComponenteVisualSB componente : MapaComponentes.getComponentesFamilia(FabFamiliaCompVisual.ITENS_BEAN_SIMPLES.getRegistro())) {

            System.out.println("\n"
                    + "Listando os Componentes da Familia: " + FabFamiliaCompVisual.ITENS_BEAN_SIMPLES.getNomeFAmilia() + "\n"
                    + "Nome do Componente: " + componente.getNome() + "\n"
                    + "Familia do Componente: " + componente.getFamilia().getNomeFAmilia() + "\n"
                    + "------------------------------------------------------------------------" + "\n");

        }

        for (ComponenteVisualSB componente : MapaComponentes.getComponentesFamilia(FabFamiliaCompVisual.LAYOUT_INPUT.getRegistro())) {

            System.out.println("\n"
                    + "Listando os Componentes da Familia: " + FabFamiliaCompVisual.LAYOUT_INPUT.getNomeFAmilia() + "\n"
                    + "Nome do Componente: " + componente.getNome() + "\n"
                    + "Familia do Componente: " + componente.getFamilia().getNomeFAmilia() + "\n"
                    + "------------------------------------------------------------------------" + "\n");

        }

        for (ComponenteVisualSB componente : MapaComponentes.getComponentesFamilia(FabFamiliaCompVisual.MENU.getRegistro())) {

            System.out.println("\n"
                    + "Listando os Componentes da Familia: " + FabFamiliaCompVisual.MENU.getNomeFAmilia() + "\n"
                    + "Nome do Componente: " + componente.getNome() + "\n"
                    + "Familia do Componente: " + componente.getFamilia().getNomeFAmilia() + "\n"
                    + "------------------------------------------------------------------------" + "\n");

        }

        for (ComponenteVisualSB componente : MapaComponentes.getComponentesFamilia(FabFamiliaCompVisual.SELETOR_ITEM.getRegistro())) {

            System.out.println("\n"
                    + "Listando os Componentes da Familia: " + FabFamiliaCompVisual.SELETOR_ITEM.getNomeFAmilia() + "\n"
                    + "Nome do Componente: " + componente.getNome() + "\n"
                    + "Familia do Componente: " + componente.getFamilia().getNomeFAmilia() + "\n"
                    + "------------------------------------------------------------------------" + "\n");

        }

        for (ComponenteVisualSB componente : MapaComponentes.getComponentesFamilia(FabFamiliaCompVisual.SELETOR_ITENS.getRegistro())) {

            System.out.println("\n"
                    + "Listando os Componentes da Familia: " + FabFamiliaCompVisual.SELETOR_ITENS.getNomeFAmilia() + "\n"
                    + "Nome do Componente: " + componente.getNome() + "\n"
                    + "Familia do Componente: " + componente.getFamilia().getNomeFAmilia() + "\n"
                    + "------------------------------------------------------------------------" + "\n");

        }

    }

}
