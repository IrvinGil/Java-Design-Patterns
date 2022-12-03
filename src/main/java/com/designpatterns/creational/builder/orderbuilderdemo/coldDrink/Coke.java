package com.designpatterns.creational.builder.orderbuilderdemo.coldDrink;

public abstract class Coke extends ColdDrink {

    @Override
    public abstract float price();

    @Override
    public abstract String name();

    @Override
    public abstract String size();
}
