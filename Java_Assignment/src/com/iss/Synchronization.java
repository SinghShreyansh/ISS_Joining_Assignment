package com.iss;

//Synchronization :
//	Synchronization in Java can be achieved using synchronized methods or synchronized blocks to ensure that only one thread accesses the critical section of the code at a time.
//Prevents concurrent access issues using synchronized methods or blocks.

public class Synchronization {

	    private int count = 0;

	    public synchronized void increment() {
	        count++;
	    }

	    public synchronized int getCount() {
	        return count;
	    }

	    public static void main(String[] args) {
	    	Synchronization counter = new Synchronization();

	        Runnable task = () -> {
	            for (int i = 0; i < 1000; i++) {
	                counter.increment();
	            }
	        };

	        Thread t1 = new Thread(task);
	        Thread t2 = new Thread(task);
	        t1.start();
	        t2.start();

	        try {
	            t1.join();
	            t2.join();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        System.out.println("Final count: " + counter.getCount());
	     }

	
}
