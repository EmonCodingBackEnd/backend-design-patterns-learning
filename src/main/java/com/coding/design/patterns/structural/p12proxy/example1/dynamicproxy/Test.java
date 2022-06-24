package com.coding.design.patterns.structural.p12proxy.example1.dynamicproxy;

import com.coding.design.patterns.structural.p12proxy.example1.IOrderService;
import com.coding.design.patterns.structural.p12proxy.example1.Order;
import com.coding.design.patterns.structural.p12proxy.example1.OrderServiceImpl;

public class Test {

    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(2);

        IOrderService proxy = (IOrderService) new OrderServiceDynamicProxy(new OrderServiceImpl()).bind();
        proxy.saveOrder(order);

    }
}
