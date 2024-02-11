package com.designpatterns.behavioral.strategy_pattern;


public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public float executeStrategy(float number1, float number2){
        return strategy.calculation(number1, number2);
    }
}