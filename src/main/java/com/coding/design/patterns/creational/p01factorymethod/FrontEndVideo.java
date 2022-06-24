package com.coding.design.patterns.creational.p01factorymethod;

public class FrontEndVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制前端课程视频");
    }
}
