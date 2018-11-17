package org.coletivoJava.fw.projetos.SB_CRIADOR_COMPONENTE.api.model.beanexemplo;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import com.super_bits.Super_Bits.SB_CRIADOR_COMPONENTE.model.BeanExemplo;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.anotacoes.InfoReferenciaEntidade;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@InfoReferenciaEntidade(tipoObjeto = BeanExemplo.class)
public @interface ListaBeanExemplo {

    ListasBeanExemplo lista();
}
