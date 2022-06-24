package com.coding.design.patterns.behavioral.p20mediator.define;

public abstract class Mediator {

    public abstract void register(Colleague colleague);

    public abstract void relay(Colleague colleague);
}
