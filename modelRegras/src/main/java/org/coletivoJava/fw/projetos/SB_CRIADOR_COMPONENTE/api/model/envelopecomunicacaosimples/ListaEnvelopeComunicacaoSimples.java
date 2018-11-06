package org.coletivoJava.fw.projetos.SB_CRIADOR_COMPONENTE.api.model.envelopecomunicacaosimples;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import org.coletivoJava.fw.projetos.SB_CRIADOR_COMPONENTE.api.model.envelopecomunicacaosimples.ListasEnvelopeComunicacaoSimples;
import com.super_bits.modulosSB.SBCore.modulos.comunicacao.EnvelopeComunicacaoSimples;
import com.super_bits.modulosSB.SBCore.modulos.objetos.validador.InfoReferenciaEntidade;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@InfoReferenciaEntidade(tipoObjeto = EnvelopeComunicacaoSimples.class)
public @interface ListaEnvelopeComunicacaoSimples {

	ListasEnvelopeComunicacaoSimples lista();
}