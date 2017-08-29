/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits;

import java.net.HttpURLConnection;
import java.net.URL;
import org.junit.Test;

/**
 *
 * @author SalvioF
 */
public class TesteFontes extends TestesWP_CRIADOR_COMPONENTES {

    @Test
    public void testeRequisicao() {
        try {
            URL url = new URL("http://localhost:8080/SB_CRIADOR_COMPONENTE/javax.faces.resource/fonts/lato-bold-webfont.woff.xhtml?ln=adamantium-layout");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();
            connection.getContent();
            connection.getHeaderFields();
            int code = connection.getResponseCode();
            System.out.println(code);
        } catch (Throwable t) {
            lancarErroJUnit(t);
        }
    }

}
