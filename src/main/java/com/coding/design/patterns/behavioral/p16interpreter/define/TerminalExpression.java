package com.coding.design.patterns.behavioral.p16interpreter.define;

public class TerminalExpression extends AbstractExpression {

    @Override
    public void interpret(Context context) {
        System.out.println("终端解释器");
    }
}
