package com.coding.design.patterns.behavioral.p16interpreter.define;

public class NonterminalExpression extends AbstractExpression {

    @Override
    public void interpret(Context context) {
        System.out.println("非终端解释器");
    }
}
