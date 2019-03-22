package org.coletivoJava.superBitsFW.webPaginas.config;

import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;
import java.io.Serializable;
import com.super_bits.modulosSB.SBCore.UtilGeral.MapaAcoesSistema;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.permissoes.ItfAcaoFormulario;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.permissoes.ItfAcaoFormularioEntidade;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.acoes.ItfAcaoControllerEntidade;

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

	public ItfAcaoControllerEntidade getBeanExemploCtrSalvarMerge() {
		return (ItfAcaoControllerEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoBeanExemploDemonstrativo.BEAN_EXEMPLO_CTR_SALVAR_MERGE");
	}

	public ItfAcaoControllerEntidade getBeanExemploCtrSalvarNovo() {
		return (ItfAcaoControllerEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoBeanExemploDemonstrativo.BEAN_EXEMPLO_CTR_SALVAR_NOVO");
	}

	public ItfAcaoControllerEntidade getBeanExemploCtrSalvarEdicao() {
		return (ItfAcaoControllerEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoBeanExemploDemonstrativo.BEAN_EXEMPLO_CTR_SALVAR_EDICAO");
	}

	public ItfAcaoControllerEntidade getBeanExemploCtrAlterarStatus() {
		return (ItfAcaoControllerEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoBeanExemploDemonstrativo.BEAN_EXEMPLO_CTR_ALTERAR_STATUS");
	}

	public ItfAcaoControllerEntidade getBeanExemploCtrAtivar() {
		return (ItfAcaoControllerEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoBeanExemploDemonstrativo.BEAN_EXEMPLO_CTR_ATIVAR");
	}

	public ItfAcaoControllerEntidade getBeanExemploCtrCampoComJustificativa() {
		return (ItfAcaoControllerEntidade) MapaAcoesSistema
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