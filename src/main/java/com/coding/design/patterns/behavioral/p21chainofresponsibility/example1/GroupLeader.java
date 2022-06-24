package com.coding.design.patterns.behavioral.p21chainofresponsibility.example1;

import java.text.MessageFormat;

/**
 * 组长
 */
public class GroupLeader extends Leader {

    @Override
    public double limit() {
        return 1000;
    }

    @Override
    public void handle(double money) {
        System.out.println(MessageFormat.format("类 {0} 组长批复报销了你的 {1} 元", this.getClass().getSimpleName(), money));
    }
}
