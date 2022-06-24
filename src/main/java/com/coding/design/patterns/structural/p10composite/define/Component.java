package com.coding.design.patterns.structural.p10composite.define;

public abstract class Component {

    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract void add(Component comp);

    public abstract void remove(Component comp);

    public abstract void display(int depth);
}
