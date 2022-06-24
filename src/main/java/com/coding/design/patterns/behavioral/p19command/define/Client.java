package com.coding.design.patterns.behavioral.p19command.define;

public class Client {

    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command cmd = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker();

        invoker.setCommand(cmd);
        invoker.executeCommand();
    }
}
