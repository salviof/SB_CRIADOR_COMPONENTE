package org.coletivoJava.fw.projetos.SB_CRIADOR_COMPONENTE.implemetation.model.beanexemplo;

import com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.model.BeanExemplo;
import com.super_bits.modulosSB.SBCore.modulos.objetos.validador.ValidacaoGenerica;
import org.coletivoJava.fw.projetos.SB_CRIADOR_COMPONENTE.api.model.beanexemplo.ValidadorBeanExemplo;
import org.coletivoJava.fw.projetos.SB_CRIADOR_COMPONENTE.api.model.beanexemplo.ValidadoresBeanExemplo;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.anotacoes.InfoReferenciaEntidade;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campoInstanciado.ItfCampoInstanciado;
import com.super_bits.modulosSB.SBCore.modulos.objetos.validador.ErroValidacao;

@InfoReferenciaEntidade(tipoObjeto = BeanExemplo.class)
@ValidadorBeanExemplo(validador = ValidadoresBeanExemplo.VALIDACAOLOGICAAPENASGAULESES)
public class ValidacaoBeanExemploValidacaoLogicaApenasGauleses
        extends
        ValidacaoGenerica<BeanExemplo> {

    public ValidacaoBeanExemploValidacaoLogicaApenasGauleses(
            ItfCampoInstanciado pCampo) {
        super(pCampo);
    }

    @Override
    public Object validar(Object pValor) throws ErroValidacao {
        if (pValor != null) {
            if (!pValor.toString().endsWith("ix")) {
                throw new ErroValidacao("Este não parece ser um nome gaulês");
            }
        }
        return super.validar(pValor); //chamada super do metodo (implementação classe pai)
    }

}
