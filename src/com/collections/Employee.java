package com.collections;

public class Employee {
	
	int eid;
	String name;
	int salary;
	
	public Employee() {
		
	}
	public Employee(int eid, String name, int salary) {
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		Employee second=(Employee)obj;
		return name.equals(second.name);
	}
	
}
