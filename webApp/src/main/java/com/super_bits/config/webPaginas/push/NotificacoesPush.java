/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.config.webPaginas.push;

import com.super_bits.modulosSB.webPaginas.controller.push.NotificacoesPushAbstrato;
import org.primefaces.push.annotation.PushEndpoint;

/**
 *
 * @author SalvioF
 */
@PushEndpoint("/mensagens/{pagina}/{grupo}/{usuarioID}")
public class NotificacoesPush extends NotificacoesPushAbstrato {

}
