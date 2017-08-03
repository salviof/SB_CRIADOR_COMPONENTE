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
import com.super_bits.modulosSB.SBCore.modulos.fabrica.UtilSBCoreReflexaoFabrica;
import com.super_bits.modulosSB.SBCore.modulos.view.fabricasCompVisual.UtilSBFabricaComponenteVisual;
import com.super_bits.modulosSB.webPaginas.JSFBeans.PrimeFacesBeanModel.FabricaBeansPrimeFaces;
import com.super_bits.modulosSB.webPaginas.JSFManagedBeans.formularios.MB_paginaCadastroEntidades;
import com.super_bits.modulosSB.webPaginas.JSFManagedBeans.formularios.reflexao.anotacoes.InfoPagina;
import java.util.List;
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

    private BeanExemplo beanSelecionado;
    private List<BeanExemplo> listaBeans;

    @PostConstruct
    public void inicio() {
        listarDados();
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
