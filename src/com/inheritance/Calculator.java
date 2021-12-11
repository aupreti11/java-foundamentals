package com.inheritance;

public class Calculator {
	
	int x;
	int y;

	
	public void sum() {
		int s = x +y;
		System.out.println("sum of x and y = " + s);
	}
	
	public void sub() {
		int sub = x - y;
		System.out.println("subtraction of x and y =  " + sub);
	}
}
