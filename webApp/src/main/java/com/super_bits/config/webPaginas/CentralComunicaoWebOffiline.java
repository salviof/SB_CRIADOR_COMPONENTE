/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.config.webPaginas;

import com.super_bits.modulosSB.SBCore.modulos.comunicacao.CentralComunicacaoDesktop;
<<<<<<< HEAD

=======
import com.super_bits.modulosSB.SBCore.modulos.comunicacao.ComunicacaoAcaoSistema;
import com.super_bits.modulosSB.SBCore.modulos.comunicacao.ComunicacaoTransient;
>>>>>>> 037992f3b11bbee188df73c30d81506b7258856d
import com.super_bits.modulosSB.SBCore.modulos.comunicacao.FabTipoComunicacao;
import com.super_bits.modulosSB.SBCore.modulos.comunicacao.FabTipoTransporteComunicacao;
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

    private void adicionarComunicacao(FabTipoComunicacao pTipocomunicacao, ItfUsuario pRemetente, ItfDestinatario pDestinatario, ItfModeloMensagem mensagem, FabTipoTransporteComunicacao... pTiposTransporte) {

        List<ItfTipoTransporteComunicacao> transportes = new ArrayList<>();
        for (FabTipoTransporteComunicacao transporte : pTiposTransporte) {
            transportes.add(transporte.getRegistro());
        }
<<<<<<< HEAD
        //  comunicacoesAtivas.add(
        //        new ComunicacaoNaoPersistida(pRemetente, pRemetente, pTipocomunicacao.getRegistro(), transportes));
=======
        comunicacoesAtivas.add(new ComunicacaoTransient(pRemetente, pRemetente, pTipocomunicacao.getRegistro(), transportes));
>>>>>>> 037992f3b11bbee188df73c30d81506b7258856d
    }

}
