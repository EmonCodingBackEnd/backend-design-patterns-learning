package com.coding.design.patterns.structural.p09flyweight.example1;

public class Test {
    private static final String[] DEPARTMENTS = {"RD", "QA", "PM", "BD"};

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            String department = DEPARTMENTS[(int) (Math.random() * DEPARTMENTS.length)];
            Manager manager = (Manager) EmployeeFactory.getManager(department);
            manager.report();
        }
    }
}
