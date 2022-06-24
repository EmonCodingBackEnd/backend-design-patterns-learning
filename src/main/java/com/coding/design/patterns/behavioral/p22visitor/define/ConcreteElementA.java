package com.coding.design.patterns.behavioral.p22visitor.define;

/**
 * 比如：男人
 */
public class ConcreteElementA extends Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementA(this);
    }

    public void operationA() {
        System.out.println("A的其他方法");
    }
}
