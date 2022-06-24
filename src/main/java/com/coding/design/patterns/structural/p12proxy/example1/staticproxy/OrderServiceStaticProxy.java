package com.coding.design.patterns.structural.p12proxy.example1.staticproxy;

import com.coding.design.patterns.structural.p12proxy.example1.IOrderService;
import com.coding.design.patterns.structural.p12proxy.example1.Order;
import com.coding.design.patterns.structural.p12proxy.example1.OrderServiceImpl;
import com.coding.design.patterns.structural.p12proxy.example1.db.DataSourceContextHolder;

public class OrderServiceStaticProxy {
    private IOrderService orderService;

    public int saveOrder(Order order) {
        beforeMethod(order);
        orderService = new OrderServiceImpl();
        int result = orderService.saveOrder(order);
        afterMethod();
        return result;
    }

    private void beforeMethod(Order order) {
        System.out.println("静态代理 before code");
        int userId = order.getUserId();
        int dbRouter = userId % 2;
        System.out.println("静态代理分配到【db" + dbRouter + "】");
        // TODO: 2022/6/6 设置dataSource;
        DataSourceContextHolder.setDBType(String.valueOf(dbRouter));
    }

    private void afterMethod() {
        System.out.println("静态代理 after code");
    }

}
