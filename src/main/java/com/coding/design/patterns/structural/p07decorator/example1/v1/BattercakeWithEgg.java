package com.coding.design.patterns.structural.p07decorator.example1.v1;

public class BattercakeWithEgg extends Battercake {
    @Override
    protected String getDesc() {
        return super.getDesc() + " 加一个鸡蛋";
    }

    @Override
    protected int cost() {
        return super.cost() + 1;
    }
}
