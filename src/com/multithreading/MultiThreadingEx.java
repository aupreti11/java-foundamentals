package com.multithreading;

public class MultiThreadingEx extends Thread {  
	
	// extending the thread
	
	public void run() {
		for(int i =1;i<=5;i++) {
			try {
			Thread.sleep(300);
			}catch (Exception e) {
				System.out.println(e);
			}
			System.out.println(Thread.currentThread().getName() +" "+ +i);
		}
	}
	
	public static void main(String[] args) {
		
		// Multithreading is a process of executing multiple thread simultaneously.
		// thread is the light weight sub process, smallest unit of the processing
		// threads are independent so we can perform mulitple operations at the same time.
		// life cycle of a thread., new , runnable , running and terminated.
		// there are 2 ways to create the thread 1. extending thread and 2 implementing runnable interface.
		// start(); method to start the thread and run(); to perform actions for the thread.
		// thread priority has from 1 to 10.
		
		MultiThreadingEx t1 = new MultiThreadingEx();
		t1.start();
	//	t1.setPriority(10 or MAX.Priority);  // priority example
		
		MultiThreadingEx t2 = new MultiThreadingEx();
		t2.start();
	}	


}
