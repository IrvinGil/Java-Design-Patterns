package com.designPatterns.creationalPatterns.builderPattern.orderBuilderDemo;

import java.io.IOException;

public class OrderBuilderDemo {
    public static void main(String[] args) throws IOException {
        //TODO: add code application logic here
        OrderBuilder builder = new OrderBuilder();
        OrderedItems orderedItems = builder.preparePizza();

        orderedItems.showItems();
        System.out.println("\n");
        System.out.println("Total Cost: " + orderedItems.getCost());

    }
}
