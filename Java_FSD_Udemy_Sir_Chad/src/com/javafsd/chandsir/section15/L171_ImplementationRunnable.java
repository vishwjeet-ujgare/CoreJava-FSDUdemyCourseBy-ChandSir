package com.javafsd.chandsir.section15;

/*
 * 
	1. Create a class that implements the Runnable interface and overrides the run() method.
	2.Inside the run() method, write the code that you want to be executed when the thread is started.
	3.In the main() method, create an instance of the class that implements the Runnable interface.
	4.Create a new Thread object, passing the instance of the Runnable class as a parameter to the constructor.
	5.Call the start() method on the Thread object to start the thread and execute the code in the run() method.
 */

public class L171_ImplementationRunnable implements Runnable {

    // override run method
    @Override
    public void run() {
        // callig a method  executed when thread is started
       printNumberWithRespectiveThreadName();
    }
    
    // creating method which print the numbers and thread name 
    void printNumberWithRespectiveThreadName() {
    	 for (int i = 1; i <  10; i++) {
    		 try {
				Thread.sleep(600);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
             System.out.println("Thread : " + Thread.currentThread().getName() + ", Count: " + i);
         }
    }
    	 
    public static void main(String[] args) {
        // create thread by passing class name to object 
        L171_ImplementationRunnable obj = new L171_ImplementationRunnable();
        Thread thread1 = new Thread(obj);
        thread1.start();
        
        Thread thread2 = new Thread(obj);
        thread2.start();
    }

}

