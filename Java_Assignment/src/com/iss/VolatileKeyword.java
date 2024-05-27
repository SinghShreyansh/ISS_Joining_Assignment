package com.iss;

import java.util.concurrent.*;

public class VolatileKeyword extends Thread {

	private volatile boolean running = true;

    public void run() {
        while (running) {
            System.out.println("Thread is running...");
        }
        System.out.println("Thread is stopped.");
    }

    public void stopThread() {
        running = false;
    }

    public static void main(String[] args) throws InterruptedException {
    	VolatileKeyword thread = new VolatileKeyword();
        thread.start();
        Thread.sleep(1000); // Let the thread run for a second
        thread.stopThread(); // Stop the thread
    }
	
}
