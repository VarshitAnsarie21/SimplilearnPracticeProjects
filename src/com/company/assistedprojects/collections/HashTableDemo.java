package com.company.assistedprojects.collections;

import java.util.Hashtable;
import java.util.Map;

/*
   --> A Hashtable is an array of a list. Each list is known as a bucket. The position of the bucket is identified by calling the hashcode() method.
   --> A Hashtable contains values based on the key.
   --> Java Hashtable class contains unique elements.
   --> Java Hashtable class doesn't allow null key or value.
 */

public class HashTableDemo {
    public static void main(String args[]){
        //Hashtable Example --> it displays the value which is entered in the end and so on.
        Hashtable<Integer,String> footballPlayers = new Hashtable<>(); //creating Hashtable object

        footballPlayers.put(1, "Cristiano Ronaldo");// put is used to insert the elements into table
        footballPlayers.put(2, "Lionel Messi");
        footballPlayers.put(3, "Ferran Torres");
        footballPlayers.put(4, "Mohammed Salah");

        System.out.println("List of football players are: ");
        //We can also use "forEach" loop to iterate through the table
        for (Map.Entry arr: footballPlayers.entrySet()){
            System.out.println(arr.getKey()+" "+arr.getValue());
        }

        footballPlayers.remove(3);// removing the value which having the key "3"

        System.out.println();
        System.out.println("Modified List of football players are: ");

        for (Map.Entry arr: footballPlayers.entrySet()){
            System.out.println(arr.getKey()+" "+arr.getValue());
        }

    }
}
