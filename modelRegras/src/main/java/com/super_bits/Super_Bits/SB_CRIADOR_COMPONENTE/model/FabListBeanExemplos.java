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
public enum FabListBeanExemplos implements ItfFabrica {

    EXEMPLO1,
    EXEMPLO2,
    EXEMPLO3,
    EXEMPLO4,
    EXEMPLO5,
    EXEMPLO6,
    EXEMPLO7,
    EXEMPLO8,
    EXEMPLO9,
    EXEMPL10,
    EXEMPL11,
    EXEMPL12,
    EXEMPL13,
    EXEMPL14,
    EXEMPL15,
    EXEMPL16,
    EXEMPL17,;

    @Override
    public Object getRegistro() {
        BeanExemplo exemplo = new BeanExemplo();
        exemplo.setNome(this.toString());
        exemplo.setId(this.ordinal() + 1);

        return exemplo;
    }

}
