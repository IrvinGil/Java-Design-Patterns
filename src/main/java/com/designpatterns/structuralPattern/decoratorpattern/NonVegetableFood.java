package com.designpatterns.structuralPattern.decoratorpattern;

public class NonVegetableFood extends FoodDecorator {

	public NonVegetableFood(Food newFood) {
		super(newFood);
	}

	@Override
	public String prepareFood() {
		return super.prepareFood() + " with Roasted Chicken and Chicken Curry.";
	}

	@Override
	public double foodPrice() {
		return (super.foodPrice() + 150.0);
	}
}

