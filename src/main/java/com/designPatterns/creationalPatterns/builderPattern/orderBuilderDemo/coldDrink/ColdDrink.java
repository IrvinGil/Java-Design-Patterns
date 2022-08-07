package com.designPatterns.creationalPatterns.builderPattern.orderBuilderDemo.coldDrink;

import com.designPatterns.creationalPatterns.builderPattern.orderBuilderDemo.Item;

public abstract class ColdDrink implements Item {
    @Override
    public abstract float price();
}
