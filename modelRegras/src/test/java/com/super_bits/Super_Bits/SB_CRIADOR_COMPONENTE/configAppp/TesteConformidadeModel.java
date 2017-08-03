/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.configAppp;

import com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.model.BeanExemplo;
import com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.regras_de_negocio_e_controller.dominioBeanExemploTeste.FabAcaoBeanExemploDemonstrativo;
import com.super_bits.modulos.SBAcessosModel.model.acoes.UtilFabricaDeAcoesAcessosModel;
import com.super_bits.modulosSB.SBCore.ConfigGeral.SBCore;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.permissoes.ItfAcaoFormulario;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campoInstanciado.ItfCampoInstanciado;
import org.junit.Test;

/**
 *
 * @author desenvolvedor
 */
public class TesteConformidadeModel extends TesteSB_CRIADOR_COMPONENTE {

    @Test
    public void teste() {

        try {
            System.out.println("Testes básico");
            ItfAcaoFormulario formularioListar = (ItfAcaoFormulario) UtilFabricaDeAcoesAcessosModel.getNovaAcao(FabAcaoBeanExemploDemonstrativo.BEAN_EXEMPLO_FRM_LISTAR, false);
            SBCore.getCentralDeMensagens().enviarMsgAvisoAoDesenvolvedor(formularioListar.getCampos().toString());

            ItfAcaoFormulario subFormulario = (ItfAcaoFormulario) UtilFabricaDeAcoesAcessosModel.getNovaAcao(FabAcaoBeanExemploDemonstrativo.BEAN_EXEMPLO_FRM_SUB_LISTA_EXEMPLO, false);
            SBCore.getCentralDeMensagens().enviarMsgAvisoAoDesenvolvedor(subFormulario.getCampos().toString());
            SBCore.getCentralDeMensagens().enviarMsgAvisoAoDesenvolvedor(subFormulario.getGruposDeCampos().toString());

            BeanExemplo teste = new BeanExemplo(true);

            ItfCampoInstanciado cpbairro = teste.getCampoInstanciadoByNomeOuAnotacao("localizacao.bairro");
            SBCore.getCentralDeMensagens().enviarMsgAvisoAoDesenvolvedor(cpbairro.getCampoReflection().getClasseDeclaradaOuTipoEmCasoDeLista().getSimpleName());

            ItfCampoInstanciado campoinst = teste.getCampoInstanciadoByNomeOuAnotacao("listaParticular");
            SBCore.getCentralDeMensagens().enviarMsgAvisoAoDesenvolvedor(campoinst.getFabricaTipoAtributo().toString());
            SBCore.getCentralDeMensagens().enviarMsgAvisoAoDesenvolvedor(campoinst.getComponenteVisualPadrao().toString());

        } catch (Throwable t) {
            lancarErroJUnit(t);
        }
    }

}
