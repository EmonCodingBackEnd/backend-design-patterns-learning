package com.coding.design.patterns.behavioral.p17observer.example2;

import com.google.common.eventbus.Subscribe;

public class GuavaEvent {

    @Subscribe
    public void subscribe(String str) {
        // 业务逻辑
        System.out.println("执行subscribe方法，传入的参数是：" + str);
    }
}
