package com.coding.design.patterns.structural.p10composite.example1;

public class Course extends CatalogComponent {

    private String name;
    private double price;

    public Course(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName(CatalogComponent comp) {
        return this.name;
    }

    @Override
    public double getPrice(CatalogComponent comp) {
        return this.price;
    }

    @Override
    public void print() {
        System.out.println("Course Name:" + name + " Course Price" + price);
    }
}
