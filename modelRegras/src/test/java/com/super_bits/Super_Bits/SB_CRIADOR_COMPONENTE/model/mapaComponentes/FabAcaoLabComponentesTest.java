/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.model.mapaComponentes;

import com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.configAppp.TesteSB_CRIADOR_COMPONENTE;
import com.super_bits.modulos.SBAcessosModel.model.acoes.AcaoDeEntidadeController;
import org.junit.Test;

/**
 *
 * @author desenvolvedor
 */
public class FabAcaoLabComponentesTest extends TesteSB_CRIADOR_COMPONENTE {

    /**
     * Test of values method, of class FabAcaoLabComponentes.
     */
    @Test
    public void testValues() {
        try {

            AcaoDeEntidadeController testeComunicacao = (AcaoDeEntidadeController) FabAcaoLabComponentes.LAB_COMPONENTES_CTR_TESTE_COMUNICACAO.getRegistro();
            testeComunicacao.isPrecisaComunicacao();
            testeComunicacao.isPrecisaJustificativa();
            testeComunicacao.isTemXHTMLModalVinculado();
        } catch (Throwable t) {
            lancarErroJUnit(t);
        }
    }

}
