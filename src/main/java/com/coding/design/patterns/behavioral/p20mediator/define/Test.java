package com.coding.design.patterns.behavioral.p20mediator.define;

public class Test {

    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();

        Colleague c1 = new ConcreteColleague1();
        Colleague c2 = new ConcreteColleague2();

        mediator.register(c1);
        mediator.register(c2);

        c1.send();
        System.out.println("==========");
        c2.send();
    }
}
