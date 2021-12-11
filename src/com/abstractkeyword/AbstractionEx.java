package com.abstractkeyword;

abstract class Myclass{
	void display() {
		System.out.println("display method");
	}
	
	abstract void print();   // --> abstract method does not specify body.  since one display method is not abstract 
}							// we acheive 50 % abstraction with one abstract method.

public class AbstractionEx extends Myclass {
	
	/* Abstraction is a process of hiding the implementation details and showing only the 
	 * functionality to the user.
	 * Abstraction can be achieved by abstract class (0 - 100% ) and interface (100%)
	 * we can not create an instance of an abstract class i.e. object cannot be created.
	 * Abstract methods must be implemented in child class
	 */
	
	void print() {
		System.out.println("print method");  // --> abstract method body is specified here in child class
	}

	public static void main(String[] args) {
		
		AbstractionEx a = new AbstractionEx();
		a.display();
		a.print();

	}

}
