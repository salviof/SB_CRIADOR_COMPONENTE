/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.config.webPaginas;

import com.super_bits.projeto.controller.FabAcaoPrevisaoProjeto;
import com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.model.config.ConfigPersistenciaSB_CRIADOR_COMPONENTE;
import com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.regras_de_negocio_e_controller.MODULOS.demonstracao_acesso_restrito.FabAcaoAcessoRestritoExemplo;
import com.super_bits.configSBFW.acessos.ConfigAcessos;
import com.super_bits.modulos.SBAcessosModel.controller.FabAcaoSeguranca;
import com.super_bits.modulos.SBAcessosModel.fabricas.FabAcaoProjetoSB;
import com.super_bits.modulosSB.Persistencia.ConfigGeral.ItfConfigSBPersistencia;
import com.super_bits.modulosSB.SBCore.ConfigGeral.ConfigCoreCustomizavel;
import com.super_bits.modulosSB.SBCore.ConfigGeral.ControleDeSessaoPadrao;
import com.super_bits.modulosSB.SBCore.ConfigGeral.SBCore;
import com.super_bits.modulosSB.SBCore.modulos.Mensagens.CentramMensagemProgramadorMsgStop;
import com.super_bits.modulosSB.SBCore.modulos.TratamentoDeErros.ErroSBCoreDeveloperSopMessagem;
import com.super_bits.modulosSB.SBCore.modulos.logeventos.CentralLogEventosArqTextoGenerica;
import com.super_bits.modulosSB.webPaginas.ConfigGeral.ItfConfigWebPagina;
import com.super_bits.modulosSB.webPaginas.controller.paginasDoSistema.FabAcaoPaginasDoSistema;
import com.super_bits.modulosSB.webPaginas.util.CentralDeMensagensJSFAPP;
import com.super_bits.modulosSB.SBCore.ConfigGeral.ItfConfiguracaoCoreSomenteLeitura;

/**
 *
 * É Importante criar ambientes de execução diferentes de acordo com o estágio
 * de produção
 *
 * O sistema perimite alterar:  <br>
 * A classe responsável por envio de mensagens ao desenvolvedor, ao usuário, e
 * logs de sistema <br>
 * A Classe responsável por tratamento de erros A Classe responsável pela
 * configuração de acessos do sistema  <br>
 * A classe responsável por armazenamento de logs <br>
 *
 *
 *
 * @author desenvolvedor
 */
public enum FabConfiguracoesDeAmbienteSB_CRIADOR_COMPONENTERequisitos {

    DESENVOLVIMENTO, HOMOLOGACAO, PRODUCAO;

    public ItfConfiguracaoCoreSomenteLeitura getConfiguracao() {
        ConfigCoreCustomizavel cfg = new ConfigCoreCustomizavel();
        cfg.setCliente("Super_Bits");
        // TODO ALTERAR GRUPO DO PROJETO AO INICIAR NOVO PROJETO
        cfg.setGrupoProjeto("SuperBitsWPStarter");
        cfg.setNomeProjeto("webAppRequisitos");
        cfg.setDiretorioBase("SuperBits_FrameWork");
        cfg.setCentralDeEventos(CentralLogEventosArqTextoGenerica.class);
        cfg.setCentralMEnsagens(CentralDeMensagensJSFAPP.class);
        cfg.setClasseErro(ErroSBCoreDeveloperSopMessagem.class);
        cfg.setControleDeSessao(ControleDeSessaoPadrao.class);
        cfg.setFabricaDeAcoes(new Class[]{FabAcaoSeguranca.class,
            FabAcaoAcessoRestritoExemplo.class,
            FabAcaoPrevisaoProjeto.class,
            FabAcaoPaginasDoSistema.class,
            FabAcaoPrevisaoProjeto.class,
            FabAcaoProjetoSB.class
        });
        cfg.setClasseConfigPermissao(ConfigAcessos.class);

        switch (this) {
            case DESENVOLVIMENTO:
                cfg.setEstadoAPP(SBCore.ESTADO_APP.DESENVOLVIMENTO);
                cfg.setCentralMEnsagens(CentramMensagemProgramadorMsgStop.class);
                cfg.setClasseErro(ErroSBCoreDeveloperSopMessagem.class);
                break;
            case HOMOLOGACAO:
                cfg.setEstadoAPP(SBCore.ESTADO_APP.HOMOLOGACAO);
                break;
            case PRODUCAO:
                cfg.setEstadoAPP(SBCore.ESTADO_APP.PRODUCAO);
                break;
            default:
                throw new AssertionError(this.name());

        }
        return cfg;

    }

    public ItfConfigSBPersistencia getConfiguracaoPersistencia() {
        return new ConfigPersistenciaSB_CRIADOR_COMPONENTE();
    }

    public ItfConfigWebPagina getConfiguracaoWebPaginas() {
        return new ConfigWPSB_CRIADOR_COMPONENTE();
    }

}
