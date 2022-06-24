package com.coding.design.patterns.behavioral.p17observer.define;

public class Client {

    public static void main(String[] args) {
        ConcreteSubject s = new ConcreteSubject();
        s.attach(new ConcreteObserver("X", s));
        s.attach(new ConcreteObserver("Y", s));
        s.attach(new ConcreteObserver("Z", s));

        s.setSubjectState("ABC");
        s.notifys();
    }
}
