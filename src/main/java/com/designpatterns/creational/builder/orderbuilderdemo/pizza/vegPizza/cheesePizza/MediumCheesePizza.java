package com.designpatterns.creational.builder.orderbuilderdemo.pizza.vegPizza.cheesePizza;

import com.designpatterns.creational.builder.orderbuilderdemo.pizza.VegPizza;

public class MediumCheesePizza extends VegPizza {
    @Override
    public String name() {
        return "Cheese Pizza";
    }

    @Override
    public String size() {
        return "Medium size";
    }

    @Override
    public float price() {
        return 220.0f;
    }
}
