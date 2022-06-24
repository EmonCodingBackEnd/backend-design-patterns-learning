package com.coding.design.patterns.creational.p02abstractfactory;

public class JavaArticle extends Article {
    @Override
    public void produce() {
        System.out.println("编写Java课程手记");
    }
}
