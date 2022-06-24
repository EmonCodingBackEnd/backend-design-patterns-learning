package com.coding.design.patterns.structural.p12proxy.define;

public class RealSubject extends Subject {

    @Override
    public void request() {
        System.out.println("真实的请求");
    }
}
