package com.coding.design.patterns.structural.p08adapter.example1classadapter;

import com.coding.design.patterns.structural.p08adapter.example2objectadapter.Target;

public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("concreteTarget目标方法");
    }
}
