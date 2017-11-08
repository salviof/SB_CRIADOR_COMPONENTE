/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.config.webPaginas.escopoDeJanela;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.enterprise.context.spi.CreationalContext;
import javax.enterprise.inject.spi.Bean;

/**
 *
 * @author SalvioF
 */
public class ViewScopeJanelaUtil {

    private static ViewScopeJanelaUtil INSTANCE;
    private Map<Class, CustomScopeInstance> beans;//we will have only one instance of a type so the key is a class

    private ViewScopeJanelaUtil() {
        beans = Collections.synchronizedMap(new HashMap<>());
    }

    public synchronized static ViewScopeJanelaUtil getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ViewScopeJanelaUtil();
        }
        return INSTANCE;
    }

    public Map<Class, CustomScopeInstance> getBeans() {
        return beans;
    }

    public CustomScopeInstance getBean(Class type) {
        return getBeans().get(type);
    }

    public void putBean(CustomScopeInstance customInstance) {
        getBeans().put(customInstance.bean.getBeanClass(), customInstance);
    }

    void destroyBean(CustomScopeInstance customScopeInstance) {
        getBeans().remove(customScopeInstance.bean.getBeanClass());
        customScopeInstance.bean.destroy(customScopeInstance.instance, customScopeInstance.ctx);
    }

    /**
     * wrap necessary properties so we can destroy the bean later:
     *
     * @see
     * CustomScopeContextHolder#destroyBean(custom.scope.extension.CustomScopeContextHolder.CustomScopeInstance)
     */
    public static class CustomScopeInstance<T> {

        Bean<T> bean;
        CreationalContext<T> ctx;
        T instance;
    }
}
