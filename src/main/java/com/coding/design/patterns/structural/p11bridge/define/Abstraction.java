package com.coding.design.patterns.structural.p11bridge.define;

public abstract class Abstraction {

    protected Implementor implementor;


    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }

    public abstract void operation();
}
