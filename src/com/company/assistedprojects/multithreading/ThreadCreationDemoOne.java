package com.company.assistedprojects.multithreading;

class MultiThreadOne extends Thread{
    public void run(){
        System.out.println("Thread is created and running");
    }
}

public class ThreadCreationDemoOne {
    public static void main(String[] args) {
        MultiThreadOne thread = new MultiThreadOne();
        thread.start();
    }
}
