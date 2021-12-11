package com.collections;

import java.util.Comparator;

public class VehicleSotingbyMake  implements Comparator<Vehicle>{

	@Override
	public int compare(Vehicle o1, Vehicle o2) {
		
		return o1.getMake().compareTo(o2.getMake());
		
	}
}
