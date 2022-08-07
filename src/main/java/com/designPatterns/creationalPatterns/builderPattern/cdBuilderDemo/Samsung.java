package com.designPatterns.creationalPatterns.builderPattern.cdBuilderDemo;

public class Samsung extends Company{
    @Override
    public String pack() {
        return "Samsung CD";
    }

    @Override
    public int price() {
        return 15;
    }
}
