package com.designPatterns.creationalPatterns.builderPattern.orderBuilderDemo.pizza.vegPizza.masalaPizza;

import com.designPatterns.creationalPatterns.builderPattern.orderBuilderDemo.pizza.VegPizza;

public class LargeMasalaPizza extends VegPizza {
    @Override
    public String name() {
        return "Masala Pizza";
    }

    @Override
    public String size() {
        return "Large size";
    }

    @Override
    public float price() {
        return 150f;
    }
}
