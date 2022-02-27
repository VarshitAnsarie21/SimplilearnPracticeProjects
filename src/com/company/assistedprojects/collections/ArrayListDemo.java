package com.company.assistedprojects.collections;

import java.util.ArrayList;
//import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String args[]){
        //ArrayList Example
        ArrayList<String> nameList = new ArrayList<>(); //creating arrayList object

        nameList.add("Perry");
        nameList.add("Matt");
        nameList.add("Harry");

        //Using the iterator to iterate the nameList and printing its values
//        Iterator itr = nameList.iterator();
//
//        while (itr.hasNext()){
//            System.out.println(itr.next());
//        }

        //We can also use "forEach" loop to iterate through the list
        for (String arr: nameList){
            System.out.println(arr);
        }
    }
}
