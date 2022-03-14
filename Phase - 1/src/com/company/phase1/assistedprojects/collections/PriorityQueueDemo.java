package com.company.phase1.assistedprojects.collections;

import java.util.Iterator;
import java.util.PriorityQueue;

/*
  element() --> Return head element and not remove.This throws exception if queue is empty.<br/>
  peek() --> Return head element and not remove. Return null if queue is empty.<br>

  poll() --> Return head element and remove. Return null if queue is empty<br/>
  remove() --> Return head element and remove. Throws exception if queue is empty<br>
 */

public class PriorityQueueDemo {
    public static void main(String args[]){

        //PriorityQueue Example
        PriorityQueue<String> names = new PriorityQueue<>(); //creating PriorityQueue object

        names.add("Amit");
        names.add("Raj");
        names.add("Jai");
        names.add("Vijay");

        //Both statements give the peek element i.e. first element of queue
        System.out.println(names.element());
        System.out.println(names.peek());
        System.out.println();

        System.out.println("List of names are: ");

        //Using the iterator to iterate the names and printing its values
        Iterator itr = names.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        names.remove();
        names.poll();

        System.out.println();
        System.out.println("Modified list of names are: ");

        //We can also use "forEach" loop to iterate through the Queue
        for (String arr: names){
            System.out.println(arr);
        }

    }
}
