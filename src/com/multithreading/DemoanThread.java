package com.multithreading;

public class DemoanThread extends Thread {
	
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println("Demoan " + Thread.currentThread().getName());
		}else
			System.out.println("User  " + Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		
		// demoan thread should always start first than the other thread.
		
		DemoanThread dt1 = new DemoanThread();
		DemoanThread dt2 = new DemoanThread();
		DemoanThread dt3 = new DemoanThread();
		dt1.setDaemon(true);
		dt1.start();
		// dt1.setDaemon(true);  gives error because we must always declare the demon thread first.
		dt2.start();
		dt3.start();

		

	}

}
