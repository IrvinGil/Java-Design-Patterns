package com.designPatterns.creationalPatterns.builderPattern.orderBuilderDemo.pizza.vegPizza.masalaPizza;

import com.designPatterns.creationalPatterns.builderPattern.orderBuilderDemo.pizza.VegPizza;

public class SmallMasalaPizza extends VegPizza {
    @Override
    public String name() {
        return "Masala Pizza";
    }

    @Override
    public String size() {
        return "Small size";
    }

    @Override
    public float price() {
        return 100f;
    }
}
