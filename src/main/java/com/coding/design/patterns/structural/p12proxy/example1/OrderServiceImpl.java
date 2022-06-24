package com.coding.design.patterns.structural.p12proxy.example1;

public class OrderServiceImpl implements IOrderService {
    private IOrderDao orderDao;


    @Override
    public int saveOrder(Order order) {
        orderDao = new OrderDaoImpl();
        System.out.println("Service调用Dao层添加Order");
        return orderDao.insert(order);
    }
}
