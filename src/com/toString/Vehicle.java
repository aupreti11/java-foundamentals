package com.toString;

public class Vehicle {


	String make;
	String model;
	int year;
	int price;
	
	public Vehicle(String make , String model, int year, int price) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Vehicle [make=" + make + ", model=" + model + ", year=" + year + ", price=" + price + "]";
	}

}
