package com.coding.design.patterns.creational.p01factorymethod;

public class Test {

    public static void main(String[] args) {
        VideoFactory videoFactory = new FrontEndVideoFactory();
        Video video = videoFactory.getVideo();
        video.produce();
    }
}
