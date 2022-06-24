package com.coding.design.patterns.behavioral.p20mediator.define;

import java.text.MessageFormat;

public class ConcreteColleague1 extends Colleague {

    @Override
    public void receive() {
        System.out.println(MessageFormat.format("具体同事类 {0} 收到请求", this.getClass().getSimpleName()));
    }

    @Override
    public void send() {
        System.out.println(MessageFormat.format("具体同事类 {0} 发出请求", this.getClass().getSimpleName()));
        mediator.relay(this);
    }
}
