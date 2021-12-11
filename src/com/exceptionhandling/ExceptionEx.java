package com.exceptionhandling;

public class ExceptionEx {
	
	// check exception and unchecked exception
	// Exception and error are different, exception can be handled while errors cannot.
	// the block where we think has exception has, we have to write the try block and catch that exception in catch block
	// try block can be without catch but has to be either (try,finally) , (try,catch,catch) or try,catch,finally
	// if we dont have the catch block the code after the try block will be executed since we didn't catch the exception
	// we can multiple catch for one try block
	// finally is always executed no matter what
	// if there is two exceptions we have to write two try and catch block for each of the exception
	// one try and catch will handle only one exception
	// Arithmetic, io,SQL, NullPointer are the examples of exception.
	// if we don't give the appropriate exception in the catch block no matter how many exception we write its not going to be handled
	// so better practice is to write Exception e a common one.
	// to handle multiple exception we have to write try inside the try like as below.

	public static void main(String[] args) {
		
		try {
				try {
					int i = 20;
					System.out.println(i/0);
				}catch(Exception e) {
					System.out.println(e);
				}
				
				try {
					String str = null;
					System.out.println(str.length());		
				}catch(Exception e) {
					System.out.println(e);
				}
				
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			System.out.println("this is always executed block");
		}
		System.out.println("amrit");
		
		try {
			int arry[] = new int[4];
			arry[5] =89;	
		} catch(ArithmeticException e) {System.out.println(e);}
		catch(NullPointerException e) {System.out.println(e);}
		catch(ArrayIndexOutOfBoundsException e) {System.out.println(e);}
		
		System.out.println("hi amrit");
	}
}
