package com.coding.design.patterns.behavioral.p22visitor.example1;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<Course> courseList = new ArrayList<>();
        FreeCourse freeCourse = new FreeCourse();
        freeCourse.setName("SpringMVC数据绑定");
        CodingCourse codingCourse = new CodingCourse();
        codingCourse.setName("Java设计模式精讲 —— By Geely");
        codingCourse.setPrice(299);
        courseList.add(freeCourse);
        courseList.add(codingCourse);

        IVisitor visitor = new Visitor();
        for (Course course : courseList) {
            course.accept(visitor);
        }
    }
}
