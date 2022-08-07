package com.designPatterns.creationalPatterns.builderPattern.orderBuilderDemo.pizza.nonVegPizza;

import com.designPatterns.creationalPatterns.builderPattern.orderBuilderDemo.pizza.NonVegPizza;

public class MediumNonVegaPizza extends NonVegPizza {
    @Override
    public float price() {
        return 200f;
    }

    @Override
    public String name() {
        return "Non-Veg Pizza";
    }

    @Override
    public String size() {
        return "Medium size";
    }
}
