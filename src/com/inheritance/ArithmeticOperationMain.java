package com.inheritance;

import java.util.Scanner;

public class ArithmeticOperationMain {

	public static void main(String[] args) {
		
		ArithmeticOperation1 obj = new ArithmeticOperation1();
		Scanner  scan = new Scanner(System.in);
		System.out.print("Enter the value of x: ");
		int num = scan.nextInt();
		obj.x = num;
		System.out.print("Enter the value of y: ");
		int num1  = scan.nextInt();
		obj.y = num1;
		System.out.print("Enter the value of a: ");
		int p = scan.nextInt();
		obj.a = p;
		
		System.out.println("===============");
		System.out.println("x = " + num);
		System.out.println("y = " + num1);
		System.out.println("a = " + p);
		System.out.println("===============");
		obj.sum();
		obj.math();
		scan.close();
	}
}
