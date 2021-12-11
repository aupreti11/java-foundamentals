package com.inheritance;

import java.util.Scanner;

public class TeacherMain {

	public static void main(String[] args) {
		
		Teacher obj = new Teacher();
		Maths obj1 =new Maths();
		Science obj2 = new Science();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter teacher name");
		String name = scan.next();
		obj.tname = name;
		System.out.print("\nenter the age of teacher: ");
		int age = scan.nextInt();
		obj.tage = age;
		System.out.print("\nenter the address of teacher: ");
		String add = scan.next();
		obj.taddress = add;
		System.out.println("====teacher method======");
		obj.teaches();
		
		System.out.println("====math method======");
		obj1.math();
		
		System.out.println("====science method======");
		obj2.science();
		scan.close();
	}
}
