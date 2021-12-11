package com.toString;

public class MobileMain {

	public static void main(String[] args) {
		Mobile obj = new Mobile("iphone","gold",1000,14.3);
		System.out.println(obj.color);
		System.out.println(obj.price);
		
		// instead of printing an individual attribute like above we can use toString method to print all the attributes.
		System.out.println(obj.toString());

	}

}
