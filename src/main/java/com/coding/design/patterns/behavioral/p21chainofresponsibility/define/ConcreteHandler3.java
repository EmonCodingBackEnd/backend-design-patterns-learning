package com.coding.design.patterns.behavioral.p21chainofresponsibility.define;

import java.text.MessageFormat;

/**
 * 具体处理者类，处理它所负责的请求，可访问它的后继者；如果可处理该请求，就处理；否则就让渡给后继者处理。
 */
public class ConcreteHandler3 extends Handler {
    @Override
    public void handleRequest(int request) {
        // 仅处理20到30的请求
        if (request >= 20 && request < 30) {
            System.out.println(MessageFormat.format("{0}处理请求{1}", this.getClass().getSimpleName(), request));
        }
        // 转移到下一位
        else if (successor != null) {
            successor.handleRequest(request);
        }
    }
}
