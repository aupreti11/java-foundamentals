package com.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		
		// map has a key and value (Integer & String)
		// duplicate value is not accepted while duplicate key can be accepted.
		// map is unordered meaning the output could be the one last inserted or so on.
				
		
		Map<String, Integer> set = new HashMap<>();
		set.put("amrit", 100);
		set.put("muna", 90);
		set.put("tara", 420);
		set.put("somras", 800);
		Set<Entry<String, Integer>> hmap = set.entrySet();
		
		for(Entry<String, Integer> entry: hmap) {
			System.out.println(entry.getKey());
			
		}
	}

}
