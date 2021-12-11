package com.toString;

public class StudentMain {

	public static void main(String[] args) {
		
		Student s = new Student("amrit", 2, 8, "newyork");
		System.out.println(s.name);
		System.out.println(s.rollno);
		System.out.println(s.grade);
		System.out.println(s.address);
		// --> rather than printing individual records we can use toString method to print once at a time.
		System.out.println(s.toString());
		

	}

}
