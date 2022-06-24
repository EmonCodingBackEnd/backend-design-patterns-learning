package com.coding.design.patterns.behavioral.p22visitor.define;

import java.text.MessageFormat;

/**
 * 比如恋爱
 */
public class ConcreteVisitor2 extends Visitor {

    @Override
    public void visitConcreteElementA(ConcreteElementA concreteElementA) {
        System.out.println(MessageFormat.format("{0}被{1}访问，男人恋爱时凡事不懂也装作懂！", concreteElementA.getClass().getSimpleName(),
            this.getClass().getSimpleName()));
    }

    @Override
    public void visitConcreteElementB(ConcreteElementB concreteElementB) {
        System.out.println(MessageFormat.format("{0}被{1}访问，女人恋爱时遇事懂也装不懂！", concreteElementB.getClass().getSimpleName(),
            this.getClass().getSimpleName()));
    }
}
