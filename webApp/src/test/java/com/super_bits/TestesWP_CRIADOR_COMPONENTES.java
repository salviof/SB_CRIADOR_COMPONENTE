/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits;

import com.super_bits.config.webPaginas.ConfigWPSB_CRIADOR_COMPONENTE;
import com.super_bits.config.webPaginas.ConfiguradorCoreWebAppSB_CRIADOR_COMPONENTE;
import com.super_bits.modulosSB.SBCore.ConfigGeral.SBCore;
import com.super_bits.modulosSB.webPaginas.ConfigGeral.SBWebPaginas;
import testesFW.TesteJunit;

/**
 *
 * @author desenvolvedor
 */
public class TestesWP_CRIADOR_COMPONENTES extends TesteJunit {

    @Override
    protected void configAmbienteDesevolvimento() {
        SBCore.configurar(new ConfiguradorCoreWebAppSB_CRIADOR_COMPONENTE(), SBCore.ESTADO_APP.DESENVOLVIMENTO);
        SBWebPaginas.configurar(new ConfigWPSB_CRIADOR_COMPONENTE());
        //  SBPersistencia.configuraJPA(new ConfigPersistenciaSB_CRIADOR_COMPONENTE());
    }

}
