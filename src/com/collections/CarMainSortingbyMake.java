package com.collections;

import java.util.Comparator;

public class CarMainSortingbyMake implements Comparator<Car>{

	@Override
	public int compare(Car o1, Car o2) {
		
		return (o1.getMake()).compareTo(o2.getMake());
	}

}
