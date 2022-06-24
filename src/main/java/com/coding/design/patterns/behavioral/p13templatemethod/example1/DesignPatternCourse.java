package com.coding.design.patterns.behavioral.p13templatemethod.example1;

public class DesignPatternCourse extends ACourse {

    @Override
    protected boolean needWriteArticle() {
        return true;
    }

    @Override
    void packageCourse() {
        System.out.println("提供课程Java源代码");
    }
}
