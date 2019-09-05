/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.config.webPaginas;

import br.org.coletivojava.erp.comunicacao.transporte.ERPTransporteComunicacao;
import com.super_bits.Super_Bits.SB_AdminTools.regras_de_negocio_e_controller.admin_developer.FabAcaoAdminDeveloper;
import com.super_bits.configSBFW.acessos.UtilSB_CRIADOR_COMPONENTEGlobalVar;
import com.super_bits.modulosSB.SBCore.ConfigGeral.SBCore;
import com.super_bits.modulosSB.SBCore.modulos.comunicacao.DestinatarioTransiente;
import com.super_bits.modulosSB.SBCore.modulos.comunicacao.FabTipoComunicacao;

import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.ItensGenericos.basico.UsuarioAplicacaoEmExecucao;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.ItensGenericos.basico.UsuarioSistemaRoot;
import com.super_bits.modulosSB.SBCore.modulos.objetos.MapaObjetosProjetoAtual;
import com.super_bits.modulosSB.webPaginas.ConfigGeral.ConfiguradorCoreDeProjetoWebWarAbstrato;
import com.super_bits.modulosSB.webPaginas.ConfigGeral.ItfInicioFimAppWP;
import com.super_bits.modulosSB.webPaginas.ConfigGeral.SBWebPaginas;
import org.coletivojava.fw.api.objetoNativo.view.icone.IconeSistema;

/**
 *
 * @author Salvio
 */
public class InicioFimContextoWebPagina implements ItfInicioFimAppWP {

    @Override
    public void inicio() {
        SBCore.configurar(new ConfiguradorCoreWebAppSB_CRIADOR_COMPONENTE(
                ConfiguradorCoreDeProjetoWebWarAbstrato.contextoDoServlet),
                SBCore.ESTADO_APP.HOMOLOGACAO);
        //SBPersistencia.configuraJPA(FabConfiguracoesDeAmbienteWebSB_CRIADOR_COMPONENTE.HOMOLOGACAO.getConfiguracaoPersistencia());
        SBWebPaginas.configurar(new ConfigWPSB_CRIADOR_COMPONENTE());
        UtilSB_CRIADOR_COMPONENTEGlobalVar.adicionarObjetosEstaticosProjeto();
        SBCore.getCentralDeArquivos().setCentralDePermissao(new CentralPermissaoArquivoSBComponente());
        String xhtml = FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_FRM_FERRAMENTAS.getRegistro().getComoFormulario().getXhtml();
        System.out.println(xhtml);
        MapaObjetosProjetoAtual.adcionarObjeto(IconeSistema.class);
        SBCore.getCentralDeComunicacao().gerarComunicacaoEntre_Usuairos(FabTipoComunicacao.NOTIFICAR,
                new UsuarioAplicacaoEmExecucao(), new DestinatarioTransiente(new UsuarioSistemaRoot()), "Olá Root", ERPTransporteComunicacao.INTRANET_MENU);
    }

    @Override
    public void fim() {
        System.out.println("FIm do contexto para" + SBCore.getNomeProjeto());
    }

}
