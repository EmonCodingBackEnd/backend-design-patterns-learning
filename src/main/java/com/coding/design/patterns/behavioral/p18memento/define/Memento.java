package com.coding.design.patterns.behavioral.p18memento.define;

/**
 * 备忘录类
 */
public class Memento {

    /**
     * 需要保存的属性，可能有多个。
     */
    private final String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
