package com.designPatterns.creationalPatterns.builderPattern.orderBuilderDemo.coldDrink.coke;

import com.designPatterns.creationalPatterns.builderPattern.orderBuilderDemo.coldDrink.Coke;

public class LargeCoke extends Coke {

    @Override
    public float price() {
        return 50f;
    }

    @Override
    public String name() {
        return "750 ml Coke";
    }

    @Override
    public String size() {
        return "Large size";
    }
}
