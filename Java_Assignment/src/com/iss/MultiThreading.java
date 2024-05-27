package com.iss;

// Multithreading
//Multithreading in Java allows concurrent execution of two or more threads to maximize the utilization of the CPU. 
//This can significantly improve the performance of applications, especially those that are computationally intensive or involve I/O operations. 
//In Java, threads can be created by extending the Thread class or implementing the Runnable interface.


//Creating a Thread by Extending Thread Class

class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start(); // Start the thread
    }
}


//Creating a Thread by Implementing Runnable Interface

class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable());
        t1.start(); // Start the thread
    }
}


public class MultiThreading {

}
