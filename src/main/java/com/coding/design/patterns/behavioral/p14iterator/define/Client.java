package com.coding.design.patterns.behavioral.p14iterator.define;


public class Client {

    public static void main(String[] args) {
        ConcreteAggregate a = new ConcreteAggregate();
        a.setItem("大鸟");
        a.setItem("小菜");
        a.setItem("行李");
        a.setItem("老外");
        a.setItem("公交内部员工");
        a.setItem("小偷");

        Iterator i = a.createIterator();
        System.out.println(i.first());
        while (!i.isDone()) {
            System.out.printf("%s 请买车票！%n", i.currentItem());
            i.next();
        }

    }
}
