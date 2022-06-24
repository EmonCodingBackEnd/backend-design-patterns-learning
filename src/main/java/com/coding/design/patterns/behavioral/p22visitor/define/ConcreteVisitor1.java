package com.coding.design.patterns.behavioral.p22visitor.define;

import java.text.MessageFormat;

/**
 * 比如：成功
 */
public class ConcreteVisitor1 extends Visitor {

    @Override
    public void visitConcreteElementA(ConcreteElementA concreteElementA) {
        System.out.println(MessageFormat.format("{0}被{1}访问，男人成功时，背后多半有一个伟大的女人。",
            concreteElementA.getClass().getSimpleName(), this.getClass().getSimpleName()));
    }

    @Override
    public void visitConcreteElementB(ConcreteElementB concreteElementA) {
        System.out.println(MessageFormat.format("{0}被{1}访问，女人成功时，背后大多有一个不成器的男人。",
            concreteElementA.getClass().getSimpleName(), this.getClass().getSimpleName()));
    }
}
