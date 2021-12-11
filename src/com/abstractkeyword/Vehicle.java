package com.abstractkeyword;

public abstract class Vehicle {
	
		// abstract keyword can be used in class and method not on variables.
		// abstract method does not have a body definition.
		// if a class is abstract, it cannot be instantiated i.e. object cannot be created.
		// we cannot use abstract keyword with final, static and private.
		// abstract method cannot be synchronized.
		// abstract class can contains constructor and static method.
		// if a class extends abstract class, it must also implement at least one of the abstract method.
		// abstract keyword is used to hide the mechanism (hiding redundant things from the user)
		// it is used to acheive abstraction which is one of the pillar of OOPs
		// It is a non-access modifier which is used to create abstract class and method.

		public abstract void run();  // no body of the abstract method.
}


