package com.coding.design.patterns.structural.p09flyweight.example1;

public class Manager implements Employee {

    @Override
    public void report() {
        System.out.println(reportContent);
    }

    private String department;
    private String reportContent;

    public Manager(String department) {
        this.department = department;
    }

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }
}
