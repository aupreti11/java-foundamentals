package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StudentMain {

	public static void main(String[] args) {
		
		List<Student> student = new ArrayList<>();
		
		// creating the student object.
		Student s1 = new Student("amrit" , "upreti" , 13, 1);
		Student s2 = new Student("devanand" , "kharel" , 10, 8);
		Student s3 = new Student("dalle" , "kancha" , 11, 7);
		Student s4 = new Student("bhagawan" , "upreti" , 12, 17);
		
		// adding these student object to arraylist
		student.add(s1);
		student.add(s2);
		student.add(s3);
		student.add(s4);
		
		// default sorting
		Collections.sort(student); // default sorting using collections for this we have to implement the comparable interface.
		
		// iteration using for-each loop
		System.out.println("***** using for each loop *******");
		for(Student s :student) {
			System.out.println(s);
		}
		
		System.out.println("\n***** using for loop *******");
		//iteration using classical for loop
		for(int i = 0;i<student.size();i++) {
			System.out.println(student.get(i));
		}
		
		// perform iteration using the Iteration
		System.out.println("\n***** using iterator *******");
		Iterator<Student> it = student.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		// custom sorting by last name
		System.out.println("\n***** sorting by lastname *******");
		Collections.sort(student , new StudentSortingByLastname());
	      for(Student stu   :student){
				
				System.out.println(stu);
			}
	 }
}


