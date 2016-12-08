/*
 *  Super-Bits.com CODE CNPJ 20.019.971/0001-90

 */
package com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.model.config;

import com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.FabDadosIniciaisCriadorComponente;
import com.super_bits.modulosSB.Persistencia.ConfigGeral.ItfConfigSBPersistencia;
import com.super_bits.modulosSB.SBCore.modulos.fabrica.ItfFabrica;

/**
 *
 * @author Salvio
 */
public class ConfigPersistenciaSB_CRIADOR_COMPONENTE implements ItfConfigSBPersistencia {

    @Override
    public String bancoPrincipal() {
        return "SB_CRIADOR_COMPONENTE";
    }

    @Override
    public String[] bancosExtra() {
        return new String[0];
    }

    @Override
    public String formatoDataBanco() {
        return "yyy-MM-dd";
    }

    @Override
    public String formatoDataUsuario() {
        return "dd/MM/yy";
    }

    @Override
    public String pastaImagensJPA() {
        return "/resources/img";
    }

    /**
     *
     * Metodo chamado no inicio da aplicação para atualizar os valores fixos das
     * tabelas,
     *
     */
    @Override
    public void criarBancoInicial() {
        //configure aqui os comando de SQL que devem ser executados no momento do start da aplicação
    }

    @Override
    public Class<? extends ItfFabrica>[] fabricasRegistrosIniciais() {
        return new Class[]{FabDadosIniciaisCriadorComponente.class};
    }

}
