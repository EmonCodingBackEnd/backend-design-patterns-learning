package com.coding.design.principle.p2dependendceinversion;

public class Emon {
    private ICourse iCourse;

    public Emon(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public void studyCourse() {
        iCourse.studyCourse();
    }

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }
}
