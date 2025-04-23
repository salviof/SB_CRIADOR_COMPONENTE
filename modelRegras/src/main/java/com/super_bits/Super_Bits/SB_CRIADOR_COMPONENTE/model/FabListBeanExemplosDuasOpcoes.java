/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.model;

import com.super_bits.modulosSB.SBCore.modulos.fabrica.ItfFabrica;

/**
 *
 * @author desenvolvedor
 */
public enum FabListBeanExemplosDuasOpcoes implements ItfFabrica {

    EXEMPLO1,
    EXEMPLO2;

    @Override
    public Object getRegistro() {
        BeanExemplo exemplo = new BeanExemplo();
        exemplo.setNome(this.toString());
        exemplo.setId(this.ordinal() + 1123456789l);
        return exemplo;
    }

}
