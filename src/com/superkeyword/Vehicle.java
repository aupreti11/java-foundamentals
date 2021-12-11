package com.superkeyword;

/* super keyword always calls the immediate parent class method or constructor or attributes.
 	super keyword is the statement to write in the method.
 	super keyword is used to called the method of super class in the child class.
 	super keyword cannot be used together with this keyword because this keyword is also the first statement
 	to be written.
 */

class VehicleEx{
	String model = "X model";
	String make = "BNW";
	
	 VehicleEx() {
		 System.out.println("VehicleEx Constructor");
	}
	
	 void myDisplay() {
		System.out.println("VehicleEx myDisplay method");
	}
}

class Car extends VehicleEx{
	
	String model = "accord";
	String make = "honda";
	
	Car(){
		
		super();  // ---> this calls the immediate parent class constructor i.e. VehicleEx Constructor
		System.out.println("Car Constructor");
	}
	void myDisplay() {
		super.myDisplay(); // ---> this calls the parent class VehicleEx myDisplay method.
		System.out.println("Car myDisplay method and model is" + super.model); //--> this calls the VehicleEx model.
	}
}

class BMW extends Car{
	String model = "abc";
	String make = "Mercedes";
	
	BMW(){
		super(); // ---> this calls the immediate parent class constructor i.e. Car constructor
		System.out.println("BMW Constructor");
	}
	void myDisplay() {
		super.myDisplay();   // ---> this super calls the immediate parent class myDisplay method.i.e. car class method.
		System.out.println("BMW  myDisplay method and model is:" +super.make); // --> this calls Car make.
	}
}

public class Vehicle {

	public static void main(String[] args) {
	
		BMW b = new BMW();
		b.myDisplay();

	}

}
