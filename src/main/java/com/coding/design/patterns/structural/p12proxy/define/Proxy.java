package com.coding.design.patterns.structural.p12proxy.define;

public class Proxy extends Subject {
    RealSubject realSubject;

    @Override
    public void request() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        realSubject.request();
    }
}
