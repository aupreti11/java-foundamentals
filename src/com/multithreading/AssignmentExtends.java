package com.multithreading;

import java.util.ArrayList;
import java.util.List;

public class AssignmentExtends extends Thread{
	
	public void run() {
		List<String> name = new ArrayList<>();
		name.add("amrit");
		name.add("robert");
		name.add("Tripp");
		name.add("hartman");
		for(String s: name) {
			try {
			Thread.sleep(1000);
			}catch(Exception e) {
				System.out.println(e);
			}
			System.out.println(Thread.currentThread().getName()+ "  "+ s);
		}
	}

	public static void main(String[] args) {
		
		AssignmentExtends a = new AssignmentExtends();
		a.start();
		try {
			a.join(400);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		AssignmentExtends a1 = new AssignmentExtends();
		a1.start();
		AssignmentExtends a2 = new AssignmentExtends();
		a2.start();
	}

}
