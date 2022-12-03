package com.designpatterns.creational.builder.orderbuilderdemo.pizza.vegPizza.onionPizza;

import com.designpatterns.creational.builder.orderbuilderdemo.pizza.VegPizza;

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
