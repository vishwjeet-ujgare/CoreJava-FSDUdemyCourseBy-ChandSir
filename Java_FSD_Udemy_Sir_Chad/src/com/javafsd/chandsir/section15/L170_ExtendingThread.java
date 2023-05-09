package com.javafsd.chandsir.section15;

public class L170_ExtendingThread extends Thread {

	// extended thread class and override a run method
	@Override
	public void run() {
		//calling method
		printNumberWithRespectiveThreadName();
	}

	void printNumberWithRespectiveThreadName() {
		for (int i = 1; i < 10; i++) {
			try {
				Thread.sleep(600);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("i = " + i + " and Thread name is : " + Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {

			L170_ExtendingThread th1=new  L170_ExtendingThread();
			L170_ExtendingThread th2=new  L170_ExtendingThread();	
			System.out.println("Thread name from main method is :" + Thread.currentThread().getName());

			th1.start();
			th2.start();
			System.out.println("Thread name from main method is :" + Thread.currentThread().getName());

	}

}
