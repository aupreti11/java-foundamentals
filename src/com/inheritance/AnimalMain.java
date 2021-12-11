package com.inheritance;

public class AnimalMain extends Animal{
	
	static int legs=4;

	public static void main(String[] args) {
		
	Animal a = new Animal();
	String str = a.name;
	Dog d = new Dog();
	a.walk();
	a.run();
	d.bark();
	System.out.println(""+str+" has  "+legs+" legs");
		
	}

}
