package com.designPatterns.creationalPatterns.builderPattern.orderBuilderDemo;

public class ChoiceInterfaceClass {
    protected void displayPizzaMenu() {
        System.out.println("Enter the choice of Pizza");
        System.out.println("============================");
        System.out.println("        1. Veg-Pizza       ");
        System.out.println("        2. Non-Veg Pizza   ");
        System.out.println("        3. Exit            ");
        System.out.println("============================");
    }

    protected void displayVegPizzaMenu() {
        System.out.println("You ordered Veg Pizza");
        System.out.println("\n\n");
        System.out.println(" Enter the types of Veg-Pizza ");
        System.out.println("------------------------------");
        System.out.println("        1.Cheese Pizza        ");
        System.out.println("        2.Onion Pizza        ");
        System.out.println("        3.Masala Pizza        ");
        System.out.println("        4.Exit            ");
        System.out.println("------------------------------");
    }

    protected void displayCheesePizzaMenu() {
        System.out.println("You ordered Cheese Pizza");
        System.out.println("Enter the cheese pizza size");
        System.out.println("------------------------------------");
        System.out.println("    1. Small Cheese Pizza ");
        System.out.println("    2. Medium Cheese Pizza ");
        System.out.println("    3. Large Cheese Pizza ");
        System.out.println("    4. Extra-Large Cheese Pizza ");
        System.out.println("------------------------------------");
    }

    protected void displayOnionPizzaMenu() {
        System.out.println("You ordered Onion Pizza");
        System.out.println("Enter the Onion pizza size");
        System.out.println("----------------------------------");
        System.out.println("    1. Small Onion Pizza ");
        System.out.println("    2. Medium Onion Pizza ");
        System.out.println("    3. Large Onion Pizza ");
        System.out.println("    4. Extra-Large Onion Pizza ");
        System.out.println("----------------------------------");
    }

    protected void displayMasalaPizzaMenu() {
        System.out.println("You ordered Masala Pizza");
        System.out.println("Enter the Masala pizza size");
        System.out.println("------------------------------------");
        System.out.println("    1. Small Masala Pizza ");
        System.out.println("    2. Medium Masala Pizza ");
        System.out.println("    3. Large Masala Pizza ");
        System.out.println("    4. Extra-Large Masala Pizza ");
        System.out.println("------------------------------------");
    }

    protected void displayNonVegPizzaMenu() {
        System.out.println("You ordered Non-Veg Pizza");
        System.out.println("\n\n");
        System.out.println("Enter the Non-Veg pizza size");
        System.out.println("------------------------------------");
        System.out.println("    1. Small Non-Veg  Pizza ");
        System.out.println("    2. Medium Non-Veg  Pizza ");
        System.out.println("    3. Large Non-Veg  Pizza ");
        System.out.println("    4. Extra-Large Non-Veg  Pizza ");
        System.out.println("------------------------------------");
    }

    protected void displayColdDrinkMenu() {
        System.out.println(" Enter the choice of ColdDrink ");
        System.out.println("============================");
        System.out.println("        1. Pepsi            ");
        System.out.println("        2. Coke             ");
        System.out.println("        3. Exit             ");
        System.out.println("============================");
    }

    protected void displayPepsiMenu() {
        System.out.println("You ordered Pepsi ");
        System.out.println("Enter the  Pepsi Size ");
        System.out.println("------------------------");
        System.out.println("    1. Small Pepsi ");
        System.out.println("    2. Medium Pepsi ");
        System.out.println("    3. Large Pepsi ");
        System.out.println("------------------------");
    }

    protected void displayCokeMenu() {
        System.out.println("You ordered Coke");
        System.out.println("Enter the Coke Size");
        System.out.println("------------------------");
        System.out.println("    1. Small Coke ");
        System.out.println("    2. Medium Coke  ");
        System.out.println("    3. Large Coke  ");
        System.out.println("    4. Extra-Large Coke ");
        System.out.println("------------------------");

    }


}
