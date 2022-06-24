package com.coding.design.patterns.behavioral.p13templatemethod.define;

public abstract class AbstractClass {

    protected abstract void primitiveOperation1();

    protected abstract void primitiveOperation2();

    public final void templateMethod() {
        primitiveOperation1();
        primitiveOperation2();
    }
}
