package com.coding.design.patterns.structural.p11bridge.define;

public class ConcreteImplementorA extends Implementor {

    @Override
    public void operation() {
        System.out.println("具体实现A的方法执行");
    }
}
