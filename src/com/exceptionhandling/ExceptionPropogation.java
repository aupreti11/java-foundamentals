package com.exceptionhandling;

import java.io.IOException;

public class ExceptionPropogation {
	
	void x() throws IOException {
		//int i = 20/0;  //this is unchecked exception
		throw new IOException("device not found");// whenever we are propagating the check exception we need to use throws keyword
	}
	void y() throws IOException {
		x();
	}
	void z() {  // we are calling x() method here.
		try {
			y();	
		}catch(Exception ex) {
			System.out.println(ex);
		}	
	}

	public static void main(String[] args) {
		// exception propagation is when error occurs in one method and handled in other method.
		
		ExceptionPropogation ep = new ExceptionPropogation();
		ep.z();
	}
}
