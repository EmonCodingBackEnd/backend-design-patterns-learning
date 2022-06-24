package com.coding.design.patterns.behavioral.p16interpreter.example1;

public class OperatorUtil {

    public static boolean isOperator(String symbol) {
        return ("+".equals(symbol) || "*".equals(symbol));
    }

    public static Interpreter getExpressionObject(Interpreter firstInterpreter, Interpreter secondInterpreter,
        String symbol) {
        if ("+".equals(symbol)) {
            return new AddInterpreter(firstInterpreter, secondInterpreter);
        } else if ("*".equals(symbol)) {
            return new MultiInterpreter(firstInterpreter, secondInterpreter);
        }
        return null;
    };
}
