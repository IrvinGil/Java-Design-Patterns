package com.designpatterns.creational.builder.orderbuilderdemo.pizza.nonVegPizza;

import com.designpatterns.creational.builder.orderbuilderdemo.pizza.NonVegPizza;

public class SmallNonVegPizza extends NonVegPizza {
    @Override
    public float price() {
        return 180f;
    }

    @Override
    public String name() {
        return "Non-Veg Pizza";
    }

    @Override
    public String size() {
        return "Small size";
    }
}
