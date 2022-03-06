package com.company.phase1.assistedprojects.multithreading;

////Creation of thread using "Runnable" interface

class MultiThreadTwo implements Runnable{
    public void run(){
        System.out.println("Thread is created and running");
    }
}

public class ThreadCreationDemoTwo {
    public static void main(String[] args) {

        //Creating the object of class i.e. Thread
        MultiThreadTwo thread1 = new MultiThreadTwo();

        //Creating the object of Thread class and passing "thread1" to its constructor;
        Thread thread2 = new Thread(thread1);

        thread2.start();//start the thread by invoking start()
    }
}
