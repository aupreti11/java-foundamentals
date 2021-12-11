package com.exceptionhandling;

class Customexception extends Exception{
	
	public Customexception(String s) {
		super(s);
	}
}

public class CustomExceptionEx1 {
	
	static void exception(int age) throws Customexception {

		if(age < 18) {
			System.out.println("not eligible to trade");
		}else 
			System.out.println("eligible to trade");
	}
	public static void main(String[] args) throws Customexception {
		
		try {
		exception(12);
		}catch(Exception e) {
			System.out.println(e);
		}
		
		try {
		int array[] = new int[4];
		array[5] = 90;
		System.out.println(array[5]);
		
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}