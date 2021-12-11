package com.multithreading;

/* class A{
 
 *  }
 */
public class MultiThreadingEx1 implements Runnable {  // extends A implements Runnable we can extends the parent class when implementing runnable.
	
	//implementing the runnable interface 
	// this is better approach than the extends Thread
	
	public void run() {
		for(int i=1;i<=4;i++) {
			try {
			Thread.sleep(900);
			}catch(Exception e) {
				System.out.println(e);
			}
			System.out.println(Thread.currentThread().getName() +" "+ +i);
		}
	}

	public static void main(String[] args) {
		MultiThreadingEx1 m = new MultiThreadingEx1();
		Thread t = new Thread(m);
		t.start();
		try {
		t.join(900);
		}catch(Exception e) {
			System.out.println(e);
		}
	//  t.start(); // no compile time error but gives run time exception and hence we cannot start thread twice, it gives IllegalThreadStateException
		MultiThreadingEx1 m1 = new MultiThreadingEx1();
		Thread t1 = new Thread(m1);
		t1.start();
		
		// if we can run method directly, we are not implementing the multithreading instead it runs as a normal method.
		


	}



}
