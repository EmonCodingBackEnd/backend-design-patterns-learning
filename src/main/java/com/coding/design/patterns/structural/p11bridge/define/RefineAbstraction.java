package com.coding.design.patterns.structural.p11bridge.define;

public class RefineAbstraction extends Abstraction {
    @Override
    public void operation() {
        implementor.operation();
    }
}
