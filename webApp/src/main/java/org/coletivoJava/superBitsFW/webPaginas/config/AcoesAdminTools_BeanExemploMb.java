package org.coletivoJava.superBitsFW.webPaginas.config;

import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;
import java.io.Serializable;
import com.super_bits.modulosSB.SBCore.UtilGeral.MapaAcoesSistema;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.permissoes.ItfAcaoFormulario;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.permissoes.ItfAcaoFormularioEntidade;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.acoes.ComoAcaoControllerEntidade;

@Named
@ApplicationScoped
public class AcoesAdminTools_BeanExemploMb implements Serializable {

	public ItfAcaoFormulario getBeanExemploMb() {
		return (ItfAcaoFormulario) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoBeanExemploDemonstrativo.BEAN_EXEMPLO_MB");
	}

	public ItfAcaoFormularioEntidade getBeanExemploFrmListar() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoBeanExemploDemonstrativo.BEAN_EXEMPLO_FRM_LISTAR");
	}

	public ItfAcaoFormularioEntidade getBeanExemploFrmVisualizar() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoBeanExemploDemonstrativo.BEAN_EXEMPLO_FRM_VISUALIZAR");
	}

	public ItfAcaoFormularioEntidade getBeanExemploFrmEditar() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoBeanExemploDemonstrativo.BEAN_EXEMPLO_FRM_EDITAR");
	}

	public ItfAcaoFormularioEntidade getBeanExemploFrmNovo() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoBeanExemploDemonstrativo.BEAN_EXEMPLO_FRM_NOVO");
	}

	public ItfAcaoFormularioEntidade getBeanExemploFrmSubListaExemplo() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoBeanExemploDemonstrativo.BEAN_EXEMPLO_FRM_SUB_LISTA_EXEMPLO");
	}

	public ItfAcaoFormularioEntidade getBeanExemploFrmSubListaSomenteleitura() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoBeanExemploDemonstrativo.BEAN_EXEMPLO_FRM_SUB_LISTA_SOMENTElEITURA");
	}

	public ComoAcaoControllerEntidade getBeanExemploCtrSalvarMerge() {
		return (ComoAcaoControllerEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoBeanExemploDemonstrativo.BEAN_EXEMPLO_CTR_SALVAR_MERGE");
	}

	public ComoAcaoControllerEntidade getBeanExemploCtrSalvarNovo() {
		return (ComoAcaoControllerEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoBeanExemploDemonstrativo.BEAN_EXEMPLO_CTR_SALVAR_NOVO");
	}

	public ComoAcaoControllerEntidade getBeanExemploCtrSalvarEdicao() {
		return (ComoAcaoControllerEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoBeanExemploDemonstrativo.BEAN_EXEMPLO_CTR_SALVAR_EDICAO");
	}

	public ComoAcaoControllerEntidade getBeanExemploCtrAlterarStatus() {
		return (ComoAcaoControllerEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoBeanExemploDemonstrativo.BEAN_EXEMPLO_CTR_ALTERAR_STATUS");
	}

	public ComoAcaoControllerEntidade getBeanExemploCtrAtivar() {
		return (ComoAcaoControllerEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoBeanExemploDemonstrativo.BEAN_EXEMPLO_CTR_ATIVAR");
	}

	public ComoAcaoControllerEntidade getBeanExemploCtrCampoComJustificativa() {
		return (ComoAcaoControllerEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoBeanExemploDemonstrativo.BEAN_EXEMPLO_CTR_CAMPO_COM_JUSTIFICATIVA");
	}

	public ItfAcaoFormularioEntidade getBeanExemploFrmModalTeste() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoBeanExemploDemonstrativo.BEAN_EXEMPLO_FRM_MODAL_TESTE");
	}

	public ItfAcaoFormularioEntidade getBeanExemploFrmSelecaoDeAcao() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoBeanExemploDemonstrativo.BEAN_EXEMPLO_FRM_SELECAO_DE_ACAO");
	}
}