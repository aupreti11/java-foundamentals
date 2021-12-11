package com.collections;

import java.util.concurrent.CopyOnWriteArrayList;

import java.util.List;

public class EmployeeMain {

	public static void main(String[] args) {
		

		List<Employee> employee = new CopyOnWriteArrayList<>();
		Employee e1 = new Employee(1,"anand",1000);
		Employee e2 = new Employee(2,"tara",2000);
		Employee e3 = new Employee(3,"arnav",3000);
		Employee e4 = new Employee(4,"avani",4000);
		employee.add(e1);
		employee.add(e2);
		employee.add(e3);
		employee.add(e4);

		// Search Operation:
			System.out.println(employee.contains(e3));
		
			System.out.println("****************");
		
		// printing all the records using the for-each loop
			for(Employee emp : employee) {
				System.out.println(emp);
			}
			
			
	}

}


