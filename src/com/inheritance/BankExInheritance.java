package com.inheritance;

class Bank{
	
	double amount = 5000;
	int time = 3;
	
	void exRate() {
		System.out.println("Exchange rate must be same for all the banks");
	}
	
	void getInterest() {
		System.out.println("Interest must be as low as possible");
	}
}

class SBI extends Bank{
	double rate = 3.3;
	void getSInterest() {
		double interest = (amount * time * rate) /100;
		System.out.println("SBI bank interest rate is: " +interest);
	}
	
}

class ICICI extends Bank{  //--------> 
	double rate = 2.3;
	void getIInterest() {
		double interest = (amount * time * rate) / 100;
		System.out.println("ICICI Banks interest rate is :" +interest);
	}
}

class PNB extends Bank{  // -------> multiple child of one parent class is Hierarchical inheritance
	double rate = 5.3;
	void getPInterest() {
		double interest = (amount * time * rate) / 100;
		System.out.println("PNB Banks interest rate is :" +interest);
	}
}

class BOA extends ICICI{   // -------> Multilevel inheritance
	double rate = 1.3;
	void getBInterest() {
		double interest = (amount * time * rate) / 100;
		System.out.println("BOA Banks interest rate is :" +interest);
	}
}

public class BankExInheritance {

	public static void main(String[] args) {
		
		// Creating an object from the above class.
		
		SBI obj = new SBI();
		obj.getSInterest();
		BOA obj1 = new BOA();
		obj1.getBInterest();
		obj1.getIInterest();
		obj1.getInterest();
	}

}
