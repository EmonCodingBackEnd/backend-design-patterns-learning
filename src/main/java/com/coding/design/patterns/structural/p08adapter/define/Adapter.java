package com.coding.design.patterns.structural.p08adapter.define;

public class Adapter implements Target {
    private final Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
