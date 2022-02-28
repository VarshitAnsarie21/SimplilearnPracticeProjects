package com.company.assistedprojects.multithreading;

public class ThreadSleepDemo extends Thread {

    //defining the run()
    public void run(){
        for(int i=0; i<5; i++){

            //Using try-catch block for handling the run time exception
            try {
                Thread.sleep(2000); //current thread will goto sleep for 2 seconds
            }catch (Exception e){
                System.out.println(e);
            }
            System.out.println(Thread.currentThread().getName()+" "+"value of i: "+i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        //Creating two threads
        ThreadSleepDemo th1 = new ThreadSleepDemo();
        ThreadSleepDemo th2 = new ThreadSleepDemo();

        th1.start(); //calling first thread

        th1.join();  //second thread will wait until first thread completes its process

        th2.start(); //calling second thread
     }
}
