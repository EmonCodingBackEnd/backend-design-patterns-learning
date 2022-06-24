package com.coding.design.patterns.creational.p00simplefactory;

public class JavaVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Java课程视频");
    }
}
