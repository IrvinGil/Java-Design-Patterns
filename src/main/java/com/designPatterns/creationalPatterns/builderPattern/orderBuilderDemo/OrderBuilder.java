package com.designPatterns.creationalPatterns.builderPattern.orderBuilderDemo;

import com.designPatterns.creationalPatterns.builderPattern.orderBuilderDemo.coldDrink.coke.LargeCoke;
import com.designPatterns.creationalPatterns.builderPattern.orderBuilderDemo.coldDrink.coke.MediumCoke;
import com.designPatterns.creationalPatterns.builderPattern.orderBuilderDemo.coldDrink.coke.SmallCoke;
import com.designPatterns.creationalPatterns.builderPattern.orderBuilderDemo.coldDrink.pepsi.LargePepsi;
import com.designPatterns.creationalPatterns.builderPattern.orderBuilderDemo.coldDrink.pepsi.MediumPepsi;
import com.designPatterns.creationalPatterns.builderPattern.orderBuilderDemo.coldDrink.pepsi.SmallPepsi;
import com.designPatterns.creationalPatterns.builderPattern.orderBuilderDemo.pizza.nonVegPizza.ExtraLargeNonVegPizza;
import com.designPatterns.creationalPatterns.builderPattern.orderBuilderDemo.pizza.nonVegPizza.LargeNonVegPizza;
import com.designPatterns.creationalPatterns.builderPattern.orderBuilderDemo.pizza.nonVegPizza.MediumNonVegaPizza;
import com.designPatterns.creationalPatterns.builderPattern.orderBuilderDemo.pizza.nonVegPizza.SmallNonVegPizza;
import com.designPatterns.creationalPatterns.builderPattern.orderBuilderDemo.pizza.vegPizza.cheesePizza.ExtraLargeCheesePizza;
import com.designPatterns.creationalPatterns.builderPattern.orderBuilderDemo.pizza.vegPizza.cheesePizza.LargeCheesePizza;
import com.designPatterns.creationalPatterns.builderPattern.orderBuilderDemo.pizza.vegPizza.cheesePizza.MediumCheesePizza;
import com.designPatterns.creationalPatterns.builderPattern.orderBuilderDemo.pizza.vegPizza.cheesePizza.SmallCheesePizza;
import com.designPatterns.creationalPatterns.builderPattern.orderBuilderDemo.pizza.vegPizza.masalaPizza.ExtraLargeMasalaPizza;
import com.designPatterns.creationalPatterns.builderPattern.orderBuilderDemo.pizza.vegPizza.masalaPizza.LargeMasalaPizza;
import com.designPatterns.creationalPatterns.builderPattern.orderBuilderDemo.pizza.vegPizza.masalaPizza.MediumMasalaPizza;
import com.designPatterns.creationalPatterns.builderPattern.orderBuilderDemo.pizza.vegPizza.masalaPizza.SmallMasalaPizza;
import com.designPatterns.creationalPatterns.builderPattern.orderBuilderDemo.pizza.vegPizza.onionPizza.ExtraLargeOnionPizza;
import com.designPatterns.creationalPatterns.builderPattern.orderBuilderDemo.pizza.vegPizza.onionPizza.LargeOnionPizza;
import com.designPatterns.creationalPatterns.builderPattern.orderBuilderDemo.pizza.vegPizza.onionPizza.MediumOnionPizza;
import com.designPatterns.creationalPatterns.builderPattern.orderBuilderDemo.pizza.vegPizza.onionPizza.SmallOnionPizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderBuilder {

    public OrderedItems preparePizza() throws IOException {
        OrderedItems orderItems = new OrderedItems();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        ChoiceInterfaceClass displayInterface = new ChoiceInterfaceClass();

        displayInterface.displayPizzaMenu();

        int pizzaAndColdDrinkChoice = Integer.parseInt(bufferedReader.readLine());

        switch (pizzaAndColdDrinkChoice) {
            case 1:
                displayInterface.displayVegPizzaMenu();
                int vegPizzaChoice = Integer.parseInt(bufferedReader.readLine());

                switch (vegPizzaChoice) {
                    case 1:
                        displayInterface.displayCheesePizzaMenu();
                        int cheesePizzaSize = Integer.parseInt(bufferedReader.readLine());
                        switch (cheesePizzaSize) {
                            case 1:
                                orderItems.addItems(new SmallCheesePizza());
                                break;
                            case 2:
                                orderItems.addItems(new MediumCheesePizza());
                                break;
                            case 3:
                                orderItems.addItems(new LargeCheesePizza());
                                break;
                            case 4:
                                orderItems.addItems(new ExtraLargeCheesePizza());
                                break;
                        }
                        break;
                    case 2:
                        displayInterface.displayOnionPizzaMenu();
                        int onionPizzaSize = Integer.parseInt(bufferedReader.readLine());

                        switch (onionPizzaSize) {
                            case 1:
                                orderItems.addItems(new SmallOnionPizza());
                                break;
                            case 2:
                                orderItems.addItems(new MediumOnionPizza());
                                break;
                            case 3:
                                orderItems.addItems(new LargeOnionPizza());
                                break;
                            case 4:
                                orderItems.addItems(new ExtraLargeOnionPizza());
                                break;
                        }
                        break;
                    case 3:
                        displayInterface.displayMasalaPizzaMenu();
                        int masalaPizzaSize = Integer.parseInt(bufferedReader.readLine());
                        switch (masalaPizzaSize) {
                            case 1:
                                orderItems.addItems(new SmallMasalaPizza());
                                break;
                            case 2:
                                orderItems.addItems(new MediumMasalaPizza());
                                break;
                            case 3:
                                orderItems.addItems(new LargeMasalaPizza());
                                break;
                            case 4:
                                orderItems.addItems(new ExtraLargeMasalaPizza());
                                break;
                        }

                        break;
                }/** Veg-pizza choice completed*/
                break;
            case 2:
                displayInterface.displayNonVegPizzaMenu();
                int nonVegPizzaSize = Integer.parseInt(bufferedReader.readLine());
                switch (nonVegPizzaSize) {
                    case 1:
                        orderItems.addItems(new SmallNonVegPizza());
                        break;
                    case 2:
                        orderItems.addItems(new MediumNonVegaPizza());
                        break;
                    case 3:
                        orderItems.addItems(new LargeNonVegPizza());
                        break;
                    case 4:
                        orderItems.addItems(new ExtraLargeNonVegPizza());
                        break;


                }
                break;
            default: {
                break;
            }
        } /**end of main switch*/

        displayInterface.displayColdDrinkMenu();
        int coldDrink = Integer.parseInt(bufferedReader.readLine());
        switch (coldDrink) {
            case 1:
                displayInterface.displayPepsiMenu();
                int pepsiSize = Integer.parseInt(bufferedReader.readLine());
                switch (pepsiSize) {
                    case 1:
                        orderItems.addItems(new SmallPepsi());
                        break;
                    case 2:
                        orderItems.addItems(new MediumPepsi());
                        break;
                    case 3:
                        orderItems.addItems(new LargePepsi());
                        break;
                }
                break;
            case 2:
                displayInterface.displayCokeMenu();
                int cokeSize = Integer.parseInt(bufferedReader.readLine());
                switch (cokeSize) {
                    case 1:
                        orderItems.addItems(new SmallCoke());
                        break;
                    case 2:
                        orderItems.addItems(new MediumCoke());
                        break;
                    case 3:
                        orderItems.addItems(new LargeCoke());
                        break;

                }
                break;
            default: {
                break;
            }
        }

        return orderItems;
    }

}
