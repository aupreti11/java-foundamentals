package com.superkeyword;

class Employee {
	
	Employee(String name){
		System.out.println("from employee");
		System.out.println(name);
	}
		
	}
	
class Person extends Employee{

	Person(String name){
	super(name);
		System.out.println("from person ");
		System.out.println(name);
	}

}

public class Employee2 {

	public static void main(String[] args) {
		Person obj = new Person("amrit");
		
	
	}
}
	
	


