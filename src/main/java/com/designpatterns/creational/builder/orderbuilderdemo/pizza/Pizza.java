package com.designpatterns.creational.builder.orderbuilderdemo.pizza;

import com.designpatterns.creational.builder.orderbuilderdemo.Item;

public abstract class Pizza implements Item {
    @Override
    public abstract float price();
}
