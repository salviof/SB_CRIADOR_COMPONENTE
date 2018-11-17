/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.model.formularios;

import com.super_bits.modulosSB.SBCore.ConfigGeral.SBCore;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.acoes.ItfAcaoDoSistema;
import com.super_bits.modulosSB.SBCore.modulos.Mensagens.ItfMensagem;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.anotacoes.InfoObjetoSB;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.CaminhoCampoReflexao;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.FabTipoAtributoObjeto;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.ItfCaminhoCampo;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.ItfCaminhoCampoInvalido;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campoInstanciado.ItfAssistenteDeLocalizacao;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campoInstanciado.ItfCampoInstanciado;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.cep.LocalizacaoInputAssistente;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfBeanSimples;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.cep.TipoOrganizacaoDadosEndereco;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.validacaoRegistro.CampoInvalido;
import com.super_bits.modulosSB.SBCore.modulos.view.modeloFormulario.ItfModeloFormularioSBFW;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.List;
import org.coletivojava.fw.api.tratamentoErros.ErroPreparandoObjeto;
import org.coletivojava.fw.api.tratamentoErros.FabErro;

/**
 *
 * @author desenvolvedor
 */
@InfoObjetoSB(tags = {"Modelo formulario"}, plural = "Modelos de Formulário")
public class ModeloFormularioGenerico implements ItfModeloFormularioSBFW {

    private final ItfModeloFormularioSBFW modelo;

    ModeloFormularioGenerico(ItfModeloFormularioSBFW pModelo) {
        modelo = pModelo;

    }

    @Override
    public String getAreaExtra1() {
        return modelo.getAreaExtra1();
    }

    @Override
    public String getAreaExtra2() {
        return modelo.getAreaExtra2();
    }

    @Override
    public String getAreaExtra3() {
        return modelo.getAreaExtra3();
    }

    @Override
    public String getAreaPrincipal() {
        return modelo.getAreaPrincipal();
    }

    @Override
    public String getAreaSecundaria() {
        return modelo.getAreaSecundaria();
    }

    @Override
    public List<String> getAreas() {
        return modelo.getAreas();
    }

    @Override
    public String getDescricao() {
        return modelo.getDescricao();
    }

    @Override
    public int getId() {
        return modelo.getId();
    }

    @Override
    public String getNomeModelo() {
        return modelo.getNomeModelo();
    }

    @Override
    public String getXhtmlVinculado() {
        return modelo.getXhtmlVinculado();
    }

    @Override
    public void setAreas(List<String> areas) {
        modelo.setAreas(areas);
    }

    @Override
    public void setDescricao(String descricao) {
        modelo.setDescricao(descricao);
    }

    @Override
    public void setId(int id) {
        modelo.setId(id);
    }

    @Override
    public void setNomeModelo(String nomeModelo) {
        modelo.setNomeModelo(nomeModelo);
    }

    @Override
    public void setXhtmlVinculado(String xhtmlVinculado) {
        modelo.setXhtmlVinculado(xhtmlVinculado);
    }

    @Override
    public String getNomeUnicoSlug() {
        return modelo.getNomeUnicoSlug();
    }

    @Override
    public boolean validar() {
        return modelo.validar();
    }

    @Override
    public List<ItfMensagem> validarComMensagens() {
        return modelo.validarComMensagens();
    }

    @Override
    public boolean uploadFotoTodosFormatos(InputStream pStream) {
        return modelo.uploadFotoTodosFormatos(pStream);
    }

    @Override
    public boolean uploadFotoTamanhoPequeno(InputStream pStream) {
        return modelo.uploadFotoTamanhoPequeno(pStream);
    }

    @Override
    public boolean uploadFotoTamanhoMedio(InputStream pStream) {
        return modelo.uploadFotoTamanhoMedio(pStream);
    }

    @Override
    public boolean uploadFotoTamanhoGrande(InputStream pStream) {
        return modelo.uploadFotoTamanhoGrande(pStream);
    }

    @Override
    public boolean uploadArquivoDeEntidade(ItfCampoInstanciado prcampo, byte[] pStream, String pNomeArquivo) {
        return modelo.uploadArquivoDeEntidade(prcampo, pStream, pNomeArquivo);
    }

    @Override
    public String getSlugIdentificador() {
        return modelo.getSlugIdentificador();
    }

    @Override
    public String getNomeCurto() {
        return modelo.getNomeCurto();
    }

    @Override
    public String getNome() {
        return modelo.getNome();
    }

    @Override
    public String getIconeDaClasse() {
        return modelo.getIconeDaClasse();
    }

    @Override
    public String getXhtmlVisao() {
        return modelo.getXhtmlVisao();
    }

    @Override
    public String getImgPequena() {
        return modelo.getImgPequena();
    }

    @Override
    public int configIDPeloNome() {
        return modelo.configIDPeloNome();
    }

    @Override
    public String getNomeDoObjeto() {
        return modelo.getNomeDoObjeto();
    }

    @Override
    public void adicionarItemNaLista(String nomeDaLista) {
        modelo.adicionarItemNaLista(nomeDaLista);
    }

    @Override
    public boolean isTemCampoAnotado(FabTipoAtributoObjeto pCampo) {
        return modelo.isTemCampoAnotado(pCampo);
    }

    @Override
    public void setNome(String pNome) {
        modelo.setNome(pNome);
    }

    @Override
    public List<ItfCampoInstanciado> getCamposInstaciadosInvalidos() {
        return modelo.getCamposInstaciadosInvalidos();
    }

    @Override
    public ItfCampoInstanciado getCampoByNomeOuAnotacao(String pNome) {
        return modelo.getCampoByNomeOuAnotacao(pNome);
    }

    @Override
    public ItfCampoInstanciado getCampoByCaminhoCampo(ItfCaminhoCampo pNome) {
        return modelo.getCampoByCaminhoCampo(pNome);
    }

    @Override
    public Object getValorCampoByCaminhoCampo(ItfCaminhoCampo pNome) {
        return modelo.getValorCampoByCaminhoCampo(pNome);
    }

    @Override
    public List<ItfCaminhoCampo> getEntidadesVinculadas() {
        return modelo.getEntidadesVinculadas();
    }

    @Override
    public ItfBeanSimples getBeanSimplesPorNomeCampo(String pNomeCampo) {
        return modelo.getBeanSimplesPorNomeCampo(pNomeCampo);
    }

    @Override
    public ItfBeanSimples getItemPorCaminhoCampo(ItfCaminhoCampo pCaminho) {
        return modelo.getItemPorCaminhoCampo(pCaminho);
    }

    @Override
    public List<ItfBeanSimples> getListaPorCaminhoCampo(ItfCaminhoCampo pCaminho) {
        return modelo.getListaPorCaminhoCampo(pCaminho);
    }

    @Override
    public Field getCampoReflexaoByAnotacao(FabTipoAtributoObjeto pInfoCampo) {
        return modelo.getCampoReflexaoByAnotacao(pInfoCampo);
    }

    @Override
    public String getNomeCampo(FabTipoAtributoObjeto pInfocampo) {
        return modelo.getNomeCampo(pInfocampo);
    }

    @Override
    public void adicionarJustificativaExecucaoAcao(ItfAcaoDoSistema pAcao, String pJustificativa) {
        modelo.adicionarJustificativaExecucaoAcao(pAcao, pJustificativa);
    }

    @Override
    public String getJustificativa(ItfAcaoDoSistema pAcao) {
        return modelo.getJustificativa(pAcao);
    }

    @Override
    public void prepararNovoObjeto(Object... parametros) {
        try {
            modelo.prepararNovoObjeto(parametros);
        } catch (ErroPreparandoObjeto p) {
            SBCore.RelatarErro(FabErro.SOLICITAR_REPARO, "Erro preparando modelo de formulário genérioco", p);
        }
    }

    @Override
    public List<ItfCampoInstanciado> getCamposInstanciados() {
        return modelo.getCamposInstanciados();
    }

    @Override
    public void adicionarSubItem(String pNomeCampo) {
        modelo.adicionarItemNaLista(pNomeCampo);
    }

    @Override
    public String getNomeDoObjetoPlural() {
        return modelo.getNomeDoObjetoPlural();
    }

    @Override
    public ItfCampoInstanciado getCampoInstanciadoByNomeOuAnotacao(String pNome) {
        return modelo.getCampoInstanciadoByNomeOuAnotacao(pNome);
    }

    @Override
    public void adicionarAssitenteLocalizacao(ItfAssistenteDeLocalizacao pLocalizacao) {
        modelo.adicionarAssitenteLocalizacao(pLocalizacao);
    }

    @Override
    public LocalizacaoInputAssistente getAssistenteLocalizacao(ItfCampoInstanciado pCampoInst, TipoOrganizacaoDadosEndereco pTipo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void copiaDados(Object pObjetoReferencia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ItfCampoInstanciado getCampoInstanciadoByAnotacao(FabTipoAtributoObjeto pTipocampo) {
        return modelo.getCampoInstanciadoByAnotacao(pTipocampo);
    }

    @Override
    public boolean isTemImagemPequenaAdicionada() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getXhtmlVisaoMobile() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getXhtmlVisao(int numeroColunas) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ItfCaminhoCampoInvalido> getCamposInvalidos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
