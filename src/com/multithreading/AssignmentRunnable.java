package com.multithreading;

import java.util.ArrayList;
import java.util.List;

public class AssignmentRunnable extends Thread implements Runnable {
	
	public void run() {
		String[] str = new String[]{"amrit","Thomas","Tyler","Stols"};
		for(int i=0;i<str.length;i++) {
			try {
			Thread.sleep(600);
			}catch(Exception e) {
				System.out.println(Thread.currentThread().getName()+" "+ e);
			}
			System.out.println(str[i]);
		}
	/*	List<String> list = new ArrayList<>();
		list.add("amrit");
		list.add("Thomas");
		list.add("Tyler");
		list.add("Stols");
		for(String s : list) {
			try {
			Thread.sleep(500);
			}catch(Exception e) {
				System.out.println(e);
			}
			System.out.println(Thread.currentThread().getName() +"  "+ s);
		}  */
	}

	public static void main(String[] args) {
		
		AssignmentRunnable a = new AssignmentRunnable();
		Thread t = new Thread(a);
		t.start();
		try {
		t.join(1200);
		}catch(Exception e) {
			System.out.println(e);
		}
		
		AssignmentRunnable a1 = new AssignmentRunnable();
		Thread t1 = new Thread(a1);
		t1.start();
		
		AssignmentRunnable a2 = new AssignmentRunnable();
		Thread t2 = new Thread(a1);
		t2.start();


	}

}
