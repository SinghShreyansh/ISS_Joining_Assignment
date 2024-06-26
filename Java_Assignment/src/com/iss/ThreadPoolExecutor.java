package com.iss;

// Thread Pool Executor :

//Thread pools are used to manage a pool of worker threads. 
//Executors can be used to reuse previously created threads to run current tasks.

import java.util.concurrent.*;

public class ThreadPoolExecutor {

	public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5); // Create a thread pool with 5 threads

        for (int i = 0; i < 10; i++) {
            Runnable worker = new WorkerThread("" + i);
            executor.execute(worker); // Execute the worker threads
        }

        executor.shutdown(); // Initiates an orderly shutdown
        while (!executor.isTerminated()) {
        }
        
//        Output:
//        	pool-1-thread-4 Start. Command = 3
//        	pool-1-thread-3 Start. Command = 2
//        	pool-1-thread-5 Start. Command = 4
//        	pool-1-thread-2 Start. Command = 1
//        	pool-1-thread-1 Start. Command = 0
//        	pool-1-thread-3 End.
//        	pool-1-thread-2 End.
//        	pool-1-thread-1 End.
//        	pool-1-thread-4 End.
//        	pool-1-thread-5 End.
//        	pool-1-thread-3 Start. Command = 5
//        	pool-1-thread-2 Start. Command = 6
//        	pool-1-thread-1 Start. Command = 7
//        	pool-1-thread-4 Start. Command = 8
//        	pool-1-thread-5 Start. Command = 9
//        	pool-1-thread-1 End.
//        	pool-1-thread-3 End.
//        	pool-1-thread-4 End.
//        	pool-1-thread-5 End.
//        	pool-1-thread-2 End.

        System.out.println("Finished all threads");
    }
	
}

class WorkerThread implements Runnable {
    private String command;

    public WorkerThread(String s) {
        this.command = s;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + " Start. Command = " + command);
        processCommand();
        System.out.println(Thread.currentThread().getName() + " End.");
    }

    private void processCommand() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
