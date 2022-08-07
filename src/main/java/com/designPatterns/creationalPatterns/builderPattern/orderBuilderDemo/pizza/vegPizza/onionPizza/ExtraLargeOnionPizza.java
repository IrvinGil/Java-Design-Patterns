package com.designPatterns.creationalPatterns.builderPattern.orderBuilderDemo.pizza.vegPizza.onionPizza;

import com.designPatterns.creationalPatterns.builderPattern.orderBuilderDemo.pizza.VegPizza;

public class ExtraLargeOnionPizza extends VegPizza {
    @Override
    public String name() {
        return "Onion Pizza";
    }

    @Override
    public String size() {
        return "Extra Large size";
    }

    @Override
    public float price() {
        return 200.0f;
    }
}
