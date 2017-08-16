/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.model;

import com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.configAppp.TesteSB_CRIADOR_COMPONENTE;
import com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.regras_de_negocio_e_controller.dominioBeanExemploTeste.FabAcaoBeanExemploDemonstrativo;
import com.super_bits.modulosSB.SBCore.UtilGeral.UtilSBCoreLayoutComponenteEmTelas;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.permissoes.ItfAcaoFormularioEntidade;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.CaminhoCampoExibicaoFormulario;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.componentes.FabCompVisualBotaoAcao;
import com.super_bits.modulosSB.SBCore.modulos.view.telas.ColunaTela;
import com.super_bits.modulosSB.SBCore.modulos.view.telas.FabTipoTamanhoTelas;
import com.super_bits.modulosSB.SBCore.modulos.view.telas.LayoutComponentesEmTelaComGrupoDeAcoes;
import java.util.List;
import org.junit.Test;

/**
 *
 * @author desenvolvedor
 */
public class LayoutTeste extends TesteSB_CRIADOR_COMPONENTE {

    @Test
    public void teste() {
        try {
            BeanExemplo objTeste = new BeanExemplo();

            ItfAcaoFormularioEntidade acaoForm = FabAcaoBeanExemploDemonstrativo.BEAN_EXEMPLO_FRM_LISTAR.getRegistro().getComoFormularioEntidade();
            List<CaminhoCampoExibicaoFormulario> lista = (List) acaoForm.getGruposDeCampos().get(0).getCampos();
            LayoutComponentesEmTelaComGrupoDeAcoes layout = UtilSBCoreLayoutComponenteEmTelas.gerarLayoutColunasComAcao(
                    objTeste, lista, (List) acaoForm.getAcaoPrincipal().getAcoesVinculadas(),
                    FabCompVisualBotaoAcao.ICONE, FabTipoTamanhoTelas.DESKTOP_NORMAL.getRegistro(), false);
            layout.getUltimaColuna();

            for (ColunaTela pColuna : layout.getColunas()) {

                System.out.println(pColuna.getPorcentagemCalculada());

            }

        } catch (Throwable t) {
            lancarErroJUnit(t);
        }
    }

}
