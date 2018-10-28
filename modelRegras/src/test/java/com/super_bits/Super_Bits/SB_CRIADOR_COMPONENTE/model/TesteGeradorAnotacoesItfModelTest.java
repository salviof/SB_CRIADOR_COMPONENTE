/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.model;

import com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.configAppp.TesteSB_CRIADOR_COMPONENTE;
import com.super_bits.modulosSB.SBCore.modulos.geradorCodigo.model.EstruturaDeEntidade;
import com.super_bits.modulosSB.SBCore.modulos.objetos.MapaObjetosProjetoAtual;
import com.super_bits.modulosSB.SBCore.testesFW.geradorDeCodigo.util.UtilSBDevelGeradorCodigoModel;
import java.util.List;
import org.junit.Test;

/**
 *
 * @author desenvolvedor
 */
public class TesteGeradorAnotacoesItfModelTest extends TesteSB_CRIADOR_COMPONENTE {

    @Test
    public void gerarAnotacoesEInterfaces() {
        List<EstruturaDeEntidade> objetos = MapaObjetosProjetoAtual.getListaTodosEstruturaObjeto();
        objetos.forEach(est -> {

            try {
                if (est.isTemCampoValidadoresLogicos()) {
                    criarAnotacaoValidacao(est);
                }
                if (est.isTemCampoValorLogico()) {
                    criarAnotacaoCalculo(est);
                }
                if (est.isTemCampoListaDinamica()) {
                    criarAnotacaoLista(est);
                }

            } catch (Throwable t) {

            }

        });

    }

    public void criarAnotacaoValidacao(EstruturaDeEntidade estEstrutura) {
        UtilSBDevelGeradorCodigoModel.gerarCodigoCampoValidadoresApi(estEstrutura);
        estEstrutura.getCamposComValidadorLogico().forEach(UtilSBDevelGeradorCodigoModel::homologarClassesDeValidacao);

    }

    public void criarAnotacaoCalculo(EstruturaDeEntidade calculo) {
        UtilSBDevelGeradorCodigoModel.gerarCodigoCampoValorLogicaApi(calculo);
        calculo.getCamposComValorLogico().forEach(UtilSBDevelGeradorCodigoModel::homologarClassesDeValor);
    }

    public void criarAnotacaoLista(EstruturaDeEntidade lista) {
        UtilSBDevelGeradorCodigoModel.gerarCodigoCampoListasApi(lista);
        lista.getCamposComListaDinamica().forEach(UtilSBDevelGeradorCodigoModel::gerarCodigoCampoListaDinamica);
    }
}
