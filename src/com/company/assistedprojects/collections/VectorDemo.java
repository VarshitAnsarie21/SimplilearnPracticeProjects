package com.company.assistedprojects.collections;

//import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {
    public static void main(String args[]){

        //Vector Example
        Vector<Double> weightList = new Vector<>(); //creating Vector object

        weightList.add(53.25);
        weightList.add(35.6);
        weightList.add(86.5);

        //Using the iterator to iterate the weightList and printing its values
//        Iterator itr = weightList.iterator();
//
//        while (itr.hasNext()){
//            System.out.println(itr.next());
//        }

        //We can also use "forEach" loop to iterate through the list
        for (double arr: weightList){
            System.out.println(arr);
        }
    }
}
