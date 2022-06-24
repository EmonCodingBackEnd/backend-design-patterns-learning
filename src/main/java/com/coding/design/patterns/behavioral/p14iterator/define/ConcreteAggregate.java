package com.coding.design.patterns.behavioral.p14iterator.define;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate extends Aggregate {

    private List<Object> items = new ArrayList<>();

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    public int count() {
        return items.size();
    }

    public Object index(int index) {
        return items.get(index);
    }

    public void setItem(String item) {
        this.items.add(item);
    }
}
