package com.coding.design.patterns.structural.p07decorator.example1.v2;

public class Test {
    public static void main(String[] args) {
        AbstractBattercake abstractBattercake;
        abstractBattercake = new Battercake();
        abstractBattercake = new EggDecorator(abstractBattercake);
        abstractBattercake = new EggDecorator(abstractBattercake);
        abstractBattercake = new SausageDecorator(abstractBattercake);


        System.out.println(abstractBattercake.getDesc() + " 销售价格：" + abstractBattercake.cost());

    }
}
