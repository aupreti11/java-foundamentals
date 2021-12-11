package com.hashset;
import java.util.Iterator;
import java.util.Set;

import java.util.TreeSet;

public class VehicleMain {

	public static void main(String[] args) {
		
		// creating an array of set 
		Set<Vehicle> vehicle = new TreeSet<>();
		
		Vehicle v1 = new Vehicle("civic" , "toyota" , 7000);
		Vehicle v2 = new Vehicle("accord" , "honda" , 9000);
		Vehicle v3 = new Vehicle("bmw" , "xyz" , 5000);
		Vehicle v4 = new Vehicle("mercedes" , "b series" , 1500);
		
		vehicle.add(v1);
		vehicle.add(v2);
		vehicle.add(v3);
		vehicle.add(v4);
		
		// sorting my model we have to implements the comparable and add method to sort
		System.out.println("=== sorting by model =====");
		for(Vehicle v: vehicle) {
			System.out.println(v);
		}
		
		// sorting my price custom sorting for this implement comparator interface
		System.out.println("\n=== sorting by price =====");
		Set<Vehicle> vehicle1 = new TreeSet<>(new VehicleSortingByPrice());
		vehicle1.add(v1);
		vehicle1.add(v2);
		vehicle1.add(v3);
		vehicle1.add(v4);
		
		Iterator<Vehicle> it = vehicle1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		// sorting by make custom sorting
		System.out.println("\n=== sorting by make =====");
		Set<Vehicle> vehicle2 = new TreeSet<>(new VehicleSortingByMake());
		vehicle2.add(v1);
		vehicle2.add(v2);
		vehicle2.add(v3);
		vehicle2.add(v4);
		Iterator<Vehicle> ite = vehicle2.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
		
		

	}

}
