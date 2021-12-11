package com.methodoverriding;

// in method overriding only the immplementation in the method is different
// all other are same in parent class method and child class method.

class Arithmetic1 {
	
	int x = 3;
	int y =2;
	
	public void addition(int x, int y) {
		System.out.println("addition of x and y is: " +(x+y));
	}
}
	
	class Operation extends Arithmetic1{
		
		public void addition(int x , int y) {
			System.out.println("The addition of int x and int y is " +(x+y));
		}
}
	
	public class Arithmetic {

	public static void main(String[] args) {
		
		Operation obj = new Operation();
		obj.addition(2, 3);

	}

}
