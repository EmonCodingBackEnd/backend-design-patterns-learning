package com.coding.design.principle.p3singleresponsibility;

public class Bird {

    public void mainMoveMode(String birdName) {
        if ("大雁".equals(birdName)) {
            System.out.println(birdName + "用翅膀飞");
        } else {
            System.out.println(birdName + "用脚走");
        }
    }
}
