/*
 *
*Classe Spolier #1
*
 */
package com.super_bits;

import com.super_bits.modulos.SBAcessosModel.model.UsuarioSB;
import javax.persistence.Id;

/**
 *
 * @author salvio Furbino
 */
public class MembroColetivoJava extends UsuarioSB {

    @Id
    private Long id;
    // @InfoCampo(tipo =)
    private String nome;
    private int patente;

}
