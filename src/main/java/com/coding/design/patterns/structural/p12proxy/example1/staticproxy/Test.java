package com.coding.design.patterns.structural.p12proxy.example1.staticproxy;

import com.coding.design.patterns.structural.p12proxy.example1.Order;

public class Test {

    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(2);

        OrderServiceStaticProxy proxy = new OrderServiceStaticProxy();
        proxy.saveOrder(order);
    }
}
