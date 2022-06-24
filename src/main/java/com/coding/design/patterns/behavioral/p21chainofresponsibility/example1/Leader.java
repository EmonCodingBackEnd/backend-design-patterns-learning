package com.coding.design.patterns.behavioral.p21chainofresponsibility.example1;

import java.text.MessageFormat;

public abstract class Leader {

    /**
     * 上一级领导（处理者），UML图中的successor
     */
    protected Leader nextHandler;

    /**
     * 设置上级领导
     *
     * @param nextHandler - 上级领导
     */
    public void setNextHandler(Leader nextHandler) {
        this.nextHandler = nextHandler;
    }

    public final void handleRequest(double money) {
        if (money <= limit()) {
            handle(money);
        } else {
            if (null != nextHandler) {
                System.out.println(MessageFormat.format("类 {0} 没有权限批复你的报销，即将上报！", this.getClass().getSimpleName()));
                nextHandler.handleRequest(money);
            } else {
                System.out.println(MessageFormat.format("没有领导能批复你的票据报销啦，自己去报销吧！类 {0}", this.getClass().getSimpleName()));
            }
        }
    }

    /**
     * 自身能批复的报账额度
     *
     * @return - 额度
     */
    public abstract double limit();


    /**
     * 处理报账行为
     *
     * @param money - 报账额度
     */
    public abstract void handle(double money);
}
