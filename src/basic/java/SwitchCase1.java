package basic.java;

import java.util.Scanner;
public  class SwitchCase1 {
	
	
	public static void main(String[] args) {
		
		int a =9;
		int b= 1;
		Scanner scan = new Scanner(System.in);
		System.out.println("a" + " = " +a);
		System.out.println("b" + " = " +b);
		System.out.print("\nEnter the case: ");
		int fl = scan.nextInt();
		scan.close();
		switch(fl) {
		case 1:

			int sum = a+ b;
			System.out.println("\nsum of a and b is " +" = " +sum);
			break;
		case 2:
			int sub = a-b;
			System.out.println("\nsubtraction of a and b is " + " = " +sub);
			break;
		case 3:
			int mul = a * b;
			System.out.println("\nmultiplication of a and b is " +" = " +mul);
			break;
		case 4:
			int div = a / b;
			System.out.println("\nDivision of a by b is " + " = "+div);
			break;
		default:
			System.out.println("\nYou entered the wrong case number");
			break;
				
		
		}
	}

}
