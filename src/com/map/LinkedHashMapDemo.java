package com.map;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		
		Map<String, Integer> hmap = new LinkedHashMap<>();  // ----> linkedhashmap follows the insertion order.
		hmap.put("amrit",1);
		hmap.put("tara",4);
		hmap.put("muna",3);
		
		Set<Entry<String, Integer>> set = hmap.entrySet();
		for(Entry<String, Integer> entry: set) {
			System.out.println(entry.getValue() );
		}
		
		

	}
 
}
