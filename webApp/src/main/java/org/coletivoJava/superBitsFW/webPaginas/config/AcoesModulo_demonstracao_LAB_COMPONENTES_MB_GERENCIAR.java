package org.coletivoJava.superBitsFW.webPaginas.config;

import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;
import com.super_bits.modulosSB.SBCore.UtilGeral.MapaAcoesSistema;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.permissoes.ItfAcaoFormularioEntidade;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.acoes.ItfAcaoControllerEntidade;

@Named
@ApplicationScoped
public class AcoesModulo_demonstracao_LAB_COMPONENTES_MB_GERENCIAR {

	public ItfAcaoFormularioEntidade getLAB_COMPONENTES_MB_GERENCIAR() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoLabComponentes.LAB_COMPONENTES_MB_GERENCIAR");
	}

	public ItfAcaoFormularioEntidade getLAB_COMPONENTES_FRM_LISTAR() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoLabComponentes.LAB_COMPONENTES_FRM_LISTAR");
	}

	public ItfAcaoFormularioEntidade getLAB_COMPONENTES_FRM_VISUALIZAR() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoLabComponentes.LAB_COMPONENTES_FRM_VISUALIZAR");
	}

	public ItfAcaoFormularioEntidade getLAB_COMPONENTES_FRM_EDITAR() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoLabComponentes.LAB_COMPONENTES_FRM_EDITAR");
	}

	public ItfAcaoFormularioEntidade getLAB_COMPONENTES_FRM_FAMILIA_SELECIONADA_VISUALIZAR() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoLabComponentes.LAB_COMPONENTES_FRM_FAMILIA_SELECIONADA_VISUALIZAR");
	}

	public ItfAcaoFormularioEntidade getLAB_COMPONENTES_FRM_COMPONENTE_SELECIONADO_VISUALIZAR() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoLabComponentes.LAB_COMPONENTES_FRM_COMPONENTE_SELECIONADO_VISUALIZAR");
	}

	public ItfAcaoFormularioEntidade getLAB_COMPONENTES_FRM_LAB_INPUT_VER() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoLabComponentes.LAB_COMPONENTES_FRM_LAB_INPUT_VER");
	}

	public ItfAcaoFormularioEntidade getLAB_COMPONENTES_FRM_LAB_INPUT_MASKARAS_PERSONALIZADAS() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoLabComponentes.LAB_COMPONENTES_FRM_LAB_INPUT_MASKARAS_PERSONALIZADAS");
	}

	public ItfAcaoFormularioEntidade getLAB_COMPONENTES_FRM_LAB_FICHA_TECNICA_INPUT() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoLabComponentes.LAB_COMPONENTES_FRM_LAB_FICHA_TECNICA_INPUT");
	}

	public ItfAcaoFormularioEntidade getLAB_COMPONENTES_FRM_LAB_INPUT_ONCHANGE() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoLabComponentes.LAB_COMPONENTES_FRM_LAB_INPUT_ONCHANGE");
	}

	public ItfAcaoFormularioEntidade getLAB_COMPONENTES_FRM_LAB_INPUT_VALIDACAO() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoLabComponentes.LAB_COMPONENTES_FRM_LAB_INPUT_VALIDACAO");
	}

	public ItfAcaoControllerEntidade getLAB_COMPONENTES_CTR_TESTE_JUSTIFICATIVA() {
		return (ItfAcaoControllerEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoLabComponentes.LAB_COMPONENTES_CTR_TESTE_JUSTIFICATIVA");
	}

	public ItfAcaoControllerEntidade getLAB_COMPONENTES_CTR_TESTE_COMUNICACAO() {
		return (ItfAcaoControllerEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoLabComponentes.LAB_COMPONENTES_CTR_TESTE_COMUNICACAO");
	}
}