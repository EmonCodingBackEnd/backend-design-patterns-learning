package com.coding.design.patterns.behavioral.p17observer.example2;

import com.google.common.eventbus.EventBus;

public class Test {

    public static void main(String[] args) {
        EventBus eventBus = new EventBus();
        GuavaEvent guavaEvent = new GuavaEvent();
        eventBus.register(guavaEvent);
        eventBus.post("post的内容");
    }
}
