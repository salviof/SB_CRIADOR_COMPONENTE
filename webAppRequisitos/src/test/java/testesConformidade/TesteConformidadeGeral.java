/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package testesConformidade;

import com.super_bits.config.webPaginas.FabConfiguracoesDeAmbienteSB_CRIADOR_COMPONENTERequisitos;
import com.super_bits.configSBFW.ConfiguradorMonitorRequisitoModel;
import com.super_bits.modulosSB.Persistencia.ConfigGeral.SBPersistencia;
import com.super_bits.modulosSB.SBCore.ConfigGeral.SBCore;
import com.super_bits.modulosSB.webPaginas.ConfigGeral.SBWebPaginas;
import com.super_bits.modulosSB.webPaginas.TratamentoDeErros.RelatorioTesteWebPaginas;

import org.junit.Test;

/**
 *
 * @author desenvolvedor
 */
public class TesteConformidadeGeral extends RelatorioTesteWebPaginas {

    @Override
    protected void configAmbienteDesevolvimento() {

        SBCore.configurar(new ConfiguradorMonitorRequisitoModel(), SBCore.ESTADO_APP.DESENVOLVIMENTO);
        SBPersistencia.configuraJPA(FabConfiguracoesDeAmbienteSB_CRIADOR_COMPONENTERequisitos.DESENVOLVIMENTO.getConfiguracaoPersistencia());
        SBWebPaginas.configurar(FabConfiguracoesDeAmbienteSB_CRIADOR_COMPONENTERequisitos.DESENVOLVIMENTO.getConfiguracaoWebPaginas());
    }

    @Test
    public void testar() {
        exibirRelatorioCompleto();

    }

}
