/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.SB_CRIADOR_COMPONENTE.paginas;

import com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.model.BeanExemplo;
import com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.model.FabListBeanExemplos;
import com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.regras_de_negocio_e_controller.dominioBeanExemploTeste.FabAcaoBeanExemploDemonstrativo;
import com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.regras_de_negocio_e_controller.dominioBeanExemploTeste.InfoAcaoBeamExemploDemo;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.TIPO_PARTE_URL;
import com.super_bits.modulosSB.SBCore.modulos.fabrica.UtilSBCoreReflexaoFabrica;
import com.super_bits.modulosSB.webPaginas.JSFManagedBeans.formularios.MB_paginaCadastroEntidades;
import com.super_bits.modulosSB.webPaginas.JSFManagedBeans.formularios.reflexao.anotacoes.InfoPagina;
import com.super_bits.modulosSB.webPaginas.JSFManagedBeans.formularios.reflexao.anotacoes.beans.InfoParametroURL;
import com.super_bits.modulosSB.webPaginas.JSFManagedBeans.siteMap.parametrosURL.ParametroURL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author desenvolvedor
 */
@InfoAcaoBeamExemploDemo(acao = FabAcaoBeanExemploDemonstrativo.BEAN_EXEMPLO_MB)
@Named
@ViewScoped
@InfoPagina(nomeCurto = "BE", tags = "Demonstrativo Bean Exemplo")
public class PgBeanExemplo extends MB_paginaCadastroEntidades<BeanExemplo> {

    private final Map<Integer, BeanExemplo> beansPersistidos = new HashMap();

    private List<BeanExemplo> listaBeans;
    @InfoParametroURL(nome = "Exemplo Selecionado", tipoEntidade = BeanExemplo.class, tipoParametro = TIPO_PARTE_URL.OBJETO_COM_CONSTRUCTOR)
    private ParametroURL prbeanSelecionado;

    @PostConstruct
    public void inicio() {
        listarDados();
        if (prbeanSelecionado.isValorDoParametroFoiConfigurado()) {
            setEntidadeSelecionada((BeanExemplo) prbeanSelecionado.getValor());

        }
    }

    @Override
    public void executarAcao(BeanExemplo pEntidadeSelecionada) {
        super.executarAcao(pEntidadeSelecionada); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void listarDados() {
        setEntidadesListadas(UtilSBCoreReflexaoFabrica.getListaTodosRegistrosDaFabrica(FabListBeanExemplos.class));
    }

}
