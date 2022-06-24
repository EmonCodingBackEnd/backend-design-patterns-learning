package com.coding.design.patterns.structural.p09flyweight.define;

public class Client {

    public static void main(String[] args) {
        int extrinsicState = 22;

        FlyweightFactory flyweightFactory = new FlyweightFactory();

        Flyweight flyweightX = flyweightFactory.getFlyweight("X");
        flyweightX.operation(--extrinsicState);

        Flyweight flyweightY = flyweightFactory.getFlyweight("Y");
        flyweightY.operation(--extrinsicState);

        Flyweight flyweightZ = flyweightFactory.getFlyweight("Z");
        flyweightZ.operation(--extrinsicState);

        Flyweight flyweight = new UnsharedConcreteFlyweight();
        flyweight.operation(--extrinsicState);

    }
}
