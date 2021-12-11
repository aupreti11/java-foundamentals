package com.hashset;

import java.util.Set;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
	
		Set<String> set = new LinkedHashSet<>();
		
		// linkedhashset follows the order unlike the hashset.
		
		set.add("anand");
		set.add("tara");
		set.add("avani");
		set.add("arvav goswami");
		set.add("arvav goswami");
		
		for(String s: set) {
			System.out.println(s);
		}
		
		
		
	}

}
