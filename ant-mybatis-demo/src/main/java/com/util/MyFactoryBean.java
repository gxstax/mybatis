package com.util;

import com.dao.CityDao;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author gaoxx gaoxx@fxiaoke.com
 * @ClassName: MyFactoryBean
 * @Description: TODO
 * @datetime 2018/12/4 8:28
 * @Version 1.0
 */

public class MyFactoryBean implements FactoryBean,InvocationHandler{

    private Class clazz;
    public MyFactoryBean(Class clazz){
        this.clazz = clazz;
    }

    @Override
    public Object getObject() throws Exception {
        Class[] clazzs = new Class[]{clazz};
        Object obj = Proxy.newProxyInstance(this.getClass().getClassLoader(), clazzs, this);
        return obj;
    }

    @Override
    public Class<?> getObjectType() {
        return clazz;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("proxxxy");
        return null;
    }
}
