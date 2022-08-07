package com.designPatterns.creationalPatterns.builderPattern.orderBuilderDemo.coldDrink;

import com.designPatterns.creationalPatterns.builderPattern.orderBuilderDemo.coldDrink.ColdDrink;

public abstract class Pepsi extends ColdDrink {
    @Override
    public abstract float price();

    @Override
    public abstract String name();

    @Override
    public abstract String size();
}
