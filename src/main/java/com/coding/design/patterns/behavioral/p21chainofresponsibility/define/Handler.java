package com.coding.design.patterns.behavioral.p21chainofresponsibility.define;

/**
 * 定义一个处理请求的接口
 */
public abstract class Handler {

    protected Handler successor;

    /**
     * 设置继任者
     *
     * @param successor - 继承人
     */
    public final void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    /**
     * 处理请求的抽象方法
     *
     * @param request
     */
    public abstract void handleRequest(int request);
}
