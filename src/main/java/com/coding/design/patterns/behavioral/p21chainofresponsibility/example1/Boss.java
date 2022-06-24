package com.coding.design.patterns.behavioral.p21chainofresponsibility.example1;

import java.text.MessageFormat;

/**
 * 大BOSS
 */
public class Boss extends Leader {

    @Override
    public double limit() {
        return 99999;
    }

    @Override
    public void handle(double money) {
        System.out.println(MessageFormat.format("类 {0} 老板批复报销了你的 {1} 元", this.getClass().getSimpleName(), money));
    }
}
