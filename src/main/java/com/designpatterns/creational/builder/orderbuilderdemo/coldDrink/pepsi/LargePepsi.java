package com.designpatterns.creational.builder.orderbuilderdemo.coldDrink.pepsi;

import com.designpatterns.creational.builder.orderbuilderdemo.coldDrink.Pepsi;

public class LargePepsi extends Pepsi {
    @Override
    public float price() {
        return 50f;
    }

    @Override
    public String name() {
        return "750 ml Pepsi";
    }

    @Override
    public String size() {
        return "Large size";
    }
}
