package com.company.assistedprojects.collections;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String args[]){
        //LinkedHashSet Example
        LinkedHashSet<Integer> salarySet = new LinkedHashSet<>(); //creating LinkedHashSet object

        salarySet.add(25000);
        salarySet.add(35000);
        salarySet.add(50000);

        //Using the iterator to iterate the salarySet and printing its values
//        Iterator itr = salarySet.iterator();
//
//        while (itr.hasNext()){
//            System.out.println(itr.next());
//        }

        System.out.println("List of salaries: ");
        //We can also use "forEach" loop to iterate through the set
        for (int arr: salarySet){
            System.out.println(arr);
        }
    }
}
