package com.coding.design.patterns.creational.p00simplefactory;

public class Test {

    public static void main(String[] args) {
        VideoFactory videoFactory = new VideoFactory();
        // Video video = videoFactory.getVideo("java");
        Video video = videoFactory.getVideo2(JavaVideo.class);
        if (video == null) {
            return;
        }
        video.produce();
    }
}
