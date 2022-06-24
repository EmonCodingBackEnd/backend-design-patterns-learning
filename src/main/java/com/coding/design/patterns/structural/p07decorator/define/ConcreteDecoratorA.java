package com.coding.design.patterns.structural.p07decorator.define;

public class ConcreteDecoratorA extends Decorator {

    /**
     * 本类的独有功能，以区别 ConcreteDecoratorB
     */
    private String addedState;

    @Override
    public void operation() {
        super.operation();
        addedState = "New State";
        System.out.println("具体装饰对象A的操作");
    }
}
