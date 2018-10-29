package org.coletivoJava.fw.projetos.SB_CRIADOR_COMPONENTE.implemetation.model.org.coletivojava.fw.projetos.sb_criador_componente.implemetation.model.beanexemplo;

import com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.model.BeanExemplo;
import com.super_bits.modulosSB.SBCore.modulos.objetos.validador.ValidacaoGenerica;
import org.coletivoJava.fw.projetos.SB_CRIADOR_COMPONENTE.api.model.beanexemplo.ValidadorBeanExemplo;
import org.coletivoJava.fw.projetos.SB_CRIADOR_COMPONENTE.api.model.beanexemplo.ValidadoresBeanExemplo;
import com.super_bits.modulosSB.SBCore.ConfigGeral.SBCore;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campoInstanciado.ItfCampoInstanciado;
import com.super_bits.modulosSB.SBCore.modulos.objetos.validador.ErroValidacao;

@ValidadorBeanExemplo(validador = ValidadoresBeanExemplo.VALIDACAOLOGICAAPENASPAR)
public class ValidacaoBeanExemploValidacaoLogicaApenasPar
        extends
        ValidacaoGenerica {

    public ValidacaoBeanExemploValidacaoLogicaApenasPar(
            ItfCampoInstanciado pCampo) {
        super(pCampo);
    }

    public BeanExemplo getBeanExemplo() {
        return (BeanExemplo) getCampoInst().getObjetoDoAtributo();
    }

    @Override
    public Object validar(java.lang.Object o) throws ErroValidacao {

        int valor = Integer.valueOf(o.toString());
        if (valor % 2 != 0) {
            throw new ErroValidacao("O numero não é par");
        } else {
            getBeanExemplo().setApelido("Colé colé Colé");
        }
        return o;
    }

    @Override
    public Object validarModoEdicao(java.lang.Object o) throws ErroValidacao {
        return validar(o);

    }

    @Override
    public Object validarModoNovo(java.lang.Object o) throws ErroValidacao {
        return validar(o);

    }
}
