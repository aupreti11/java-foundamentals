package com.methodoverriding;

public class Samsung extends Mobile {
	
	boolean foldable = true;
	
	public void display() {
		System.out.println("this is from the samsung class");
		System.out.println("Model of the samsung is = " +model);
		System.out.println("foldable = " +foldable);
	}

}
