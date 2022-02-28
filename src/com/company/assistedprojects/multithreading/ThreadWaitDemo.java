package com.company.assistedprojects.multithreading;

public class ThreadWaitDemo extends Thread {

    //Creating the object of "Object" class
    private static final Object LOCK = new Object();

    public static void main(String[] args) throws InterruptedException {

        //Creating the object of current class i.e. thread
        ThreadWaitDemo th = new ThreadWaitDemo();

        th.sleep(1000);  //thread goto sleep for 1 seconds i.e. it is called after 1 secong

        System.out.println("Thread " + Thread.currentThread().getName() + " is woken after sleeping for 1 second");
        synchronized (LOCK)
        {
            LOCK.wait(3000);  //the below statement runs after 3 seconds i.e. it waits for 3 seconds
            System.out.println("Thread is waited for 3 seconds");
        }

    }
}
