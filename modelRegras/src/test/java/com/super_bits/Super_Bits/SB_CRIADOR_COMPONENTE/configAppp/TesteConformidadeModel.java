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
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.UtilSBCoreReflexaoCaminhoCampo;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.CaminhoCampoReflexao;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.FabGruposPadrao;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.GrupoCampos;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.ItfCampoExibicaoFormulario;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campoInstanciado.ItfCampoInstanciado;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

/**
 *
 * @author desenvolvedor
 */
public class TesteConformidadeModel extends TesteSB_CRIADOR_COMPONENTE {

    @Test
    public void teste() {

        try {

            BeanExemplo testeBeanGrupo = new BeanExemplo();

            ItfCampoInstanciado campo = testeBeanGrupo.getCampoInstanciadoByNomeOuAnotacao("templateHtml");

            System.out.println(campo.getComoTemplate().getOpcoesPalavraChave());
            System.out.println(campo.getComoTemplate().getOpcoesPalavaChaveJson());

            GrupoCampos grupoPadrao = FabGruposPadrao.GRUPO_PADRAO_ITEM_NORMAL.getGrupoCampoIgnorandoCamposNaoEncontrados(testeBeanGrupo.getClass());

            System.out.println("Testes básico");
            ItfAcaoFormulario formularioListar = (ItfAcaoFormulario) UtilFabricaDeAcoesAcessosModel.getNovaAcao(FabAcaoBeanExemploDemonstrativo.BEAN_EXEMPLO_FRM_LISTAR, false);
            SBCore.getCentralDeMensagens().enviarMsgAvisoAoDesenvolvedor(formularioListar.getCampos().toString());

            List<CaminhoCampoReflexao> caminhosTeste = new ArrayList();

            caminhosTeste.add(new CaminhoCampoReflexao("listaParticular[].listasExemplo", BeanExemplo.class));
            caminhosTeste.add(new CaminhoCampoReflexao("listaParticular[].porcentagem", BeanExemplo.class));
            caminhosTeste.add(new CaminhoCampoReflexao("listaParticular[].senha", BeanExemplo.class));

            //caminhosTeste.add(new CaminhoCampoReflexao("listaParticular[]", BeanExemplo.class));
            String test = UtilSBCoreReflexaoCaminhoCampo.getStrCaminhoCampoSemUltimoCampo("BeanExemplo.listaParticular[]");

            for (CaminhoCampoReflexao cmTeste : caminhosTeste) {
                System.out.println(cmTeste.getCampoFieldReflection().getType());

            }
            List<GrupoCampos> grupos = UtilSBCoreReflexaoCaminhoCampo.buildAgrupamentoCampos(caminhosTeste);
            for (GrupoCampos gp : grupos) {

                gp.getCampos();
                for (ItfCampoExibicaoFormulario cm : gp.getCampos()) {
                    System.out.println(cm.getCaminhoComleto());

                    if (cm.isUmCampoComLista()) {
                        System.out.println("Campo Vinculado");
                        System.out.println(cm.getComoCampoListagem().getCamposDoSubFormulario());
                    }
                }

            }

            ItfAcaoFormulario subFormulario = (ItfAcaoFormulario) UtilFabricaDeAcoesAcessosModel.getNovaAcao(FabAcaoBeanExemploDemonstrativo.BEAN_EXEMPLO_FRM_SUB_LISTA_EXEMPLO, false);
            SBCore.getCentralDeMensagens().enviarMsgAvisoAoDesenvolvedor(subFormulario.getCampos().toString());
            SBCore.getCentralDeMensagens().enviarMsgAvisoAoDesenvolvedor(subFormulario.getGruposDeCampos().toString());

            BeanExemplo teste = new BeanExemplo(true);

            ItfCampoInstanciado cpbairro = teste.getCampoInstanciadoByNomeOuAnotacao("localizacao.bairro");
            SBCore.getCentralDeMensagens().enviarMsgAvisoAoDesenvolvedor(cpbairro.getPropriedadesReflexaoAtributo().getClasseDeclaracaoAtributo().getSimpleName());

            ItfCampoInstanciado campoinst = teste.getCampoInstanciadoByNomeOuAnotacao("listaParticular");
            SBCore.getCentralDeMensagens().enviarMsgAvisoAoDesenvolvedor(campoinst.getFabricaTipoAtributo().toString());
            SBCore.getCentralDeMensagens().enviarMsgAvisoAoDesenvolvedor(campoinst.getComponenteVisualPadrao().toString());

        } catch (Throwable t) {
            lancarErroJUnit(t);
        }
    }

}
