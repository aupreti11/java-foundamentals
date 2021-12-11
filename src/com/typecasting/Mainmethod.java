package com.typecasting;



public class Mainmethod {
	
	// typecasting deals with the conversion of one data type to another datatype implicitly or explicitly

	public static void main(String[] args) {
		
		Animal obj = new Dog();  // this is upcasting, meaning type of typecasting of a child object to a parent object.
		obj.run();
		
		// upcasting gives the flexibility to access the parent class members or the methods that are overrident.
		// to access the overrident methods( methods in both parent and child class) of child class.
		// upcasting can be done implicity.
		
	
		// Trying to Downcasting Implicitly
        // Dog d = new Animal(); - > compile time error
		
		Dog d =(Dog)obj;  // explicitly downcasting
		
		d.id = 2;
		System.out.println(d.id);
		d.bark();
	}
	
}
