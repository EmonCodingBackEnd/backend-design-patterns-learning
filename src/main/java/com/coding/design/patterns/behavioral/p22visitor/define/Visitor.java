package com.coding.design.patterns.behavioral.p22visitor.define;

/**
 * 比如：各种状态
 */
public abstract class Visitor {

    public abstract void visitConcreteElementA(ConcreteElementA concreteElementA);
    public abstract void visitConcreteElementB(ConcreteElementB concreteElementA);
}
