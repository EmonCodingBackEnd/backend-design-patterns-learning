package com.coding.design.patterns.behavioral.p22visitor.example1;

public interface IVisitor {

    /**
     * 访问免费课程，打印所有免费课程名称
     * 
     * @param course - 免费课程
     */
    void visit(FreeCourse course);

    /**
     * 访问实战课程，打印所有实战课程的名称及价格
     *
     * @param course - 实战课程
     */
    void visit(CodingCourse course);
}
