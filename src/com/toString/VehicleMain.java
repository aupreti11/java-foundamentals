package com.toString;

public class VehicleMain {

	public static void main(String[] args) {
	
		Vehicle obj = new Vehicle("toyota", "camry" , 34000, 2020);
		System.out.println(obj.make);
		System.out.println(obj.model);
		System.out.println(obj.price);
		System.out.println(obj.year);
		System.out.println("==== to String method invoked ======");
		System.out.println(obj.toString());
		
	}

}
