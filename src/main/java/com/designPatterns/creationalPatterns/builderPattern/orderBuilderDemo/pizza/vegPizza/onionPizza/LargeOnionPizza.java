package com.designPatterns.creationalPatterns.builderPattern.orderBuilderDemo.pizza.vegPizza.onionPizza;

import com.designPatterns.creationalPatterns.builderPattern.orderBuilderDemo.pizza.VegPizza;

public class LargeOnionPizza extends VegPizza {
    @Override
    public String name() {
        return "Onion Pizza";
    }

    @Override
    public String size() {
        return "Large size";
    }

    @Override
    public float price() {
        return 180.0f;
    }
}
