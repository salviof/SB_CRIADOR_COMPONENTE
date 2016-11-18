/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.regras_de_negocio_e_controller.MODULOS.demonstracao_acesso_restrito;

import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.ItfResposta;
import com.super_bits.modulosSB.Persistencia.dao.ControllerAbstratoSBPersistencia;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfBeanSimples;

/**
 *
 *
 *
 * @author desenvolvedor
 */
public class ModuloAcessoRestritoExemplo extends ControllerAbstratoSBPersistencia {

    @InfoAcaoAcessoRestritoExemplo(acao = FabAcaoAcessoRestritoExemplo.RECURSO_RESTRITO_CTR_SALVAR_MERGE)
    public ItfResposta salvarReursoRestrito(ItfBeanSimples teste) {
        ItfResposta resp = getNovaRespostaAutorizaChecaNulo(teste);

        if (!resp.isSucesso()) {
            return resp.dispararMensagens();
        }

        resp.addAlerta("A ação salvar recurso restrito foi executada com sucesso");

        return resp.dispararMensagens();

    }

}
