package com.coding.design.patterns.structural.p08adapter.example1classadapter;

import com.coding.design.patterns.structural.p08adapter.example2objectadapter.Target;

public class Test {

    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.request();

        Target adapterTarget = new Adapter();
        adapterTarget.request();
    }
}
