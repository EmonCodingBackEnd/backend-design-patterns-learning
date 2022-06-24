package com.coding.design.patterns.behavioral.p23state.define;

public class ConcreteStateB extends State {


    @Override
    public void handle(Context context) {
        ConcreteStateA state = new ConcreteStateA();
        context.setState(state);
    }
}
