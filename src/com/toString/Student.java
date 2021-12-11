package com.toString;

public class Student {
	
	String name;
	int rollno;
	int grade;
	String address;
	
	public Student(String name, int rollno, int grade, String address) {
		this.name = name;
		this.rollno = rollno;
		this.grade = grade;
		this.address = address;
	}
	
	public String toString() {
		return "Students details [name = "  +name+ ", rollno = " +rollno+ " ,grade = "+grade+ " ,address = " +address+ "]";
	}
}
	
