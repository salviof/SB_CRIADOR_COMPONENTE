/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.config.webPaginas.escopoDeJanela;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.logging.Logger;
import javax.enterprise.context.spi.Context;
import javax.enterprise.context.spi.Contextual;
import javax.enterprise.context.spi.CreationalContext;
import javax.enterprise.inject.spi.Bean;

/**
 *
 * @author SalvioF
 */
public class ViewJanelaScopeContexto implements
        //  Context,
        Serializable {

    private Logger log = Logger.getLogger(getClass().getSimpleName());

    private ViewScopeJanelaUtil customScopeContextHolder;

    public ViewJanelaScopeContexto() {
        log.info("Init");
        this.customScopeContextHolder = ViewScopeJanelaUtil.getInstance();
    }

    //  @Override
    public <T> T get(final Contextual<T> contextual) {
        Bean bean = (Bean) contextual;
        if (customScopeContextHolder.getBeans().containsKey(bean.getBeanClass())) {
            return (T) customScopeContextHolder.getBean(bean.getBeanClass()).instance;
        } else {
            return null;
        }
    }

    //  @Override
    public <T> T get(final Contextual<T> contextual, final CreationalContext<T> creationalContext) {
        Bean bean = (Bean) contextual;
        if (customScopeContextHolder.getBeans().containsKey(bean.getBeanClass())) {
            return (T) customScopeContextHolder.getBean(bean.getBeanClass()).instance;
        } else {
            T t = (T) bean.create(creationalContext);
            ViewScopeJanelaUtil.CustomScopeInstance customInstance = new ViewScopeJanelaUtil.CustomScopeInstance();
            customInstance.bean = bean;
            customInstance.ctx = creationalContext;
            customInstance.instance = t;
            customScopeContextHolder.putBean(customInstance);
            return t;
        }
    }

    //  @Override
    public Class<? extends Annotation> getScope() {
        return ViewJanelaScope.class;
    }

    public boolean isActive() {
        return true;
    }
    // public void destroy(@Observes KillEvent killEvent) {
    //     if (customScopeContextHolder.getBeans().containsKey(killEvent.getBeanType())) {
    //          customScopeContextHolder.destroyBean(customScopeContextHolder.getBean(killEvent.getBeanType()));
    //     }

}
