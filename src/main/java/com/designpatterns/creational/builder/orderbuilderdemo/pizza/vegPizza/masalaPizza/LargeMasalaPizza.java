package com.designpatterns.creational.builder.orderbuilderdemo.pizza.vegPizza.masalaPizza;

import com.designpatterns.creational.builder.orderbuilderdemo.pizza.VegPizza;

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
