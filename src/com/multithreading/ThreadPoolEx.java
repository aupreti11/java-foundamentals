package com.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkerThread implements Runnable{
	
	private String msg;
	public WorkerThread(String msg) {
		this.msg = msg;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " Start message " + msg);
		try {
		Thread.sleep(500);
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " End " );
		
	}
	
}
public class ThreadPoolEx {

	public static void main(String[] args) {
		
		ExecutorService e = Executors.newFixedThreadPool(5);
		for(int i =0;i<=5;i++) {
			Runnable worker = new WorkerThread(""+i);
			e.execute(worker);
			
		}
		
		e.shutdown();

	}

}
