package basic.java;

import java.util.Scanner;

public class MethodConcept {
	
	// method is a block of code which runs only when called.
	//  we can pass parameter into the method.
	// method are used to perform certain actions / specific operation when called on main method.
	// a method must be declared within the class
	// it is defined with the name of the method followed by the parenthesis.()
	
	int num;
	int num1;
	
	public int add() {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		num = scan.nextInt();
		System.out.print("\nEnter the second number: ");
		num1  = scan.nextInt();
		scan.close();
		
		int sum = num + num1;
		return sum;
	
	}
	
	public int subtract() {
		
		int sub = num - num1;
		return sub;
	}
	
	public int multiply() {
		int mul = num * num1;
		return mul;
	}
	
	public int division() {
		int div = num / num1;
		return div;
	}
	
	public static void main(String[] args) {


		MethodConcept x = new MethodConcept();
		int addresult = x.add();
		int subresult = x.subtract();
		int mulresult = x.multiply();
		int divresult = x.division();
		System.out.println("\n==============");
		System.out.println("\nsum of two numbers " + " = " +addresult);
	
		System.out.println("subtract of two numbers" + " = " +subresult);
		System.out.println("multiplication of two numbers" + " = " +mulresult);
		System.out.println("division of two numbers" + " = " + divresult);
		
	}

}
