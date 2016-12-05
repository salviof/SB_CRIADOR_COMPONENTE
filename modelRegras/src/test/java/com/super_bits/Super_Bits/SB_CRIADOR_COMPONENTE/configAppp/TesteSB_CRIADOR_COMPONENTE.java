/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.configAppp;

import com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.model.config.ConfigPersistenciaSB_CRIADOR_COMPONENTE;
import com.super_bits.modulosSB.Persistencia.ConfigGeral.SBPersistencia;
import com.super_bits.modulosSB.Persistencia.ERROS.TesteJunitSBPersistencia;
import com.super_bits.modulosSB.SBCore.ConfigGeral.SBCore;

/**
 *
 * @author desenvolvedor
 */
public class TesteSB_CRIADOR_COMPONENTE extends TesteJunitSBPersistencia {

    @Override
    protected void configAmbienteDesevolvimento() {
        SBCore.configurar(new ConfiguradorCoreSB_CRIADOR_COMPONENTE(), SBCore.ESTADO_APP.DESENVOLVIMENTO);
        SBPersistencia.configuraJPA(new ConfigPersistenciaSB_CRIADOR_COMPONENTE());
    }

}
