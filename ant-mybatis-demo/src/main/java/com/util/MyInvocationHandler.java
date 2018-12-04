package com.util;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author gaoxx gaoxx@fxiaoke.com
 * @ClassName: MyInvocationHandler
 * @Description: TODO
 * @datetime 2018/12/4 8:03
 * @Version 1.0
 */
public class MyInvocationHandler implements InvocationHandler{
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("proxysssss");
        return null;
    }
}
