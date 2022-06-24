package com.coding.design.patterns.structural.p09flyweight.define;

/**
 * UnsharedConcreteFlyweight 是指那些不需要共享的 Flyweight 子类。因为 Flyweight 接口共享成为可能，但它并不强制共享。
 */
public class UnsharedConcreteFlyweight extends Flyweight {

    @Override
    public void operation(int extrinsicState) {

    }

}
