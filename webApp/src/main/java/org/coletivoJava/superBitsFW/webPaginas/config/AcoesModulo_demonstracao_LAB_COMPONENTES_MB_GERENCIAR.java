package org.coletivoJava.superBitsFW.webPaginas.config;

import com.super_bits.modulosSB.SBCore.UtilGeral.MapaAcoesSistema;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.permissoes.ItfAcaoFormularioEntidade;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

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

	public ItfAcaoFormularioEntidade getLAB_COMPONENTES_FRM_LAB_VER() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoLabComponentes.LAB_COMPONENTES_FRM_LAB_VER");
	}

	public ItfAcaoFormularioEntidade getLAB_COMPONENTES_FRM_LAB_FICHA_TECNICA() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoLabComponentes.LAB_COMPONENTES_FRM_LAB_FICHA_TECNICA");
	}

	public ItfAcaoFormularioEntidade getLAB_COMPONENTES_FRM_LAB_ONCHANGE() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoLabComponentes.LAB_COMPONENTES_FRM_LAB_ONCHANGE");
	}

	public ItfAcaoFormularioEntidade getLAB_COMPONENTES_FRM_LAB_VALIDACAO() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoLabComponentes.LAB_COMPONENTES_FRM_LAB_VALIDACAO");
	}
}