package com.company.assistedprojects.multithreading;

class MultiThreadTwo implements Runnable{
    public void run(){
        System.out.println("Thread is created and running");
    }
}

public class ThreadCreationDemoTwo {
    public static void main(String[] args) {
        MultiThreadTwo thread1 = new MultiThreadTwo();

        Thread thread2 = new Thread(thread1);

        thread2.start();
    }
}
