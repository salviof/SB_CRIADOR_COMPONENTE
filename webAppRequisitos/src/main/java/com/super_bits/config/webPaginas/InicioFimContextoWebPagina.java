/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.config.webPaginas;

import com.super_bits.modulosSB.Persistencia.ConfigGeral.SBPersistencia;
import com.super_bits.modulosSB.SBCore.ConfigGeral.SBCore;
import com.super_bits.modulosSB.webPaginas.ConfigGeral.ConfiguradorCoreDeProjetoWebWarAbstrato;
import com.super_bits.modulosSB.webPaginas.ConfigGeral.ItfInicioFimAppWP;
import com.super_bits.modulosSB.webPaginas.ConfigGeral.SBWebPaginas;

/**
 *
 * @author Salvio
 */
public class InicioFimContextoWebPagina implements ItfInicioFimAppWP {

    @Override
    public void inicio() {
        System.out.println("Inicio Contexto");
        SBCore.configurar(new ConfiguradorCoreRequisitosSB_CRIADOR_COMPONENTE(ConfiguradorCoreDeProjetoWebWarAbstrato.contextoDoServlet), SBCore.ESTADO_APP.HOMOLOGACAO);
        SBPersistencia.configuraJPA(FabConfiguracoesDeAmbienteSB_CRIADOR_COMPONENTERequisitos.HOMOLOGACAO.getConfiguracaoPersistencia());
        SBWebPaginas.configurar(FabConfiguracoesDeAmbienteSB_CRIADOR_COMPONENTERequisitos.HOMOLOGACAO.getConfiguracaoWebPaginas());
    }

    @Override
    public void fim() {
        System.out.println("FIm do contexto para" + SBCore.getNomeProjeto());
    }

}
