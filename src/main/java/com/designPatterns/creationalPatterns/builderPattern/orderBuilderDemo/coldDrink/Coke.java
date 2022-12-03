package com.designPatterns.creationalPatterns.builderPattern.orderBuilderDemo.coldDrink;

public abstract class Coke extends ColdDrink {

    @Override
    public abstract float price();

    @Override
    public abstract String name();

    @Override
    public abstract String size();
}