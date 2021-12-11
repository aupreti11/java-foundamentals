package com.exceptionhandling;

class LicenseException extends Exception{
	
	public LicenseException(String s) {
		super(s);
	}
}

public class CustomExceptionEx {
	
	static void ThrowException(int age) throws LicenseException {
		
		if(age < 15) {
			throw new LicenseException("age must be greater than 16");
		}else {
			System.out.println("congratulations you are eligible");
		}
	}

	public static void main(String[] args) throws LicenseException {
		
		try {
		ThrowException(13);
		}catch(Exception e) {
			System.out.println(e);
		}
		
		try {
			
			int array[] = new int[6];
			array[7]=90;
			System.out.println(array[7]); // this gives ArrayIndexOutOfBoundsException
		
		}catch(ArithmeticException e) {
			System.out.println(e);
			
		}catch(Exception e) {System.out.println(e);}
		System.out.println("hi this is printed now");
		
		
	}
}
