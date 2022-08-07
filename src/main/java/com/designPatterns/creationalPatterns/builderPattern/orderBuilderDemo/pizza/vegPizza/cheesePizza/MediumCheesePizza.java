package com.designPatterns.creationalPatterns.builderPattern.orderBuilderDemo.pizza.vegPizza.cheesePizza;

import com.designPatterns.creationalPatterns.builderPattern.orderBuilderDemo.pizza.VegPizza;

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
