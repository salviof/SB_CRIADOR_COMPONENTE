package com.super_bits;

import com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.model.config.ConfigPersistenciaSB_CRIADOR_COMPONENTE;
import com.super_bits.config.webPaginas.ConfiguradorCoreWebAppSB_CRIADOR_COMPONENTE;
import com.super_bits.modulosSB.Persistencia.ConfigGeral.SBPersistencia;
import com.super_bits.modulosSB.SBCore.ConfigGeral.SBCore;
import com.super_bits.modulosSB.webPaginas.TratamentoDeErros.RelatorioTesteWebPaginas;
import com.super_bits.modulosSB.webPaginas.controller.paginasDoSistema.FabAcaoPaginasDoSistema;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author desenvolvedor
 */
public class TesteConformidade extends RelatorioTesteWebPaginas {

    @Test
    public void testar() {
        try {
            exibirRelatorioCompleto();
            //criarMapaDeAcoesEscopoAplicacao();
            FabAcaoPaginasDoSistema.PAGINA_MB_PESQUISA_AVANCADA.getRegistro();
            gerarMangedBeansAcessoAcoes();

            System.out.println(SBCore.isIgnorarPermissoes());
        } catch (Throwable t) {
            lancarErroJUnit(t);
        }
    }

    @Override
    protected void configAmbienteDesevolvimento() {
        SBCore.configurar(new ConfiguradorCoreWebAppSB_CRIADOR_COMPONENTE(), SBCore.ESTADO_APP.DESENVOLVIMENTO);
        //     SBPersistencia.configuraJPA(new ConfigPersistenciaSB_CRIADOR_COMPONENTE());
    }

}
