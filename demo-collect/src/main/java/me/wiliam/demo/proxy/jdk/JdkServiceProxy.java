package me.wiliam.demo.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;


public class JdkServiceProxy<T> implements InvocationHandler {

    private T target;

    public JdkServiceProxy(T target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) {
        System.out.println("实际代理service调用,"+proxy.getClass()+","+method.getName()+","+(args == null ? 0:args.length));
        if(target != null){
            if(target instanceof OrderServiceProxy){
                ((OrderServiceProxy)target).proxyMethod();
            }
        }
        return null;
    }
}