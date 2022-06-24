package com.coding.design.patterns.structural.p09flyweight.define;

/**
 * 继承 Flyweight 超类或实现 Flyweight 接口，并未内部状态增加存储空间。
 */
public class ConcreteFlyweight extends Flyweight {

    @Override
    public void operation(int extrinsicState) {
        System.out.println("具体Flyweight：" + extrinsicState);
    }

}
