package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeMain1 {

	public static void main(String[] args) {
		
		List<Employee1> alist = new ArrayList<>();
		
		Employee1 e1 = new Employee1("anand","springfield",1);
		Employee1 e2 = new Employee1("tara","pune",10);
		Employee1 e3 = new Employee1("avani","philly",3);
		Employee1 e4 = new Employee1("muna","new york",4);
		
		alist.add(e1);
		alist.add(e2);
		alist.add(e3);
		alist.add(e4);
		
		//sort(uses Comparable or default sorting 
		Collections.sort(alist);
		for(Employee1 e :alist) {
			System.out.println(e);
		}
	}
	

}
