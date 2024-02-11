package com.designpatterns.behavioral.strategy_pattern;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StrategyPatternDemo {

    public static void main(String[] args) {
        try {

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the first value: ");

            float firstValue = Float.parseFloat(bufferedReader.readLine());
            System.out.println("Enter the second value: ");

            float secondValue = Float.parseFloat(bufferedReader.readLine());

            Context context = new Context(new Addition());
            System.out.println("Addition = " + context.executeStrategy(firstValue, secondValue));

            context = new Context(new Subtraction());
            System.out.println("Subtraction = " + context.executeStrategy(firstValue, secondValue));

            context = new Context(new Subtraction());
            System.out.println("Multiplication = " + context.executeStrategy(firstValue, secondValue));
        } catch (Exception exception) {
            System.out.println(exception);
        }

    }
}