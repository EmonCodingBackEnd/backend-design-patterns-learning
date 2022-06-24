package com.coding.design.patterns.behavioral.p18memento.define;

/**
 * 管理者类
 */
public class Caretaker {

    private Memento memento;

    /**
     * 得到备忘录
     * 
     * @return - 备忘录
     */
    public Memento getMemento() {
        return memento;
    }

    /**
     * 设置备忘录里
     * 
     * @param memento - 备忘录
     */
    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
