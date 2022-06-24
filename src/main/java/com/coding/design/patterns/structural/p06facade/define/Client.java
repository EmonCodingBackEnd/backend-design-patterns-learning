package com.coding.design.patterns.structural.p06facade.define;

public class Client {

    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.methodA();
        facade.methodB();
    }

}
