package com.designPatterns.creationalPatterns.builderPattern.orderBuilderDemo.coldDrink.pepsi;

import com.designPatterns.creationalPatterns.builderPattern.orderBuilderDemo.coldDrink.Pepsi;

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
