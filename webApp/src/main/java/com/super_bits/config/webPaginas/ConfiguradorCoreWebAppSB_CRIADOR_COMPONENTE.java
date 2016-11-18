/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.config.webPaginas;

import com.google.common.collect.Lists;
import com.super_bits.FabAcoesHomeCriadorComponente;
import com.super_bits.configSBFW.acessos.ConfigAcessos;
import com.super_bits.configSBFW.acessos.UtilSB_CRIADOR_COMPONENTEGlobalVar;
import com.super_bits.modulos.SBAcessosModel.fabricas.acoesDemonstracao.FabAcaoDemonstracaoSB;
import com.super_bits.modulosSB.SBCore.ConfigGeral.ItfConfiguracaoCoreCustomizavel;
import com.super_bits.modulosSB.SBCore.modulos.fabrica.ItfFabricaAcoes;
import com.super_bits.modulosSB.webPaginas.ConfigGeral.ConfiguradorCoreDeProjetoWebWarAbstrato;
import java.util.List;
import javax.servlet.ServletContext;

/**
 *
 * @author salvioF
 */
public class ConfiguradorCoreWebAppSB_CRIADOR_COMPONENTE extends ConfiguradorCoreDeProjetoWebWarAbstrato {

    public ConfiguradorCoreWebAppSB_CRIADOR_COMPONENTE(ServletContext contexto) {
        super(contexto);
    }

    public ConfiguradorCoreWebAppSB_CRIADOR_COMPONENTE() {
        super(true);
    }

    @Override
    public void defineFabricasDeACao(ItfConfiguracaoCoreCustomizavel pConfig) {
        pConfig.setClasseConfigPermissao(ConfigAcessos.class);
        List<Class<? extends ItfFabricaAcoes>> lista = Lists.newArrayList(UtilSB_CRIADOR_COMPONENTEGlobalVar.pAcoesDoSistema());
        Class<? extends ItfFabricaAcoes> acoes[] = new Class[lista.size() + 2];
        int i = 0;
        for (Class fab : lista) {
            acoes[i] = fab;
            i++;
        }
        acoes[i] = FabAcoesHomeCriadorComponente.class;
        i++;
        acoes[i] = FabAcaoDemonstracaoSB.class;
        pConfig.setFabricaDeAcoes(acoes);
    }

}
