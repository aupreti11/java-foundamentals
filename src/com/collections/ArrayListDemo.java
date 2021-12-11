package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(90);
		list.add(50);
		list.add(20);
		list.add(100);
		
		Collections.sort(list);  // collections is a in-bulit class for sorting
		for(Integer i: list) {
			System.out.println(i);
		}
	}
}