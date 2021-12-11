package com.toString;

public class Mobile {
	
	String model;
	String color;
	int price;
	double version;
	
	public Mobile(String model, String color, int price, double version) {
		this.model = model;
		this.color = color;
		this.price = price;
		this.version = version;
	}

//	@Override
//	public String toString() {
//		return "Mobile [model=" + model + ", color=" + color + ", price=" + price + ", version=" + version + "]";
//	}
	


public String toString() {
	return "mobile details [model=" +model+",color=" +color+ ", price=" +price+",version=" +version+"]";
}
}