/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.regras_de_negocio_e_controller.dominioBeanExemploTeste;

import com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.model.BeanExemplo;
import com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.regras_de_negocio_e_controller.FabModulosIProjetoTesteI;
import com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.regras_de_negocio_e_controller.InfoModuloSB_CRIADOR_COMPONENTE;
import com.super_bits.modulos.SBAcessosModel.fabricas.ItfFabricaDeAcoesPersistencia;
import com.super_bits.modulosSB.SBCore.modulos.Controller.anotacoes.InfoTipoAcaoController;
import com.super_bits.modulosSB.SBCore.modulos.Controller.anotacoes.InfoTipoAcaoFormulario;
import com.super_bits.modulosSB.SBCore.modulos.Controller.anotacoes.InfoTipoAcaoGestaoEntidade;
import com.super_bits.modulosSB.SBCore.modulos.comunicacao.FabTipoComunicacao;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.icones.FabIconeFontAwesome;

/**
 *
 * @author desenvolvedor
 */
@InfoModuloSB_CRIADOR_COMPONENTE(modulo = FabModulosIProjetoTesteI.DEMONSTRACAO_BASICA)
public enum FabAcaoBeanExemploDemonstrativo implements ItfFabricaDeAcoesPersistencia {

    @InfoTipoAcaoGestaoEntidade(icone = "fa fa-tag", entidade = BeanExemplo.class)
    BEAN_EXEMPLO_MB,
    @InfoTipoAcaoFormulario(campos = {"id", "apelido", "verdadeiroOuFalso", "beanFilho.apelido", "seletorOpcao"})
    BEAN_EXEMPLO_FRM_LISTAR,
    @InfoTipoAcaoFormulario()
    BEAN_EXEMPLO_FRM_VISUALIZAR,
    @InfoTipoAcaoFormulario()
    BEAN_EXEMPLO_FRM_EDITAR,
    @InfoTipoAcaoFormulario()
    BEAN_EXEMPLO_FRM_NOVO,
    @InfoTipoAcaoFormulario(nomeAcao = "Testes SubLista",
            campos = {"[separador:subLista]", "listaParticular[].porcentagem", "listaParticular[].senha",
                "listaParticular[].listasExemplo", "beanFilho.apelido"

            },
            iconeFonteAnsowame = FabIconeFontAwesome.REG_LISTAR)
    BEAN_EXEMPLO_FRM_SUB_LISTA_EXEMPLO,
    @InfoTipoAcaoController()
    BEAN_EXEMPLO_CTR_SALVAR_MERGE,
    @InfoTipoAcaoController()
    BEAN_EXEMPLO_CTR_SALVAR_NOVO,
    @InfoTipoAcaoController()
    BEAN_EXEMPLO_CTR_SALVAR_EDICAO,
    @InfoTipoAcaoController()
    BEAN_EXEMPLO_CTR_ALTERAR_STATUS,
    @InfoTipoAcaoController(comunicacao = FabTipoComunicacao.PERGUNTAR_SIM_OU_NAO, fraseComunicação = "Confirma isto, mesmo sabendo que é um simples teste que não vai dar em nada?")
    BEAN_EXEMPLO_CTR_ATIVAR,
    @InfoTipoAcaoController(campoJustificativa = "listasExemplo")
    BEAN_EXEMPLO_CTR_CAMPO_COM_JUSTIFICATIVA,
    @InfoTipoAcaoFormulario(iconeFonteAnsowame = FabIconeFontAwesome.REG_PESQUISA_AVANCADA)
    BEAN_EXEMPLO_FRM_MODAL_TESTE,
    @InfoTipoAcaoFormulario()
    BEAN_EXEMPLO_FRM_SELECAO_DE_ACAO;

}
