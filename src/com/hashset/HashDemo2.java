package com.hashset;

import java.util.Set;
import java.util.TreeSet;

public class HashDemo2 {
	public static void main(String [] args) {
		
		Set<String> set = new TreeSet<>(); // ----> TreeSet gives the sorting object.(not collections.sort)
		
		set.add("amrit");
		set.add("xyz");
		set.add("prabhat");
		set.add("tara");
		set.add("tara");
		
		for(String s :set) {
			System.out.println(s);
		}		
	}
}

// the output is sorted and no duplicate value because of the TreeSet
