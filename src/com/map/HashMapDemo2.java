package com.map;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.HashMap;
import java.util.TreeMap;

public class HashMapDemo2 {

	public static void main(String[] args) {
		
		Map<Integer, String> hmap = new HashMap<>(); //--> TreeMap gives the sorted order.
		
		hmap.put(1, "tara");
		hmap.put(6, "andand");
		hmap.put(2, "samjhana"); 
		hmap.put(9, "xyz");
		
		// printing using for- each loop
		Set<Entry<Integer, String>> set = hmap.entrySet();
		for(Entry<Integer, String> entry : set) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		// for custom sorting
		Map<Integer, String> abc = new TreeMap<>(new HashMapDemo2SortingCustom());
		abc.put(1, "tara");
		abc.put(6, "andand");
		abc.put(2, "samjhana"); 
		abc.put(9, "xyz");
		System.out.println("=== cusotom sorting =====");
		
		Set<Entry<Integer,String>> entry = abc.entrySet();
		for(Entry<Integer, String> s : entry) {
			System.out.println(s.getValue() + s.getKey());
		}

	}

}
