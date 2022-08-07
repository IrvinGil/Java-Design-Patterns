package com.designPatterns.creationalPatterns.builderPattern.orderBuilderDemo.pizza.vegPizza.masalaPizza;

import com.designPatterns.creationalPatterns.builderPattern.orderBuilderDemo.pizza.VegPizza;

public class MediumMasalaPizza extends VegPizza {
    @Override
    public String name() {
        return "Masala Pizza";
    }

    @Override
    public String size() {
        return "Medium size";
    }

    @Override
    public float price() {
        return 120f;
    }
}
