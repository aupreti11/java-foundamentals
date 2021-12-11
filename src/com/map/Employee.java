package com.map;

public class Employee {
	
	String ename;
	int eid;
	int salary;
	
	public Employee() {
		
	}
	public Employee(String ename, int eid, int salary) {
		this.ename=ename;
		this.eid=eid;
		this.salary=salary;
	}
	public String toString() {
		return "Employee Details [ename =" +ename+ ", eid =" +eid+ ", salary =" +salary+ "]";
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

}
