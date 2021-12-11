package basic.java;

import java.util.Scanner;

public class MethodUsingSwitch {
	
	static int num;
	static int num1;
	static int sum;
	static int sub;
	static int mul;
	static int div;
	
	
	public int add() {
		
		sum = num +num1;
		return sum;
	}
	public int sub() {
		
		sub = num - num1;
		return sub;
	}
	
	public int mul() {
		
		mul = num * num1;
		return mul;
	}
	
	public int div() {
		div= num / num1;
		return div;
	}
	

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the first number ");
		num = scan.nextInt();
		System.out.print("\nEnter the second number ");
		num1 = scan.nextInt();
		System.out.println("===================");
		System.out.print("Enter which case you wanna execute: ");
		int cn = scan.nextInt();
		scan.close();
		
		MethodUsingSwitch obj = new MethodUsingSwitch();
		
		switch(cn) {
		
		case 1:
			
			obj.add();
			System.out.println("\nthe sum of two number" +  " = "  +sum);
			break;
		case 2:
			obj.sub();
			System.out.println("\nthe subtraction of two number" + " = " +sub);
			break;
		case 3:
			obj.mul();
			System.out.println("\nthe mulitplication of two number" + " = " +mul);
			break;
		case 4:
			obj.div();
			System.out.println("\nthe division of two number" + " = " +div);
			break;
		default:
			System.out.println("\nPlease enter the right case number");
			break;
		}
	
	}

}
