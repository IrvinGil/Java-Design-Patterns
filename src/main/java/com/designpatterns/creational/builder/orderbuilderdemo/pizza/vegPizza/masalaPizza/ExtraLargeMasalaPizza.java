package com.designpatterns.creational.builder.orderbuilderdemo.pizza.vegPizza.masalaPizza;

import com.designpatterns.creational.builder.orderbuilderdemo.pizza.VegPizza;

public class ExtraLargeMasalaPizza extends VegPizza {
    @Override
    public String name() {
        return "Masala Pizza";
    }

    @Override
    public String size() {
        return "Extra Large size";
    }

    @Override
    public float price() {
        return 180f;
    }
}
