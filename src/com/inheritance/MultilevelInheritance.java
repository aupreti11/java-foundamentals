package com.inheritance;

class School{
	
	String name;
	void display() {
		System.out.println("from the student method");
	}
}
class Student extends School{
	
	void result() {
		System.out.println("students result method");
	}
	void test() {
		System.out.println("from the studnet test method");
	}
}

// ------------------------------------------------------------------------------------------- >


class Employee{
	double basesalary = 3000;
	
	void records() {
		System.out.println("All records must be captured");
	}
	void workhour() {
		System.out.println("Work hour should be atleast 40 a week");
	}
}

class Programmer extends Employee{
	double bonus = 1200;
	void calpSalary() {
		System.out.println("Programmer total salary: " + (basesalary + bonus));
	}
}

class Developer extends Employee{  // --------> if a class has multiple child class then its Hierarchical  inheritance
	double bonus = 1500;
	void caldSalary() {
		System.out.println("Developer total salary: " + (basesalary + bonus));
	}
}

class PManager extends Developer{  // ---------> example of multilevel inheritance
	double bonus = 1800;
	void calpmSalary() {
		System.out.println("Developer total salary: " + (basesalary + bonus));
	}
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		
		Student obj = new Student();
		obj.name = "amrit";
		System.out.println(obj.name);
		obj.display();
		obj.result();
		obj.test();
		System.out.println("****** from another employee class *******");
		
		PManager obj1 = new PManager();  // --------> It can access all the methods of developer as well as employee  as below.
		
		obj1.caldSalary();
		obj1.calpmSalary();
		obj1.records();
		obj1.workhour();
		
		Developer d = new Developer();
		d.caldSalary();
		d.records();
		d.workhour();
		
		
	}

}

