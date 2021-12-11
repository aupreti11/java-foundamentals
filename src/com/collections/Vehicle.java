package com.collections;

public class Vehicle implements Comparable<Vehicle> {
	
	String model;
	String make;
	int price;
	
	public Vehicle() {
		
	}
	
	public Vehicle(String model, String make, int price) {
		this.model= model;
		this.make=make;
		this.price=price;
	}
	
	public String toString() {
		return "Vehicle details [model= " +model+ ", make= " +make+ ", price= " +price+"]"; 
	}
	
	
	
	@Override
	public int compareTo(Vehicle o) {
		
		return (this.model).compareTo(o.model);
	}
	
	public String getMake() {
		return make;
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
}