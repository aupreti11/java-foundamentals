package com.interfaceExample;

public class InterfaceDemo2Main {

	public static void main(String[] args) {
		
		InterfaceDemo2 obj = new Dog2();
		obj.run();
		obj.walk();
		System.out.println(obj.str);
		System.out.println(obj.leg);
	}
}
