package com.collections;

import java.util.Comparator;

public class VehicleSortingbyPrice implements Comparator<Vehicle>{

	@Override
	public int compare(Vehicle o1, Vehicle o2) {
		
		return o1.getPrice()-o2.getPrice();
	}
	

}
