package com.coding.design.patterns.behavioral.p20mediator.example1;

public class Test {

    public static void main(String[] args) {
        User user1 = new User("user1");
        User user2 = new User("user2");

        user1.sendMessage("Hey! let's go to bed!");
        user2.sendMessage("OK!");
    }
}
