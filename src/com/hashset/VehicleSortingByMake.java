package com.hashset;

import java.util.Comparator;

public class VehicleSortingByMake implements Comparator<Vehicle>{

	@Override
	public int compare(Vehicle o1, Vehicle o2) {
		
		return (o1.getMake()).compareTo(o2.getMake());
	}
	

}
