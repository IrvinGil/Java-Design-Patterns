package com.designpatterns.structural.decoratorpattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DecoratorPatternCustomerMain {



	public static void main(String args[]) throws NumberFormatException, IOException {
		int choice;
		do {
			System.out.print("========= Food Menu ============ \n");
			System.out.print("            1. Vegetarian Food.   \n");
			System.out.print("            2. Non-Vegetarian Food.\n");
			System.out.print("            3. Chineese Food.         \n");
			System.out.print("            4. Exit                        \n");
			System.out.print("Enter your choice: ");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			choice = Integer.parseInt(br.readLine());
			switch (choice) {
				case 1: {
					VegetableFood vegetableFood = new VegetableFood();
					System.out.println(vegetableFood.prepareFood());
					System.out.println(vegetableFood.foodPrice());
				}
				break;

				case 2: {
					Food food1 = new NonVegetableFood(new VegetableFood());
					System.out.println(food1.prepareFood());
					System.out.println(food1.foodPrice());
				}
				break;
				case 3: {
					Food food2 = new ChineseFood(new VegetableFood());

					System.out.println(food2.prepareFood());
					System.out.println(food2.foodPrice());
				}
				break;

				default: {
					System.out.println("Other than these no food available");
				}
				return;
			}//end of switch

		} while (choice != 4);
	}
}
