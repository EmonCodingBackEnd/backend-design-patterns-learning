package com.coding.design.patterns.behavioral.p22visitor.example1;

public class FreeCourse extends Course {

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
