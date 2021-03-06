package com.coding.design.patterns.behavioral.p15strategy.define;

// 上下文
public class Context {

    Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    // 上下文接口
    public void contextInterface() {
        strategy.algorithmInterface();
    }
}
