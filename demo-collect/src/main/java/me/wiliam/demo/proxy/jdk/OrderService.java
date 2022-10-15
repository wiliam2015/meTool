package me.wiliam.demo.proxy.jdk;

import me.wiliam.demo.proxy.jdk.dto.SubmitOrderReq;

import java.util.List;

/**
 * 订单服务 动态代理学习使用
 */
public interface OrderService {

    /**
     * 下单
     * @param submitOrderReq
     */
    void submitOrder(SubmitOrderReq submitOrderReq);

    /**
     * 查询所有订单
     * @return
     */
    List<SubmitOrderReq> queryAllOrderList();
}
