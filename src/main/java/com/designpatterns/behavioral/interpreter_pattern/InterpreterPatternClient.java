package com.designpatterns.behavioral.interpreter_pattern;

// [December 16, 2023]
// NOTE: This pattern demo has been deemed incomplete due to the inconsistencies on the javatpoint web page.
//  For more information visit the demo page where the source code is shown: https://www.javatpoint.com/interpreter-pattern

// NOTE: The output of running this main class is unreliable.
public class InterpreterPatternClient {
    public static void main(String[] args) {
        String infix = "a+b*c";

        InfixToPostfixPattern infixToPostfix = new InfixToPostfixPattern();

        String postfix = infixToPostfix.conversion(infix);
        System.out.println("Infix: >> " + infix);
        System.out.println("Postfix: >> " + postfix);
    }
}
