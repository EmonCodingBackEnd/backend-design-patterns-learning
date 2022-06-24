package com.coding.design.patterns.behavioral.p21chainofresponsibility.example2;

public abstract class Approver {

    protected Approver approver;

    public void setNextApprover(Approver approver) {
        this.approver = approver;
    }

    public abstract void deploy(Course course);
}
