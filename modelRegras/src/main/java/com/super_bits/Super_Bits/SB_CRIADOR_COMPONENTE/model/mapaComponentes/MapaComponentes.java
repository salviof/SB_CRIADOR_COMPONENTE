/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.model.mapaComponentes;

import com.google.common.collect.Lists;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.ComponenteVisualSB;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.FamiliaComponente;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.ItfFabTipoComponenteVisual;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.componentes.FabCompVIsualInputsLayout;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.componentes.FabCompVisualBotaoAcao;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.componentes.FabCompVisualEndereco;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.componentes.FabCompVisualFormularioDeAcao;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.componentes.FabCompVisualGrupoCampo;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.componentes.FabCompVisualGruposCampo;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.componentes.FabCompVisualInputs;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.componentes.FabCompVisualItem;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.componentes.FabCompVisualItens;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.componentes.FabCompVisualMenu;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.componentes.FabCompVisualSeletorItem;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.componentes.FabCompVisualSeletorItens;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.componentes.FabCompVisualSistema;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.componentes.FabcompVisualEnums;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author desenvolvedor
 */
public abstract class MapaComponentes {

    private static Map<FamiliaComponente, List<ComponenteVisualSB>> mapaComponentes = new HashMap<>();

    public static void mapaComponentesCriarMapa() {

        adicionarComponentes(FabCompVIsualInputsLayout.class);
        adicionarComponentes(FabCompVisualBotaoAcao.class);
        adicionarComponentes(FabCompVisualInputs.class);
        adicionarComponentes(FabCompVisualItem.class);
        adicionarComponentes(FabCompVisualItens.class);
        adicionarComponentes(FabCompVisualMenu.class);
        adicionarComponentes(FabCompVisualSeletorItem.class);
        adicionarComponentes(FabCompVisualSeletorItens.class);
        adicionarComponentes(FabCompVisualSistema.class);
        adicionarComponentes(FabCompVisualGrupoCampo.class);
        adicionarComponentes(FabCompVisualGruposCampo.class);
        adicionarComponentes(FabCompVisualFormularioDeAcao.class);
        adicionarComponentes(FabcompVisualEnums.class);
        adicionarComponentes(FabCompVisualEndereco.class);

    }

    private static void adicionarComponentes(Class<? extends ItfFabTipoComponenteVisual> comp) {

        for (int i = 0; i < comp.getEnumConstants().length; i++) {

            if (i == 0) {

                mapaComponentes.put(comp.getEnumConstants()[i].getComponente().getFamilia().getRegistro(), new ArrayList<ComponenteVisualSB>());

            }

            mapaComponentes.get(comp.getEnumConstants()[i].getComponente().getFamilia().getRegistro()).add(comp.getEnumConstants()[i].getComponente());

        }

    }

    public static List<ComponenteVisualSB> getComponentesFamilia(FamiliaComponente familia) {

        return mapaComponentes.get(familia);

    }

    public static List<ComponenteVisualSB> getTodosComponentes() {

        List<ComponenteVisualSB> listaComponentes = new ArrayList<>();

        for (FamiliaComponente familiaAtual : mapaComponentes.keySet()) {

            listaComponentes.addAll(getComponentesFamilia(familiaAtual));

        }

        return listaComponentes;

    }

    public static Map<FamiliaComponente, List<ComponenteVisualSB>> getMapaComponentes() {
        return mapaComponentes;
    }

    public static List<FamiliaComponente> getTodasFamiliasComponentes() {

        return Lists.newArrayList(mapaComponentes.keySet());

    }

}
