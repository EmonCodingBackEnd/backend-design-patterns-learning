package com.coding.design.patterns.behavioral.p18memento.define;

public class Client {

    public static void main(String[] args) {
        Originator o = new Originator();
        o.setState("On");
        o.show();

        // 保存状态时，由于有了很好的封装性，可以隐藏Originator的实现细节
        Caretaker c = new Caretaker();
        c.setMemento(o.createMemento());

        o.setState("Off");
        o.show();

        // 恢复原初始状态
        o.setMemento(c.getMemento());
        o.show();
    }
}
