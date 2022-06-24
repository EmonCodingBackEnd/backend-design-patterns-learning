package com.coding.design.patterns.creational.p02abstractfactory;

public class JavaVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Java课程视频");
    }
}
