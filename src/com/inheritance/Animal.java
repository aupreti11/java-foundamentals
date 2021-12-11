package com.inheritance;

public class Animal {
	
	// inheritance is a mechanism which allows child/ sub class to inherit attributes and behaviour of the super class or the parent class
	// Features goes from parent to the child meaning it is unidirectional.
	// advantages of inheritance is the code reusability.
	
	String name = "maxy";
	int age = 5;
	
	public void walk() {
		System.out.println(""+name+" can walk");
		
	}
	
	public void run() {
		System.out.println("maxy is " +age+ " years old");
	}
}

