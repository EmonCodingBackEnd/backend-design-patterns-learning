package com.coding.design.patterns.behavioral.p23state.define;

public class ConcreteStateA extends State {


    @Override
    public void handle(Context context) {
        ConcreteStateB state = new ConcreteStateB();
        context.setState(state);
    }
}
