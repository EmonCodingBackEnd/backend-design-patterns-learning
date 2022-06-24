package com.coding.design.patterns.behavioral.p21chainofresponsibility.example1;

import java.text.MessageFormat;

/**
 * 经理
 */
public class Manager extends Leader {

    @Override
    public double limit() {
        return 50000;
    }

    @Override
    public void handle(double money) {
        System.out.println(MessageFormat.format("类 {0} 经理批复报销了你的 {1} 元", this.getClass().getSimpleName(), money));
    }
}
