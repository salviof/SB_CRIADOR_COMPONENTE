package org.coletivoJava.fw.projetos.SB_CRIADOR_COMPONENTE.implemetation.model.beanexemplo;

import com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.model.BeanExemplo;
import com.super_bits.modulosSB.SBCore.modulos.objetos.validador.ValidacaoGenerica;
import org.coletivoJava.fw.projetos.SB_CRIADOR_COMPONENTE.api.model.beanexemplo.ValidadorBeanExemplo;
import org.coletivoJava.fw.projetos.SB_CRIADOR_COMPONENTE.api.model.beanexemplo.ValidadoresBeanExemplo;
import com.super_bits.modulosSB.SBCore.ConfigGeral.SBCore;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.anotacoes.InfoReferenciaEntidade;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campoInstanciado.ItfCampoInstanciado;
import com.super_bits.modulosSB.SBCore.modulos.objetos.validador.ErroValidacao;
import com.super_bits.modulosSB.SBCore.modulos.view.widgetsFormulario.WidgetsFormulario;
import java.util.ArrayList;
import java.util.List;

@InfoReferenciaEntidade(tipoObjeto = BeanExemplo.class)
@ValidadorBeanExemplo(validador = ValidadoresBeanExemplo.VALIDACAOLOGICAAPENASPAR)
public class ValidacaoBeanExemploValidacaoLogicaApenasPar
        extends
        ValidacaoGenerica<BeanExemplo> {

    public ValidacaoBeanExemploValidacaoLogicaApenasPar(
            ItfCampoInstanciado pCampo) {
        super(pCampo);

    }

    @Override
    public List<WidgetsFormulario> validar(Object pValor) throws ErroValidacao {
        if (pValor == null) {
            throw new ErroValidacao("O valor não pode ser nulo");
        }

        int valor = Integer.valueOf(pValor.toString());
        if (valor % 2 != 0) {
            //   SBCore.getCentralDeMensagens()
            //           .enviarMsgErroAoUsuario(
            //                   "Tem como mandar mnesagem aqui também na valdação!");
            throw new ErroValidacao("Sá porra precisa ser par!");
        }

        return new ArrayList<>();

    }

}
