package com.inheritance;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		
		Multiplication obj = new Multiplication();
		Scanner scan = new Scanner(System.in);
		System.out.println("enter first no");
		int num = scan.nextInt();
		System.out.println("enter second no");
		int num2 = scan.nextInt();
		obj.x = num;
		obj.y = num2;
		obj.sum();
		obj.sub();
		obj.multi();
		scan.close();

	}

}
