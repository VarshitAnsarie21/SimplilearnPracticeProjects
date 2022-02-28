package com.company.assistedprojects.multithreading;

//Creation of thread using "Thread" class

class MultiThreadOne extends Thread{

    //run() --> It is used to perform action for a thread.
    public void run(){
        System.out.println("Thread is created and running");
    }
}

public class ThreadCreationDemoOne {
    public static void main(String[] args) {

        //Creating the object of class i.e. Thread
        MultiThreadOne thread = new MultiThreadOne();

        //start() --> starts the execution of the thread, JVM calls the run() method on the thread.
        //calling start method to invoking the thread
        thread.start();
    }
}
