package org.coletivoJava.fw.projetos.SB_CRIADOR_COMPONENTE.implemetation.model.beanexemplo;

import com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.model.BeanExemplo;
import com.super_bits.modulosSB.SBCore.modulos.objetos.validador.ValidacaoGenerica;
import com.super_bits.modulosSB.SBCore.modulos.objetos.validador.InfoReferenciaEntidade;
import org.coletivoJava.fw.projetos.SB_CRIADOR_COMPONENTE.api.model.beanexemplo.ValidadorBeanExemplo;
import org.coletivoJava.fw.projetos.SB_CRIADOR_COMPONENTE.api.model.beanexemplo.ValidadoresBeanExemplo;
import com.super_bits.modulosSB.SBCore.ConfigGeral.SBCore;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campoInstanciado.ItfCampoInstanciado;
import com.super_bits.modulosSB.SBCore.modulos.objetos.validador.ErroValidacao;

@InfoReferenciaEntidade(tipoObjeto = BeanExemplo.class)
@ValidadorBeanExemplo(validador = ValidadoresBeanExemplo.VALIDACAOLOGICAAPENASPAR)
public class ValidacaoBeanExemploValidacaoLogicaApenasPar
        extends
        ValidacaoGenerica<BeanExemplo> {

    public ValidacaoBeanExemploValidacaoLogicaApenasPar(
            ItfCampoInstanciado pCampo) {
        super(pCampo);
    }

    /**
     *
     *
     *
     * Outra coisa
     *
     * @param o
     * @return
     * @throws ErroValidacao
     */
    @Override
    public Object validar(java.lang.Object o) throws ErroValidacao {

        /// QUANDO A VALIDAÇÃO NÃO FOR SATISFATÓRIA, voce deve lançar um ErroValidacao
        //  o retorno de object é para manter compativilidade com possiveis abordagens legadas..
        //  A ideia é que o validar retorne um objeto de Resposta, com mensagens e outras informações...
        // mantive o retorno de Object por preocaução com outras aobrdagens..
        // temos que validar se o valor é par...
        // o valor virá no parametro..
        // lembrando que o Object poderia ser uma List sem problemas..
        // no caso do validador do produto campanha, nos vamos usar a abordagem de validação...
        // porém "nunca" vamos lançar um erro de validação....
        // porque na maioria das vezes em vez de validar ele concerta para o usuário.
        // caberia um trow se ele tentase mudar um valor não permitido ;
        // no jsf quando algo não passa da validação, o valor não é configurado.
        // a validação do jsf vai estar programada para chamar a validação logica quando houver.
        // e a mensagem de erro vai ser exibida no campo de validação...
        // eu vou demonstrar isso logo depois desse teste do JUNIT
        // ok?
        int valor = Integer.valueOf(o.toString());
        if (valor % 2 != 0) {
            throw new ErroValidacao("O número não é par :(");
        }

        return o;
    }

    public BeanExemplo getBeanExemplo() {
        return getObjetoDoAtributo();
    }

}
