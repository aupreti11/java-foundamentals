package basic.java;

class Bank{
	final int rateOfInterest ;  // --->  use final keyword at the time of declaration.
	
	Bank(){
		rateOfInterest = 7;   // ---> two place to use the final keyword inside the constructor
	}
	
	final void display() {
		System.out.println("RateOfInterest " +rateOfInterest);
	}
}

public class FinalKeywordDemo extends Bank { // --> gives error if we make the class Bank as final since the final class cannot 
											// cannnot be inherited.
	
	 //void display() {  // ---> Final method cannot be overriden since the parent class display method is final
		

	public static void main(String[] args) {
		

	}

}
