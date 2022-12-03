package com.designpatterns.creational.builder.orderbuilderdemo.coldDrink.pepsi;

import com.designpatterns.creational.builder.orderbuilderdemo.coldDrink.Pepsi;

public class MediumPepsi extends Pepsi {
    @Override
    public float price() {
        return 35f;
    }

    @Override
    public String name() {
        return "500 ml Pepsi";
    }

    @Override
    public String size() {
        return "Medium size";
    }
}
