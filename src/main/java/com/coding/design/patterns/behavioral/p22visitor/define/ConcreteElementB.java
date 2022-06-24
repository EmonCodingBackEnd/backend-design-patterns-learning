package com.coding.design.patterns.behavioral.p22visitor.define;

/**
 * 比如：女人
 */
public class ConcreteElementB extends Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementB(this);
    }

    public void operationB() {
        System.out.println("B的其他方法");
    }
}
