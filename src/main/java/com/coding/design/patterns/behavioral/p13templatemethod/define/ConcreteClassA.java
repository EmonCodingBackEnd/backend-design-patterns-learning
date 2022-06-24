package com.coding.design.patterns.behavioral.p13templatemethod.define;

public class ConcreteClassA extends AbstractClass {

    @Override
    protected void primitiveOperation1() {
        System.out.println("具体类A方法1实现");
    }

    @Override
    protected void primitiveOperation2() {
        System.out.println("具体类A方法2实现");
    }
}
