package com.abstractkeyword;

public class MobileMain {

	public static void main(String[] args) {
		
		Iphone myObj = new Iphone();
		myObj.display();
		System.out.println(myObj.keypad);
		System.out.println(myObj.price);
		System.out.println(myObj.model);
		System.out.println(myObj.color);

	}

}
