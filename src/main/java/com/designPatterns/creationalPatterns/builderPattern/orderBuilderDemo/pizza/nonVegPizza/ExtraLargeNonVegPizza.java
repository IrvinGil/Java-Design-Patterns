package com.designPatterns.creationalPatterns.builderPattern.orderBuilderDemo.pizza.nonVegPizza;

import com.designPatterns.creationalPatterns.builderPattern.orderBuilderDemo.pizza.NonVegPizza;

public class ExtraLargeNonVegPizza extends NonVegPizza {
    @Override
    public float price() {
        return 250f;
    }

    @Override
    public String name() {
        return "Non-Veg Pizza";
    }

    @Override
    public String size() {
        return "Extra Large size";
    }
}
