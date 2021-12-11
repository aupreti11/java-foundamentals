package basic.java;

public class LoopConcept {

	public static void main(String[] args) {
		
		
		// for loop increment
		for(int i=0;i<=3;i++) {
			System.out.println(i);
		}
		
		System.out.println("==========");
		// for loop decrement
		for(int j =3;j>=0;j-- ) {
			System.out.println(j);
		}
		
		//while loop
		System.out.println("==========");
		int n=0;
		while(n<=3) {
			System.out.println(n);
			n++;  // if we don't write this statement the loop continues infinite times.
		}
		
	}
	

}
