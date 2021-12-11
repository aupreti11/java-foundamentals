package basic.java;

public class OperatorsConcept {

	public static void main(String[] args) {
		
		// +, - , * /, % is an arithmetic operator 
		int i = 0;
		int j =1;
		int sum = i +j;
		System.out.println(sum);
		
		System.out.println("*****");
		
		int k = 90;
		int w= 3;
		int div = k /w;
		System.out.println(div);
		
		
		// = is an assignment operator
		
		System.out.println("*****");
		int x= 10;
		x+= 5;  // this is x = x + 5 i.e. 15
		System.out.println(x);
		x-= 3;  // this is x = x -3 i.e. 15 - 3.
		System.out.println(x);
		
		
		// != not equal operator
		System.out.println(k!=w); // returns true if k is not equal to w.
	}
	
	

}
