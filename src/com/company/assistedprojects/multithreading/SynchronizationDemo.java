package com.company.assistedprojects.multithreading;

//Creating a class which prints the mathematical table
class Table{

    //defining the function to print table
    void printTable(int n) throws InterruptedException{
        synchronized (this){
            System.out.println("The Table of number "+n+" is:");
            for (int i=1; i<=10; i++){
                Thread.sleep(1000);
                System.out.println(n+"*"+i+" = "+n*i);
            }
        }
    }
}

class MyTableOne implements Runnable{
    Table table;

    public MyTableOne(Table t){
        this.table = t;
    }

    @Override
    public void run() {
        try {
            table.printTable(15);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}

class MyTableTwo implements Runnable{
    Table table;

    public MyTableTwo(Table t){
        this.table = t;
    }

    @Override
    public void run() {
        try {
            table.printTable(13);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}

public class SynchronizationDemo {
    public static void main(String[] args) throws InterruptedException {
        Table tbl = new Table();

        Thread th1 = new Thread(new MyTableOne(tbl));
        Thread th2 = new Thread(new MyTableTwo(tbl));

        th1.start();
        th2.start();
    }
}
