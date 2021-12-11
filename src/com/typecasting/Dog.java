package com.typecasting;

public class Dog extends Animal {
	
	int id;
	
	
	public void run() {  // this is the overrident method since the class animal has also the same method.
		System.out.println("dog can bark ");
	}
	public void bark() {
		System.out.println("dog can bark");
	}

}
