package com.collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class VehicleMain {

	public static void main(String[] args) {
		
		// Creating an array of vehiclelist
		List<Vehicle> vehiclelist = new ArrayList<>();
		
		Vehicle v1 = new Vehicle("accord","Honda",8000);
		Vehicle v2 = new Vehicle("civic","XYZ",2000);
		Vehicle v3 = new Vehicle("corolla","Toyota",6000);
		Vehicle v4 = new Vehicle("B series","BMW",10000);
		
		vehiclelist.add(v1);
		vehiclelist.add(v2);
		vehiclelist.add(v3);
		vehiclelist.add(v4);
		
		// in-bulit sorting using collections.sort 
		Collections.sort(vehiclelist);
		
		for(Vehicle veh: vehiclelist) {
			System.out.println(veh);
		}
		
		//custom sorting by vehicle make
		System.out.println("\n==== sorting by vehicle make =====");
		Collections.sort(vehiclelist, new VehicleSotingbyMake());
		
		for(Vehicle v: vehiclelist) {
			System.out.println(v);
		}
		
		
		//custom sorting by vehicle price
		System.out.println("\n==== sorting by vehicle price =====");
		Collections.sort(vehiclelist, new VehicleSortingbyPrice());
		for(Vehicle vehi: vehiclelist) {
			System.out.println(vehi);
		}
		
		

	}

}
