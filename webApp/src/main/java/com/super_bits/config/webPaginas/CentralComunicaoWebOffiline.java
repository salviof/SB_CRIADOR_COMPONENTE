/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.config.webPaginas;

import br.org.coletivojava.erp.comunicacao.transporte.ERPTransporteComunicacao;
import com.super_bits.modulosSB.SBCore.modulos.comunicacao.CentralComunicacaoDesktop;
import com.super_bits.modulosSB.SBCore.modulos.comunicacao.ComunicacaoTransient;

import com.super_bits.modulosSB.SBCore.modulos.comunicacao.FabTipoComunicacao;

import com.super_bits.modulosSB.SBCore.modulos.comunicacao.ItfCentralComunicacao;
import com.super_bits.modulosSB.SBCore.modulos.comunicacao.ItfComunicacao;
import com.super_bits.modulosSB.SBCore.modulos.comunicacao.ItfDestinatario;
import com.super_bits.modulosSB.SBCore.modulos.comunicacao.ItfModeloMensagem;
import com.super_bits.modulosSB.SBCore.modulos.comunicacao.ItfTipoTransporteComunicacao;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfUsuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author desenvolvedor
 */
public class CentralComunicaoWebOffiline extends CentralComunicacaoDesktop implements ItfCentralComunicacao {

    private final List<ItfComunicacao> comunicacoesAtivas = new ArrayList<>();
    private final List<ItfComunicacao> comunicacoesHistorico = new ArrayList<>();

    private void adicionarComunicacao(FabTipoComunicacao pTipocomunicacao, ItfUsuario pRemetente, ItfDestinatario pDestinatario, ItfModeloMensagem mensagem, ERPTransporteComunicacao... pTiposTransporte) {

        List<ItfTipoTransporteComunicacao> transportes = new ArrayList<>();
        for (ERPTransporteComunicacao transporte : pTiposTransporte) {
            transportes.add(transporte.getRegistro());
        }

        comunicacoesAtivas.add(new ComunicacaoTransient(pRemetente, pRemetente, pTipocomunicacao.getRegistro(), transportes));

    }

}
