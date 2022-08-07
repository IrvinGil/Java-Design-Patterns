package com.designPatterns.creationalPatterns.builderPattern.orderBuilderDemo.pizza.vegPizza.onionPizza;

import com.designPatterns.creationalPatterns.builderPattern.orderBuilderDemo.pizza.VegPizza;

public class SmallOnionPizza extends VegPizza {
    @Override
    public String name() {
        return "Onion Pizza";
    }

    @Override
    public String size() {
        return "Small size";
    }

    @Override
    public float price() {
        return 120.0f;
    }
}
