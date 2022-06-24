package com.coding.design.patterns.behavioral.p13templatemethod.define;

public class ConcreteClassB extends AbstractClass {

    @Override
    protected void primitiveOperation1() {
        System.out.println("具体类B方法1实现");
    }

    @Override
    protected void primitiveOperation2() {
        System.out.println("具体类B方法2实现");
    }
}
