package com.methodoverriding;

public class Mobile {
	
	int price;
	String color;
	String model;
	
	public void display() {
		
		System.out.println("this is from the mobile class");
	}
}

// same display method is called in all of the class, samsung and iphone class and has 
// different things to return which is called method overriding.
// also called as polymorphism.