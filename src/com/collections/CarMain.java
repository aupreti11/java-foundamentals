package com.collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class CarMain {

	public static void main(String[] args) {
		
		// creating 4 car objects.
		Car c1 = new Car("Toyota","corolla",8000);
		Car c2 = new Car("Honda","accord",9000);
		Car c3 = new Car("BMW","X-series",10000);
		Car c4 = new Car("Nissan","altima",3000);
		
		// creating arraylist of car
		List<Car> car = new ArrayList<>();
		
		// adding those car objects on the arraylist
		car.add(c1);
		car.add(c2);
		car.add(c3);
		car.add(c4);
		
		//printing using for-each loop
		System.out.println("===== using for each loop =======");
		for(Car c: car) {
			System.out.println(c);
		}
		
		// printing using for loop
		System.out.println("\n===== using for loop =======");
		for(int i=0;i<car.size();i++) {
			System.out.println(car.get(i));
		}
		
		// printing using iterator
		System.out.println("\n===== using iterator =======");
		Iterator<Car> it = car.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		// sorting by model or default sorting using .sort method
		Collections.sort(car);
		
		//printing using for-each loop after sorting by model
		System.out.println("\n===== using for each loop after sorting =======");
		for(Car c: car) {
			System.out.println(c);
		}
		
		// custom sorting by make
		
		Collections.sort(car, new CarMainSortingbyMake());
		System.out.println("\n===== sorting by car make =======");
		Iterator<Car> ite = car.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
	}
}
