package com.designpatterns.creational.builder.orderbuilderdemo.coldDrink.coke;

import com.designpatterns.creational.builder.orderbuilderdemo.coldDrink.Coke;

public class SmallCoke extends Coke {
    @Override
    public float price() {
        return 25f;
    }

    @Override
    public String name() {
        return "300 ml Coke";
    }

    @Override
    public String size() {
        return "Small size";
    }
}
