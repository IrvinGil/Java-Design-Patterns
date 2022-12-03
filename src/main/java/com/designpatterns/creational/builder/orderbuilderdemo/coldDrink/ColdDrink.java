package com.designpatterns.creational.builder.orderbuilderdemo.coldDrink;

import com.designpatterns.creational.builder.orderbuilderdemo.Item;

public abstract class ColdDrink implements Item {
    @Override
    public abstract float price();
}
