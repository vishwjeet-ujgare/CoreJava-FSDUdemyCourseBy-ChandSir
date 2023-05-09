package com.javafsd.chandsir.section16_labda_expressoin_basic;

public class L189_LambdaExpressionThread {
	public static void main(String args[]) {

		// Creating a thread using the normal way
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Hello this is normal thread ");
			}
		});
		
		// Starting the thread
		thread.start();


		
		// Creating a thread using a lambda expression with a single line of code
		new Thread(() -> System.out.println("This is a lambda single line")).start();

		// Creating a thread using a lambda expression with multiple lines of code
		//added {}
		new Thread(() -> {
			System.out.println("This is a lambda multiline");
			System.out.println("This is a lambda multiline");
		}).start(); // Note: you need to call start() method to start the thread
	}

}
