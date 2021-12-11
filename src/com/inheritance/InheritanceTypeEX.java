package com.inheritance;

class Bank1 {
	
	float amt;
	float principle = 4000;
	
	void salary() {
		
		System.out.println("bank method is invoked");
	}
	void loan() {
		System.out.println("loan method from bank");
	}
}

class SBI1 extends Bank1{
	
	void salary() {
		System.out.println("SBI Bank is invoked");
	}
	void loan() {
		System.out.println("loan method from SBI bank");
	}
}

class Nabil extends SBI1{   // ----> Multilevel inheritance
	void studentloan() {
		System.out.println("nabil bank's student loan invoked");
	}
}

public class InheritanceTypeEX {

	public static void main(String[] args) {
		
		//SBI obj = new SBI();
		Nabil obj1 = new Nabil();
		obj1.studentloan();
		//obj.salary();
		//obj.loan();
	}
}
