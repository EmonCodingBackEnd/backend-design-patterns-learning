package com.coding.design.principle.p2dependendceinversion;

public class Test {

    public static void main(String[] args) {
        Emon emon = new Emon(new JavaCourse());
        emon.studyCourse();

        emon.setiCourse(new FrontEndCourse());
        emon.studyCourse();

        emon.setiCourse(new PythonCourse());
        emon.studyCourse();
    }
}
