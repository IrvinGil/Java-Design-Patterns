package com.designpatterns.structural.compositepattern;

public class Accountant implements Employee {

	private final int id;
	private final String name;
	private final double salary;

	public Accountant(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public int getId() {
		return 0;
	}

	@Override
	public String getName() {
		return null;
	}

	@Override
	public double getSalary() {
		return 0;
	}

	@Override
	public void print() {

	}

	@Override
	public void add(Employee employee) {

	}

	@Override
	public void remove(Employee employee) {

	}

	@Override
	public Employee getChild(int index) {
		return null;
	}
}
