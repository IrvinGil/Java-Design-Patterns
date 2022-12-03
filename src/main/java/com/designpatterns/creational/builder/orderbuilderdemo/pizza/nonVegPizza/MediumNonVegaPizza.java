package com.designpatterns.creational.builder.orderbuilderdemo.pizza.nonVegPizza;

import com.designpatterns.creational.builder.orderbuilderdemo.pizza.NonVegPizza;

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
