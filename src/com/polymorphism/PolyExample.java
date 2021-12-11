package com.polymorphism;

class Arithmetic {
	
	void add(int x, int y) {
		System.out.println("Addition of int x and int y is: " +(x+y));
	}
	
	void add(int x, double y) {
		System.out.println("Addition of int x and double y is: "+(x+y));
	}
	
	void add(int x, int y, int z) {
		System.out.println("Addition of int x, y and z is: "+(x+y+z));
	}
	
	void add(double x, double y) {
		System.out.println("Addition of double x and double y is: "+(x+y));
	}
	
	void add(double x , int y) {
		System.out.println("Addition of double x and int y is: "+(x+y));
	}
	
	// this is called method overloading also called as compile-time polymorphism.
}

public class PolyExample {

	public static void main(String[] args) {
		
		Arithmetic obj = new Arithmetic();
		obj.add(2, 3);
		obj.add(2, 3, 4);
		obj.add(2, 2.3);
		obj.add(2.3, 4);
		obj.add(2.3, 1.2);
	}
}
