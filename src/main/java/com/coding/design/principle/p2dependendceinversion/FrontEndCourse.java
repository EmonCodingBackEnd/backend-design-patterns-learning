package com.coding.design.principle.p2dependendceinversion;

public class FrontEndCourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("emon在学习前端课程");
    }
}
