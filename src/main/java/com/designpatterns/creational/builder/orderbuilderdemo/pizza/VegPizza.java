package com.designpatterns.creational.builder.orderbuilderdemo.pizza;

public abstract class VegPizza extends Pizza {
    @Override
    public abstract String name();

    @Override
    public abstract String size();

    @Override
    public abstract float price();
}
