package com.superkeyword;

public class Demo1 extends SuperDemo1{
	
	String name = "muna";
	int age = 27;
	String address = "pune";
	
	public void method() {
		System.out.println("name = " +name);
		System.out.println("this.name = " +this.name);
		System.out.println("super.name =" +super.name);  // ---> super keyword is use to call the immediate class methods and attribute.
		System.out.println("age = " +age);
		System.out.println("address = " +address);
		System.out.println("this.address = " +this.address);
		System.out.println("super.address = " +super.address);
		super.method();
	}
}
