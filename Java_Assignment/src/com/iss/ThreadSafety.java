package com.iss;

//Thread Safety :
//	Thread safety means ensuring that shared data is accessed and modified by multiple threads in a controlled manner to avoid data inconsistency.

public class ThreadSafety implements Runnable{

//	Thread-Safe Instance Variables

	private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public synchronized int getCount() {
        return count;
    }
    
//    Thread-Safe Local Variables
    public void run() {
        int localVariable = 0; // Local variable, thread-safe
        localVariable++;
        System.out.println("Local variable: " + localVariable);
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadSafety());
        Thread t2 = new Thread(new ThreadSafety());
        t1.start();
        t2.start();
    }
    
}
