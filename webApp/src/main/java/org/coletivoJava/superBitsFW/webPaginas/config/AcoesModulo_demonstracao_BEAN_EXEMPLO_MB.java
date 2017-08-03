package org.coletivoJava.superBitsFW.webPaginas.config;

import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;
import com.super_bits.modulosSB.SBCore.UtilGeral.MapaAcoesSistema;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.permissoes.ItfAcaoFormularioEntidade;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.acoes.ItfAcaoControllerEntidade;

@Named
@ApplicationScoped
public class AcoesModulo_demonstracao_BEAN_EXEMPLO_MB {

	public ItfAcaoFormularioEntidade getBean_exemplo_mb() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoBeanExemploDemonstrativo.BEAN_EXEMPLO_MB");
	}

	public ItfAcaoFormularioEntidade getBean_exemplo_frm_listar() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoBeanExemploDemonstrativo.BEAN_EXEMPLO_FRM_LISTAR");
	}

	public ItfAcaoFormularioEntidade getBean_exemplo_frm_visualizar() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoBeanExemploDemonstrativo.BEAN_EXEMPLO_FRM_VISUALIZAR");
	}

	public ItfAcaoFormularioEntidade getBean_exemplo_frm_editar() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoBeanExemploDemonstrativo.BEAN_EXEMPLO_FRM_EDITAR");
	}

	public ItfAcaoFormularioEntidade getBean_exemplo_frm_novo() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoBeanExemploDemonstrativo.BEAN_EXEMPLO_FRM_NOVO");
	}

	public ItfAcaoFormularioEntidade getBean_exemplo_frm_sub_lista_exemplo() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoBeanExemploDemonstrativo.BEAN_EXEMPLO_FRM_SUB_LISTA_EXEMPLO");
	}

	public ItfAcaoControllerEntidade getBean_exemplo_ctr_salvar_merge() {
		return (ItfAcaoControllerEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoBeanExemploDemonstrativo.BEAN_EXEMPLO_CTR_SALVAR_MERGE");
	}

	public ItfAcaoControllerEntidade getBean_exemplo_ctr_salvar_novo() {
		return (ItfAcaoControllerEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoBeanExemploDemonstrativo.BEAN_EXEMPLO_CTR_SALVAR_NOVO");
	}

	public ItfAcaoControllerEntidade getBean_exemplo_ctr_salvar_edicao() {
		return (ItfAcaoControllerEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoBeanExemploDemonstrativo.BEAN_EXEMPLO_CTR_SALVAR_EDICAO");
	}

	public ItfAcaoControllerEntidade getBean_exemplo_ctr_alterar_status() {
		return (ItfAcaoControllerEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoBeanExemploDemonstrativo.BEAN_EXEMPLO_CTR_ALTERAR_STATUS");
	}

	public ItfAcaoControllerEntidade getBean_exemplo_ctr_ativar() {
		return (ItfAcaoControllerEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoBeanExemploDemonstrativo.BEAN_EXEMPLO_CTR_ATIVAR");
	}

	public ItfAcaoControllerEntidade getBean_exemplo_ctr_campo_com_justificativa() {
		return (ItfAcaoControllerEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoBeanExemploDemonstrativo.BEAN_EXEMPLO_CTR_CAMPO_COM_JUSTIFICATIVA");
	}

	public ItfAcaoFormularioEntidade getBean_exemplo_frm_modal_teste() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoBeanExemploDemonstrativo.BEAN_EXEMPLO_FRM_MODAL_TESTE");
	}

	public ItfAcaoFormularioEntidade getBean_exemplo_frm_selecao_de_acao() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoBeanExemploDemonstrativo.BEAN_EXEMPLO_FRM_SELECAO_DE_ACAO");
	}
}