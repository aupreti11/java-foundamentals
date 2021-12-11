package com.interfaceExample;

/* all the abstract method of interface must be implemented.
 * all the method inside interface is abstract method so 100% abstraction is achieved through interface
 * we are extending the classes but implementing the interfaces.
 * we cannot create an instance of an interface
 * while implementing the abstract method the method in implementing class must be public because 
 * every method inside interface is public so we cannot reduce the visibility of the interface method.
 * inside any class.
 */

interface A{
	
	abstract void Amethod(); 
	default void Mmethod() {
		System.out.println("default mymethod");
	}
	
	static void Smethod() {
		System.out.println("static smethod.");
	}
}

class InterfaceImpl implements A{

	public void Amethod() {  // --> this abstract method must be public since this is the implementation of an interface.
		System.out.println("implementaiton method.");
	}	
}


public class InterfaceExample {

	public static void main(String[] args) {
		
		InterfaceImpl obj = new InterfaceImpl();
		obj.Amethod();
		obj.Mmethod();  //--> we cannot access the above static method because static method is the secured  
						// --> method and only be accessible by the interface not by the interface implementation.
		A.Smethod();
	}

}
