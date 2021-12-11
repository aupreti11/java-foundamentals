package com.collections;

import java.util.Comparator;

public class StudentSortingByLastname implements Comparator<Student>{
	public int compare(Student o1, Student o2) {
		
		return (o1.getLastname()).compareTo(o2.getLastname());
	}
	

}
