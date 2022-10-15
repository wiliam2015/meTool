package me.wiliam.demo.proxy.jdk;

import me.wiliam.demo.proxy.jdk.dto.SubmitOrderReq;

import java.lang.reflect.Proxy;

public class ProxyApp {

    public static void main(String[] args) {

        OrderServiceProxy orderServiceProxy = new OrderServiceProxy();
        JdkServiceProxy jdkServiceProxy = new JdkServiceProxy(orderServiceProxy);
        Object proxyClass = Proxy.newProxyInstance(ProxyApp.class.getClassLoader(), new Class[]{OrderService.class}, jdkServiceProxy);
        System.out.println("创建的代理类："+proxyClass.getClass());
        OrderService orderServiceProxyInter = (OrderService)proxyClass;
        orderServiceProxyInter.queryAllOrderList();

        SubmitOrderReq submitOrderReq = new SubmitOrderReq();
        submitOrderReq.setBuyer("小明");
        submitOrderReq.setSkuId("1001");
        submitOrderReq.setSkuName("小米手机");
        orderServiceProxyInter.submitOrder(submitOrderReq);
    }
}
