package com.coding.design.patterns.behavioral.p17observer.define;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象通知者，一般用一个抽象类或者一个接口实现。它把所有对观察者对象的引用保存在一个聚集里，每个主题都可以有任何数量的观察者。
 */
public abstract class Subject {

    private List<Observer> observers = new ArrayList<>();

    /**
     * 增加观察者
     * 
     * @param observer - 观察者
     */
    public void attach(Observer observer) {
        observers.add(observer);
    }

    /**
     * 移除观察者
     * 
     * @param observer - 观察者
     */
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    /**
     * 通知观察者
     */
    public void notifys() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
