package com.designPatterns.creationalPatterns.builderPattern.cdBuilderDemo;

public class Sony extends Company{
    @Override
    public String pack() {
        return "Sony CD";
    }

    @Override
    public int price() {
        return 20;
    }
}
