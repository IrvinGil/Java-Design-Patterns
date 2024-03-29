package com.designpatterns.behavioral.strategy_pattern;

public class Subtraction implements Strategy {

    @Override
    public float calculation(float a, float b) {
        return a - b;
    }
}
