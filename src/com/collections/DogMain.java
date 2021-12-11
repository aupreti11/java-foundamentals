package com.collections;

import java.util.ArrayList;

public class DogMain {

	public static void main(String[] args) {
		
		ArrayList<Dog1> dog = new ArrayList<Dog1>();
		
		Dog1 dog1 = new Dog1("Doge" , "white");
		Dog1 dog2 = new Dog1("jacky" , "brown");
		Dog1 dog3 = new Dog1("tommy" , "blue");
		
		dog.add(dog1);
		dog.add(dog2);
		dog.add(dog3);
		
		System.out.println(dog1);
		System.out.println(dog2);
		
		// iteration using for-each loop
		for(Dog1 d: dog) {
			System.out.println(d);
		}
		
		// toString method
		System.out.println(dog);
	}

}
