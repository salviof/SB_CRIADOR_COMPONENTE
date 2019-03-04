/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.coletivoJava.fw.projetos.SB_CRIADOR_COMPONENTE.servico;

import com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.model.BeanExemplo;
import com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.regras_de_negocio_e_controller.dominioBeanExemploTeste.FabAcaoBeanExemploDemonstrativo;
import com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.regras_de_negocio_e_controller.dominioBeanExemploTeste.InfoAcaoBeamExemploDemo;
import com.super_bits.modulosSB.SBCore.modulos.Controller.ControllerAppAbstratoSBCore;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.ItfRespostaAcaoDoSistema;

/**
 *
 * @author SalvioF
 */
public class ModuloDemonstracaoExemplo extends ControllerAppAbstratoSBCore {

    @InfoAcaoBeamExemploDemo(acao = FabAcaoBeanExemploDemonstrativo.BEAN_EXEMPLO_CTR_CAMPO_COM_JUSTIFICATIVA)
    public static ItfRespostaAcaoDoSistema acaoComJustificativaup(BeanExemplo pBean) {

        return (ItfRespostaAcaoDoSistema) getNovaResposta(BeanExemplo.class).setProximoFormulario(FabAcaoBeanExemploDemonstrativo.BEAN_EXEMPLO_FRM_LISTAR.getRegistro().getComoFormulario());
    }

    @InfoAcaoBeamExemploDemo(acao = FabAcaoBeanExemploDemonstrativo.BEAN_EXEMPLO_CTR_ATIVAR)
    public static ItfRespostaAcaoDoSistema acaoComJustificativa(BeanExemplo pBean) {
        return getNovaResposta(BeanExemplo.class);
    }
}
