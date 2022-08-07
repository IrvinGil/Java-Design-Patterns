package com.designPatterns.creationalPatterns.builderPattern.orderBuilderDemo.pizza.vegPizza.onionPizza;

import com.designPatterns.creationalPatterns.builderPattern.orderBuilderDemo.pizza.VegPizza;

public class MediumOnionPizza extends VegPizza{
    @Override
    public String name() {
        return "Onion Pizza";
    }

    @Override
    public String size() {
        return "Medium size";
    }

    @Override
    public float price() {
        return 150.0f;
    }
}
