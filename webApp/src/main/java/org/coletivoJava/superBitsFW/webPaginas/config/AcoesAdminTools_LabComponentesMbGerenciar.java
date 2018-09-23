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
public class AcoesAdminTools_LabComponentesMbGerenciar implements Serializable {

	public ItfAcaoFormulario getLabComponentesMbGerenciar() {
		return (ItfAcaoFormulario) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoLabComponentes.LAB_COMPONENTES_MB_GERENCIAR");
	}

	public ItfAcaoFormularioEntidade getLabComponentesFrmListar() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoLabComponentes.LAB_COMPONENTES_FRM_LISTAR");
	}

	public ItfAcaoFormularioEntidade getLabComponentesFrmVisualizar() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoLabComponentes.LAB_COMPONENTES_FRM_VISUALIZAR");
	}

	public ItfAcaoFormularioEntidade getLabComponentesFrmVisualizarGrupoDeCampos() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoLabComponentes.LAB_COMPONENTES_FRM_VISUALIZAR_GRUPO_DE_CAMPOS");
	}

	public ItfAcaoFormularioEntidade getLabComponentesFrmEditar() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoLabComponentes.LAB_COMPONENTES_FRM_EDITAR");
	}

	public ItfAcaoFormularioEntidade getLabComponentesFrmVisualizarFamiliaSelecionada() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoLabComponentes.LAB_COMPONENTES_FRM_VISUALIZAR_FAMILIA_SELECIONADA");
	}

	public ItfAcaoFormularioEntidade getLabComponentesFrmVisualizarComponenteSelecionado() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoLabComponentes.LAB_COMPONENTES_FRM_VISUALIZAR_COMPONENTE_SELECIONADO");
	}

	public ItfAcaoFormularioEntidade getLabComponentesFrmLabInputVer() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoLabComponentes.LAB_COMPONENTES_FRM_LAB_INPUT_VER");
	}

	public ItfAcaoFormularioEntidade getLabComponentesFrmLabCampoEnderecoVisualizar() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoLabComponentes.LAB_COMPONENTES_FRM_LAB_CAMPO_ENDERECO_VISUALIZAR");
	}

	public ItfAcaoFormularioEntidade getLabComponentesFrmLabCampoEnderecoBeanEnderecavelVisualizar() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoLabComponentes.LAB_COMPONENTES_FRM_LAB_CAMPO_ENDERECO_BEAN_ENDERECAVEL_VISUALIZAR");
	}

	public ItfAcaoFormularioEntidade getLabComponentesFrmLabInputMaskarasPersonalizadas() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoLabComponentes.LAB_COMPONENTES_FRM_LAB_INPUT_MASKARAS_PERSONALIZADAS");
	}

	public ItfAcaoFormularioEntidade getLabComponentesFrmLabFichaTecnicaInput() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoLabComponentes.LAB_COMPONENTES_FRM_LAB_FICHA_TECNICA_INPUT");
	}

	public ItfAcaoFormularioEntidade getLabComponentesFrmLabInputListaSubFormulario() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoLabComponentes.LAB_COMPONENTES_FRM_LAB_INPUT_LISTA_SUB_FORMULARIO");
	}

	public ItfAcaoFormularioEntidade getLabComponentesFrmLabInputOnchange() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoLabComponentes.LAB_COMPONENTES_FRM_LAB_INPUT_ONCHANGE");
	}

	public ItfAcaoFormularioEntidade getLabComponentesFrmLabInputValidacao() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoLabComponentes.LAB_COMPONENTES_FRM_LAB_INPUT_VALIDACAO");
	}

	public ItfAcaoFormularioEntidade getLabComponentesFrmLabGrupoCampoVisualizar() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoLabComponentes.LAB_COMPONENTES_FRM_LAB_GRUPO_CAMPO_VISUALIZAR");
	}

	public ItfAcaoFormularioEntidade getLabComponentesFrmLabGrupoCampoTestarOnChangeGpr() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoLabComponentes.LAB_COMPONENTES_FRM_LAB_GRUPO_CAMPO_TESTAR_ON_CHANGE_GPR");
	}

	public ItfAcaoFormularioEntidade getLabComponentesFrmLabGrupoCampoTestarOnChangeForm() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoLabComponentes.LAB_COMPONENTES_FRM_LAB_GRUPO_CAMPO_TESTAR_ON_CHANGE_FORM");
	}

	public ItfAcaoFormularioEntidade getLabComponentesFrmLabGruposCampoVisualizar() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoLabComponentes.LAB_COMPONENTES_FRM_LAB_GRUPOS_CAMPO_VISUALIZAR");
	}

	public ItfAcaoFormularioEntidade getLabComponentesFrmLabGruposCampoTestarOnchangeGpr() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoLabComponentes.LAB_COMPONENTES_FRM_LAB_GRUPOS_CAMPO_TESTAR_ONCHANGE_GPR");
	}

	public ItfAcaoFormularioEntidade getLabComponentesFrmLabGruposCampoTestarOnchangeFrm() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoLabComponentes.LAB_COMPONENTES_FRM_LAB_GRUPOS_CAMPO_TESTAR_ONCHANGE_FRM");
	}

	public ItfAcaoFormularioEntidade getLabComponentesFrmLabGruposFormularioGrupoExemploAtualizacaoForm() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoLabComponentes.LAB_COMPONENTES_FRM_LAB_GRUPOS_FORMULARIO_GRUPO_EXEMPLO_ATUALIZACAO_FORM");
	}

	public ItfAcaoFormularioEntidade getLabComponentesFrmLabGruposFormularioGrupoExemploAtualizacaoGrupoDoCampo() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoLabComponentes.LAB_COMPONENTES_FRM_LAB_GRUPOS_FORMULARIO_GRUPO_EXEMPLO_ATUALIZACAO_GRUPO_DO_CAMPO");
	}

	public ItfAcaoFormularioEntidade getLabComponentesFrmLabGruposFormularioGrupoExemploAtualizacaoId() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoLabComponentes.LAB_COMPONENTES_FRM_LAB_GRUPOS_FORMULARIO_GRUPO_EXEMPLO_ATUALIZACAO_ID");
	}

	public ItfAcaoFormularioEntidade getLabComponentesFrmLabGruposFormularioGrupoExemploAtualizacaoCampo() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoLabComponentes.LAB_COMPONENTES_FRM_LAB_GRUPOS_FORMULARIO_GRUPO_EXEMPLO_ATUALIZACAO_CAMPO");
	}

	public ItfAcaoFormularioEntidade getLabComponentesFrmLabFormularioVer() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoLabComponentes.LAB_COMPONENTES_FRM_LAB_FORMULARIO_VER");
	}

	public ItfAcaoControllerEntidade getLabComponentesCtrTesteJustificativa() {
		return (ItfAcaoControllerEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoLabComponentes.LAB_COMPONENTES_CTR_TESTE_JUSTIFICATIVA");
	}

	public ItfAcaoControllerEntidade getLabComponentesCtrTesteComunicacao() {
		return (ItfAcaoControllerEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoLabComponentes.LAB_COMPONENTES_CTR_TESTE_COMUNICACAO");
	}
}