package basic.java;

public class FinalKeyword1 {
	
	static final int i = 8;

	public static void main(String[] args) {
		
		// final is a non-access modifier applicable only to variables, method and class.
		// final variables -------> to create constant variables.
		// final method -----------> to prevent method overriding
		// final class ------------> to prevent inheritance.
		
		// when a variable is declared with final keyword, its value cannot be changed. its a constant value
		// which also means we must initialize a final variable.
		//
		
		// i =9; // ---------> this gives compile time error since the value of i cannot be changed.
		// Final keyword must be used at the time of declaration or at the constructor
		
		System.out.println(i);
	}

}
