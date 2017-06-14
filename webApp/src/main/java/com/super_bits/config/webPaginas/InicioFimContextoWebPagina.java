/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.config.webPaginas;

import com.super_bits.configSBFW.acessos.UtilSB_CRIADOR_COMPONENTEGlobalVar;
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
        SBCore.configurar(new ConfiguradorCoreWebAppSB_CRIADOR_COMPONENTE(
                ConfiguradorCoreDeProjetoWebWarAbstrato.contextoDoServlet),
                SBCore.ESTADO_APP.PRODUCAO);
        //SBPersistencia.configuraJPA(FabConfiguracoesDeAmbienteWebSB_CRIADOR_COMPONENTE.HOMOLOGACAO.getConfiguracaoPersistencia());
        SBWebPaginas.configurar(FabConfiguracoesDeAmbienteWebSB_CRIADOR_COMPONENTE.HOMOLOGACAO.getConfiguracaoWebPaginas());
        UtilSB_CRIADOR_COMPONENTEGlobalVar.adicionarObjetosEstaticosProjeto();
        SBCore.getCentralDeArquivos().setCentralDePermissao(new CentralPermissaoArquivoSBComponente());
        new SiteMap();

    }

    @Override
    public void fim() {
        System.out.println("FIm do contexto para" + SBCore.getNomeProjeto());
    }

}
