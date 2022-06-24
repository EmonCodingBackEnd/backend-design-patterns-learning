package com.coding.design.patterns.structural.p09flyweight.define;

import java.util.Hashtable;

public class FlyweightFactory {

    private final Hashtable<String, Flyweight> flyweights = new Hashtable<>();

    public FlyweightFactory() {
        flyweights.put("X", new ConcreteFlyweight());
        flyweights.put("Y", new ConcreteFlyweight());
        flyweights.put("Z", new ConcreteFlyweight());
    }

    public Flyweight getFlyweight(String key) {
        return flyweights.get(key);
    }
}
