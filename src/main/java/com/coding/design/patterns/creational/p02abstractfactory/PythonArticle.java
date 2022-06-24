package com.coding.design.patterns.creational.p02abstractfactory;

public class PythonArticle extends Article {
    @Override
    public void produce() {
        System.out.println("编写Python课程手记");
    }
}
