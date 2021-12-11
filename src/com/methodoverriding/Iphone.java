package com.methodoverriding;

public class Iphone extends Mobile {
	
	boolean foldable = false;
	
	public void display() {
		
		System.out.println("this is from the iphone class");
		System.out.println("price of the iphone is = " +price);
	}
	
	public void affordable() {
		
		System.out.println("iphone is not affordable");
		
	}

}
