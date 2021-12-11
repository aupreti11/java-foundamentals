package com.exceptionhandling; 

// this is the custom class exception votingexception

class VotingException extends Exception {
	
	public VotingException(String s) {
		super(s);
	}
}

public class ThrowEx {
	
	static void throwException(int age) {
		//static void throwException(int age) throws VotingException { // this is the custom exception
	
			if(age < 18) {
			throw new ArithmeticException("not eligible to vote");
			// if we wanna call the custom votingexception
			//throw new VotingException("not eligible");
			
			}else {
			System.out.println("eligible to vote");
			
			}
	}

	public static void main(String[] args) {
		
		// throw keyword is used to explicitly throw the exception.
		// it is used whenever we want to throw the exception explicitly.
		// we can throw check(compiletime)and unchecked (runtime)exception with the help of throw keyword.
		// is used to throw the custom exception like the exception created by the developer.
		// throws keyword is used to declare the exception
		// throw keyword is used within the method and doesnot support multiple Exception whereas throws support multiple exceptions
		
		try {
		throwException(14);
		}catch (Exception e) {
			System.out.println(e);
		}
		
		System.out.println("amrit");
	}

}
