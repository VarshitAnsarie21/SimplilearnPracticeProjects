package com.company.assistedprojects.collections;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String args[]){
        //TreeSet Example --> it shows list in sorted manner
        TreeSet<String> citySet = new TreeSet<>(); //creating TreeSet object

        citySet.add("London");
        citySet.add("Paris");
        citySet.add("New York");

        //Using the iterator to iterate the citySet and printing its values
//        Iterator itr = citySet.iterator();
//
//        while (itr.hasNext()){
//            System.out.println(itr.next());
//        }

        System.out.println("List of cities: ");
        //We can also use "forEach" loop to iterate through the set
        for (String arr: citySet){
            System.out.println(arr);
        }
    }
}
