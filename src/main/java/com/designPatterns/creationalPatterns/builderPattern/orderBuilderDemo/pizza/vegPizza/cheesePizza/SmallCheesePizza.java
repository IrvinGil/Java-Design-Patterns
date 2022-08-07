package com.designPatterns.creationalPatterns.builderPattern.orderBuilderDemo.pizza.vegPizza.cheesePizza;

import com.designPatterns.creationalPatterns.builderPattern.orderBuilderDemo.pizza.VegPizza;

public class SmallCheesePizza extends VegPizza {
    @Override
    public String name() {
        return "Cheese Pizza";
    }

    @Override
    public String size() {
        return "Small size";
    }

    @Override
    public float price() {
        return 170.0f;
    }
}
