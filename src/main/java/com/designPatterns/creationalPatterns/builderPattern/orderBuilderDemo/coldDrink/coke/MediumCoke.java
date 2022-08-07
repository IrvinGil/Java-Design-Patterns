package com.designPatterns.creationalPatterns.builderPattern.orderBuilderDemo.coldDrink.coke;

import com.designPatterns.creationalPatterns.builderPattern.orderBuilderDemo.coldDrink.Coke;

public class MediumCoke extends Coke {
    @Override
    public float price() {
        return 35f;
    }

    @Override
    public String name() {
        return "500 ml Coke";
    }

    @Override
    public String size() {
        return "Medium size";
    }
}
