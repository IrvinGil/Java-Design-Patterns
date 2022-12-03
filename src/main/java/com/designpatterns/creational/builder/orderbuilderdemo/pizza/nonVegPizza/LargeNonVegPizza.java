package com.designpatterns.creational.builder.orderbuilderdemo.pizza.nonVegPizza;

import com.designpatterns.creational.builder.orderbuilderdemo.pizza.NonVegPizza;

public class LargeNonVegPizza extends NonVegPizza {
    @Override
    public float price() {
        return 220f;
    }

    @Override
    public String name() {
        return "Non-Veg Pizza";
    }

    @Override
    public String size() {
        return "Large size";
    }
}
