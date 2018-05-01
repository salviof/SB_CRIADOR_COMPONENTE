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
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.ItfCampoExibicaoFormulario;
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

            String teste = "http://localhost:8080/SB_CRIADOR_COMPONENTE/Demonstrativo_Bean_Exemplo//.wp;jsessionid=qo77vde2y74uq6onqevf9bmf";

            String resultado = teste.replaceAll(".wp.*", "");
            System.out.println(resultado);

            BeanExemplo objTeste = new BeanExemplo();

            ItfAcaoFormularioEntidade acaoForm = FabAcaoBeanExemploDemonstrativo.BEAN_EXEMPLO_FRM_LISTAR.getRegistro().getComoFormularioEntidade();
            List<ItfCampoExibicaoFormulario> lista = (List) acaoForm.getGruposDeCampos().get(0).getCampos();

            System.out.println(objTeste.getCampoInstanciadoByNomeOuAnotacao("id").getComponenteVisualPadrao().getPesoLargura());
            System.out.println(objTeste.getCampoInstanciadoByNomeOuAnotacao("id").getComponenteVisualPadrao().getNomeComponente());

            System.out.println(objTeste.getCampoInstanciadoByNomeOuAnotacao("apelido").getComponenteVisualPadrao().getPesoLargura());
            System.out.println(objTeste.getCampoInstanciadoByNomeOuAnotacao("apelido").getComponenteVisualPadrao().getNomeComponente());

            LayoutComponentesEmTelaComGrupoDeAcoes layout = UtilSBCoreLayoutComponenteEmTelas.gerarLayoutColunasComAcao(
                    lista, (List) acaoForm.getComoGestaoEntidade().getAcoesVinculadas(),
                    FabCompVisualBotaoAcao.ICONE, FabTipoTamanhoTelas.DESKTOP_GRANDE.getRegistro(), "TESTE", false);
            layout.getUltimaColuna();

            for (ColunaTela pColuna : layout.getColunas()) {

                System.out.println(pColuna.getComponenteVinculado().getNomeComponente() + "-->" + pColuna.getPorcentagemCalculada());

            }

        } catch (Throwable t) {
            lancarErroJUnit(t);
        }
    }

}
