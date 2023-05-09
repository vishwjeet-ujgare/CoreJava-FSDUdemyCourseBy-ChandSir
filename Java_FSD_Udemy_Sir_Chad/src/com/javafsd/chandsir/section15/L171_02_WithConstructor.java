package com.javafsd.chandsir.section15;

public class L171_02_WithConstructor {
public static void main(String args[]) {
		// TODO Auto-generated method stub

	
Thread thread1=new Thread(new Runnable() {
	
	@Override
	public void run() {
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
});

thread1.start();


new Thread(new Runnable() {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
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
}).start();

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
}
