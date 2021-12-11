package com.collections;

public class Employee1 implements Comparable<Employee1> {
	
	// for default sorting we have to implements the comparable interface like above
	
	private String name;
	private String address;
	private int eid;
	
	public Employee1() {
		
	}
	
	public Employee1(String name, String address, int eid) {
		this.name = name;
		this.address = address;
		this.eid = eid;
	}

	@Override
	public String toString() {
		return "Employee1 [name=" + name + ", address=" + address + ", eid=" + eid + "]";
	}

	@Override
	public int compareTo(Employee1 o) {
		
		return(this.name).compareTo(o.name);
	}
	
}
