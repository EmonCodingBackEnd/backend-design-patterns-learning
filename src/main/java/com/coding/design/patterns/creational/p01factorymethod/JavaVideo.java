package com.coding.design.patterns.creational.p01factorymethod;

public class JavaVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Java课程视频");
    }
}
