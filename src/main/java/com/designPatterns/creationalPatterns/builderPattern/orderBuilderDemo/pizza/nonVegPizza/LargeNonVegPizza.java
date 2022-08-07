package com.designPatterns.creationalPatterns.builderPattern.orderBuilderDemo.pizza.nonVegPizza;

import com.designPatterns.creationalPatterns.builderPattern.orderBuilderDemo.pizza.NonVegPizza;

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
