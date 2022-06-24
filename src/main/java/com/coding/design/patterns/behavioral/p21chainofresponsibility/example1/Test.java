package com.coding.design.patterns.behavioral.p21chainofresponsibility.example1;

public class Test {

    public static void main(String[] args) {
        GroupLeader groupLeader = new GroupLeader();
        Director director = new Director();
        Manager manager = new Manager();
        Boss boss = new Boss();

        groupLeader.setNextHandler(director);
        director.setNextHandler(manager);
        manager.setNextHandler(boss);

        groupLeader.handleRequest(100000);
    }
}
