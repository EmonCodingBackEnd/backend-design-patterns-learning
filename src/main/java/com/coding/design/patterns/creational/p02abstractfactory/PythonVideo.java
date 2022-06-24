package com.coding.design.patterns.creational.p02abstractfactory;

public class PythonVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Python课程视频");
    }
}
