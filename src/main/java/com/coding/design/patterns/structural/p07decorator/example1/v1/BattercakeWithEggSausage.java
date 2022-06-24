package com.coding.design.patterns.structural.p07decorator.example1.v1;

public class BattercakeWithEggSausage extends BattercakeWithEgg {
    @Override
    protected String getDesc() {
        return super.getDesc() + " 加一根香肠";
    }

    @Override
    protected int cost() {
        return super.cost() + 2;
    }
}
