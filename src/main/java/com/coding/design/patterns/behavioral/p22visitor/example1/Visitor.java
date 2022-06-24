package com.coding.design.patterns.behavioral.p22visitor.example1;

public class Visitor implements IVisitor {
    @Override
    public void visit(FreeCourse course) {
        System.out.println("免费课程：" + course.getName());
    }

    @Override
    public void visit(CodingCourse course) {
        System.out.println("实战课程：" + course.getName() + " 价格" + course.getPrice());
    }
}
