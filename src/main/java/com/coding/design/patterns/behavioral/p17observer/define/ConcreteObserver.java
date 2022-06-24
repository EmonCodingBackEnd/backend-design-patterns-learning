package com.coding.design.patterns.behavioral.p17observer.define;

import java.text.MessageFormat;

/**
 * 具体观察者，实现抽象观察者要求的更新接口，以便使本身的状态与主题的状态相协调。
 */
public class ConcreteObserver extends Observer {

    private final String name;
    private String observerState;
    private ConcreteSubject subject;

    public ConcreteObserver(String name, ConcreteSubject subject) {
        this.name = name;
        this.subject = subject;
    }

    @Override
    public void update() {
        observerState = subject.getSubjectState();
        System.out.println(MessageFormat.format("观察者{0}的新状态是{1}", name, observerState));
    }

    public ConcreteSubject getSubject() {
        return subject;
    }

    public void setSubject(ConcreteSubject subject) {
        this.subject = subject;
    }
}
