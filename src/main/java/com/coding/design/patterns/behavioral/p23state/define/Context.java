package com.coding.design.patterns.behavioral.p23state.define;

public class Context {

    private State state;

    public Context(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        System.out
            .println("之前状态：" + this.state.getClass().getSimpleName() + " 当前状态：" + state.getClass().getSimpleName());
        this.state = state;
    }

    public void request() {
        state.handle(this);
    }
}
