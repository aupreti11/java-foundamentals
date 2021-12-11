package com.methodoverriding;
import java.util.Scanner;

public class MobileMain {

	public static void main(String[] args) {
		
		// concept of polymorphism
		// methods having same name but behaving as the different is called polymorphism.
	
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the price");
		int p = scan.nextInt();
		Mobile obj = new Mobile();
		p = obj.price;
		
		System.out.println("enter the model");
		String m = scan.next();
		m = obj.model;
		
		System.out.println("enter the color");
		String c = scan.next();
		c = obj.color;
		
		obj.display();
		System.out.println("=============");
		
		Samsung obj1 = new Samsung();
		obj1.display();
		
		System.out.println("=============");
		Iphone obj2 = new Iphone();
		obj2.display();
		scan.close();
		
		
		
	}

}

