package com.coding.design.patterns.structural.p08adapter.example2objectadapter;

public class Adapter implements Target {
    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        adaptee.adapteeRequest();
    }
}
