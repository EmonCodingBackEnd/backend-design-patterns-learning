package com.coding.design.patterns.behavioral.p22visitor.define;

/**
 * 比如：人类
 */
public abstract class Element {

    public abstract void accept(Visitor visitor);
}
