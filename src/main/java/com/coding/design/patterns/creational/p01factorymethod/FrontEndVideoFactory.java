package com.coding.design.patterns.creational.p01factorymethod;

public class FrontEndVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new FrontEndVideo();
    }
}
