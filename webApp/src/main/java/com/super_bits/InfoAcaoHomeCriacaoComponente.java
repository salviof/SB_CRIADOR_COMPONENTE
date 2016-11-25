/*
 *  Super-Bits.com CODE CNPJ 20.019.971/0001-90

 */
package com.super_bits;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 *
 * Açoes do supercompras
 *
 *
 * @author <a href="mailto:salviof@gmail.com">Salvio Furbino</a>
 * @since 16/12/2015
 * @version 1.0
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface InfoAcaoHomeCriacaoComponente {

    public boolean padraoBloqueado() default true;

    public FabAcoesHomeCriadorComponente acao();
}
