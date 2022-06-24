package com.coding.design.patterns.behavioral.p18memento.define;

/**
 * 发起人类
 */
public class Originator {

    /**
     * 需要保存的属性，可能有多个。
     */
    private String state;

    /**
     * 创建备忘录，将当前需要保存的信息导入并实例化出一个Memento对象。
     * 
     * @return - 返回备忘录记录的对象。
     */
    public Memento createMemento() {
        return new Memento(state);
    }

    /**
     * 恢复备忘录，将Memento导入并将相关数据恢复。
     * 
     * @param memento - 备忘录对象
     */
    public void setMemento(Memento memento) {
        this.state = memento.getState();
    }

    public void show() {
        System.out.println("state=" + state);
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
