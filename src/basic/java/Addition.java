package basic.java;

import java.util.Scanner;

public class Addition {
	
	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number is");
		int i = scan.nextInt();
		System.out.println("Enter the second number is: " );
		int j = scan.nextInt();
		
		int sum= i+j;
		System.out.println("The sum of i and j is: " +sum);
		scan.close();
	}

}
