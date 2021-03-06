package com.coding.design.patterns.structural.p06facade.define;

/**
 * 外观类，它需要了解所有的子系统的方法或属性，进行组合，以备外界调用。
 */
public class Facade {

    SubSystemOne one;
    SubSystemTwo two;
    SubSystemThree three;
    SubSystemFour four;

    public Facade() {
        one = new SubSystemOne();
        two = new SubSystemTwo();
        three = new SubSystemThree();
        four = new SubSystemFour();
    }

    public void methodA() {
        System.out.println("方法组A() --- ");
        one.methodOne();
        two.methodTwo();
        four.methodFour();
    }

    public void methodB() {
        System.out.println("方法组B() --- ");
        two.methodTwo();
        three.methodThree();
    }
}
