package com.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;


public class HashMapDemo1 {

	public static void main(String[] args) {
		
		// map has a key and value (Integer & String)
		// duplicate key is not accepted while duplicate value can be accepted.
		// map is unordered meaning the output could be the one last inserted or so on.
		// TreeMap gives the sorting by keys not by value.
		
		Map<String, Integer> hmap = new HashMap<>();
		
		/* Map<String, Integer> set = new TreeMap<>();  -----> gives the sorted list */
		hmap.put("amrit", 1);
		hmap.put("trajan", 8);
		hmap.put("pandit", 3);
		hmap.put("pandey", 4);
		hmap.put("puskar", 4);
		hmap.put("puskar", 5);
		
		// same value will be printed once i.e. no duplicate value but keys can be duplicate
		System.out.println(hmap);
		
		// printing using for-each loop
		Set<Entry<String, Integer>>var = hmap.entrySet();
		for(Entry<String, Integer > s: var) {
			System.out.println(s);	
		}
	}
}
