package com.hashset;

import java.util.Comparator;

public class VehicleSortingByPrice implements Comparator<Vehicle> {

	@Override
	public int compare(Vehicle o1, Vehicle o2) {
		
		return o1.price - o2.price;
	}

}
