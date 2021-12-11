package com.collections;

public class Car implements Comparable<Car> {
	
	String model;
	String make;
	int price;
	
	public Car() {
		
	}
	public Car(String model, String make, int price) {
		this.model = model;
		this.make= make;
		this.price = price;
	}
	
	public String toString() {
		return "Car details [model= " +model+ " ,make = " +make+ ", price = " +price+ "]"; 
	}
	
	@Override
	public int compareTo(Car o) {
		
		return (this.model).compareTo(o.model);
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}


	

}
