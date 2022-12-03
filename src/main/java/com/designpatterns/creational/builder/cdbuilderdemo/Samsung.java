package com.designpatterns.creational.builder.cdbuilderdemo;

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
