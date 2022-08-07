package com.designPatterns.creationalPatterns.builderPattern.orderBuilderDemo.pizza;

import com.designPatterns.creationalPatterns.builderPattern.orderBuilderDemo.Item;

public abstract class Pizza implements Item {
    @Override
    public abstract float price();
}
