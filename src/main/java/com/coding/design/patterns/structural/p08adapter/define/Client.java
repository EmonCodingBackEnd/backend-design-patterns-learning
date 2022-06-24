package com.coding.design.patterns.structural.p08adapter.define;

public class Client {
    public static void main(String[] args) {
        Target target = new Adapter();
        target.request();
    }
}
