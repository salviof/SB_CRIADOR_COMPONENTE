/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits;

import br.org.coletivojava.erp.comunicacao.transporte.ERPTransporteComunicacao;
import com.super_bits.modulosSB.SBCore.ConfigGeral.SBCore;
import com.super_bits.modulosSB.SBCore.modulos.comunicacao.EnvelopeComunicacaoSimples;
import com.super_bits.modulosSB.SBCore.modulos.comunicacao.FabTipoComunicacao;
import com.super_bits.modulosSB.SBCore.modulos.comunicacao.FabTipoRespostaComunicacao;

import com.super_bits.modulosSB.SBCore.modulos.comunicacao.ItfComunicacao;
import java.util.List;
import org.junit.Test;

/**
 *
 * @author desenvolvedor
 */
public class TesteComunicacao extends TestesWP_CRIADOR_COMPONENTES {

    @Test
    public void testeComuinicacaoModal() {
        SBCore.getCentralComunicacao().
                gerarComunicacaoSistema_UsuairoLogado(FabTipoComunicacao.NOTIFICAR, "Teste", ERPTransporteComunicacao.INTRANET_MODAL);
        List<ItfComunicacao> pTeste = SBCore.getCentralComunicacao().getComunicacoesAguardandoRespostaDoDestinatario(SBCore.getUsuarioLogado());
        //SBCore.getCentralComunicacao().aguardarRespostaComunicacao(FabTipoTransporteComunicacao.INTRANET_MENU, "", 0, FabTipoRespostaComunicacao.PERSONALIZADA);
        if (SBCore.getCentralComunicacao().aguardarRespostaComunicacao(ERPTransporteComunicacao.INTRANET_MODAL.getRegistro(),
                SBCore.getCentralDeComunicacao().gerarComunicacaoSistema_UsuairoLogado(FabTipoComunicacao.PERGUNTAR_SIM_OU_NAO,
                        "teste"),
                0, FabTipoRespostaComunicacao.PERSONALIZADA) == FabTipoRespostaComunicacao.SIM) {
            System.out.println("Sim");
        } else {
            System.out.println("Nao");
        }
        SBCore.getCentralComunicacao().gerarComunicacaoSistema_UsuairoLogado(FabTipoComunicacao.NOTIFICAR, "Teste", ERPTransporteComunicacao.SMS, ERPTransporteComunicacao.INTRANET_MODAL);
        SBCore.getCentralComunicacao().gerarComunicacaoSistema_UsuairoLogado(FabTipoComunicacao.NOTIFICAR, "Teste", ERPTransporteComunicacao.SMS, ERPTransporteComunicacao.INTRANET_MODAL);
        List<ItfComunicacao> cms = SBCore.getCentralComunicacao().getComunicacoesAguardandoRespostaDoDestinatario(SBCore.getUsuarioLogado());
        for (ItfComunicacao cm : cms) {
            System.out.println(cm.getAssunto());
            SBCore.getCentralComunicacao().responderComunicacao(cm, cm.getRepostasPossiveis().get(0));
        }

        EnvelopeComunicacaoSimples teste = new EnvelopeComunicacaoSimples();

    }

    public void testeComunicacaoSMS() {

    }

    public void testeComunicacaoRocketChat() {

    }

}
