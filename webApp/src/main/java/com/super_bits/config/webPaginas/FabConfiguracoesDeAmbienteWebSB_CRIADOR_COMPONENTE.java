/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.config.webPaginas;

import com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.model.config.ConfigPersistenciaSB_CRIADOR_COMPONENTE;

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
public enum FabConfiguracoesDeAmbienteWebSB_CRIADOR_COMPONENTE {

    DESENVOLVIMENTO, HOMOLOGACAO, PRODUCAO;

    public ItfConfiguracaoCoreSomenteLeitura getConfiguracao() {
        ConfigCoreCustomizavel cfg = new ConfigCoreCustomizavel();
        cfg.setCliente("Super_Bits");
        cfg.setGrupoProjeto("SuperBits_FrameWork");
        cfg.setNomeProjeto("webApp");
        cfg.setDiretorioBase("SuperBitsWPStarter");
        cfg.setCentralDeEventos(CentralLogEventosArqTextoGenerica.class);
        cfg.setCentralMEnsagens(CentralDeMensagensJSFAPP.class);
        cfg.setClasseErro(ErroSBCoreDeveloperSopMessagem.class);
        cfg.setControleDeSessao(ControleDeSessaoPadrao.class);
        cfg.setFabricaDeAcoes(new Class[]{
            FabAcaoSeguranca.class,
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
