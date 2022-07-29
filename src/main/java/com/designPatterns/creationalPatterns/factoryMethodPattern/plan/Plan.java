package com.designPatterns.creationalPatterns.factoryMethodPattern.plan;

public abstract class Plan {
    //TODO: create a plan abstract class
    protected double rate;

    public abstract void getRate();

    public void calculateBill(int units) {
        System.out.println(units * rate);
    }


}
