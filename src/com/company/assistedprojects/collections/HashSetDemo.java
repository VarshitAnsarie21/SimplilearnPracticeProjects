package com.company.assistedprojects.collections;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String args[]){
        //HashSet Example --> in this value should be unique
        HashSet<String> nameSet = new HashSet<>(); //creating HashSet object

        nameSet.add("Harry");
        nameSet.add("Perry");
        nameSet.add("Nathan");
        nameSet.add("Harry");

        //Using the iterator to iterate the nameSet and printing its values
//        Iterator itr = salaryList.iterator();
//
//        while (itr.hasNext()){
//            System.out.println(itr.next());
//        }

        System.out.println("List of names: ");
        //We can also use "forEach" loop to iterate through the HashSet
        for (String arr: nameSet){
            System.out.println(arr);
        }
    }
}
