package com.company.assistedprojects.collections;

import java.util.LinkedList;
//import java.util.Iterator;

public class LinkedListDemo {
    public static void main(String args[]){
        //LinkedList Example
        LinkedList<Integer> salaryList = new LinkedList<>(); //creating LinkedList object

        salaryList.add(25000);
        salaryList.add(35000);
        salaryList.add(50000);

        //Using the iterator to iterate the salaryList and printing its values
//        Iterator itr = salaryList.iterator();
//
//        while (itr.hasNext()){
//            System.out.println(itr.next());
//        }

        //We can also use "forEach" loop to iterate through the list
        for (int arr: salaryList){
            System.out.println(arr);
        }
    }
}
