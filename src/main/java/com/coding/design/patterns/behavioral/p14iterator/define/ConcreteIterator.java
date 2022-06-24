package com.coding.design.patterns.behavioral.p14iterator.define;

public class ConcreteIterator extends Iterator {

    private ConcreteAggregate aggregate;
    private int current = 0;

    public ConcreteIterator(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public Object first() {
        return aggregate.index(0);
    }

    @Override
    public Object next() {
        Object ret = null;
        current++;
        if (current < aggregate.count()) {
            ret = aggregate.index(current);
        }
        return ret;
    }

    @Override
    public boolean isDone() {
        return current >= aggregate.count();
    }

    @Override
    public Object currentItem() {
        return aggregate.index(current);
    }
}
