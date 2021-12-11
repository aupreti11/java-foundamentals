package com.interfaceExample;

public class Dog2 implements InterfaceDemo2{
	
	String str = "amrit";
	int legs = 1;
	
	public void run() {
		System.out.println(" "+str+" can run");
	}
	public void walk() {
		
		System.out.println("dog has " +legs);
	}	

}
