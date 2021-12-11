package com.hashset;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo1 {

	public static void main(String[] args) {
		
		// set is unordered (elements are added not on order)
		// set doesnot allow duplicate elements
		
		Set<String> set = new HashSet<>();
		set.add("amrit");
		set.add("anand");
		set.add("prabhat");
		
		for(String s: set) {
			System.out.println(s);
		}
		

	}

}
