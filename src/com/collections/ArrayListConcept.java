package com.collections;

import java.util.ArrayList;

public class ArrayListConcept {
	
	// Arraylist is a resizable array which can be found on java.util package.
	//Array can not be modified but arraylist can be modified.
	
	public static void main(String[] args) {
		
		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(28);  // index 0
		array.add(29);	// index 1
		array.add(30);	// index 2
		array.add(31);	// index 3
		
		System.out.println(array.get(3)); // -----> this gives the values at index 3.
		System.out.println("==============");
		System.out.println(array.size()); // ----> size() method gives the size of an array.
		System.out.println("==============");
		
		// to print all the values at a time.
		for(int i=0;i<array.size();i++){
			System.out.println(array.get(i));
		}
	}
}
