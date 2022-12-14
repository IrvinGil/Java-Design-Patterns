package com.designpatterns.creational.builder.orderbuilderdemo.coldDrink.pepsi;

import com.designpatterns.creational.builder.orderbuilderdemo.coldDrink.Pepsi;

public class SmallPepsi extends Pepsi {
    @Override
    public float price() {
        return 25f;
    }

    @Override
    public String name() {
        return "300 ml Pepsi";
    }

    @Override
    public String size() {
        return "Small size";
    }
}
