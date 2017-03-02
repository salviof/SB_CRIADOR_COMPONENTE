/*
 *
*Classe Spolier #1
*
 */
package com.super_bits;

import com.super_bits.modulos.SBAcessosModel.model.UsuarioSB;
import com.super_bits.modulosSB.Persistencia.registro.persistidos.modulos.CEP.Localizacao;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.anotacoes.InfoCampo;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.anotacoes.InfoClasse;
import javax.persistence.Id;

/**
 *
 * @author salvio Furbino
 */
@InfoClasse(tags = {"Membro do Coletivo"})
public class MembroColetivoJava extends UsuarioSB {

    @Id
    private int id;
    // @InfoCampo(tipo =)
    private String nome;
    private int patente;

}
