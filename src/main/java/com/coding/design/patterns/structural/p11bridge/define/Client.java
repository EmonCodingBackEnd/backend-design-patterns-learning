package com.coding.design.patterns.structural.p11bridge.define;

public class Client {

    public static void main(String[] args) {
        Abstraction ab = new RefineAbstraction();

        ab.setImplementor(new ConcreteImplementorA());
        ab.operation();

        ab.setImplementor(new ConcreteImplementorB());
        ab.operation();
    }
}
