package com.designPatterns.creationalPatterns.builderPattern.orderBuilderDemo.pizza.vegPizza.cheesePizza;

import com.designPatterns.creationalPatterns.builderPattern.orderBuilderDemo.pizza.VegPizza;

public class LargeCheesePizza extends VegPizza {
    @Override
    public String name() {
        return "Cheese Pizza";
    }

    @Override
    public String size() {
        return "Large size";
    }

    @Override
    public float price() {
        return 260.0f;
    }
}
