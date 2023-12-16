package com.designpatterns.behavioral.interpreter_pattern;

import java.util.Stack;


public class InfixToPostfixPattern implements Pattern {
    @Override
    public String conversion(String expression) {
        int priority = 0; // for the priority of operators

        String postfix = "";
        Stack<Character> stack = new Stack<Character>();

        for (int index = 0; index < expression.length(); index++) {
            char character = expression.charAt(index);
            if (character == '+' || character == '-' || character == '*' || character == '/' || character == '%') {
                // check the precedence
                if (stack.size() <= 0)
                    stack.push(character);
            } else {
                postfix += character;
                stack.push(character);

                Character characterTop = stack.peek();
                if (characterTop == '*' || characterTop == '/') {
                    priority = 1;
                } else {
                    priority = 0;
                }

                if (priority == 1) {
                    postfix += stack.pop();
                    index--;
                } else {

                    if (character == '+' || character == '-') {
                        postfix += stack.pop();
                        stack.push(character);
                    } else
                        stack.push(character);
                }
            }
        }
        int length = stack.size();
        for (int anotherIndex = 0; anotherIndex < length; anotherIndex++) {
            postfix += stack.pop();
        }

        return postfix;
    }
}
