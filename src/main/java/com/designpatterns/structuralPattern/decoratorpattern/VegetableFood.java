package com.designpatterns.structuralPattern.decoratorpattern;

public class VegetableFood implements Food{

	@Override
	public String prepareFood() {
		return "Vegetable Food";
	}

	@Override
	public double foodPrice() {
		return 50.0;
	}
}
