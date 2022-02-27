package com.company.assistedprojects.collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String args[]){
        //LinkedHashMap Example
        LinkedHashMap<String,String> cricketPlayers = new LinkedHashMap<>(); //creating LinkedHashMap object

        cricketPlayers.put("Second", "Sachin");// put is used to insert the elements into map
        cricketPlayers.put("First", "Watson");
        cricketPlayers.put("Third", "Williamson");

        System.out.println("List of cricket players are: ");
        //We can also use "forEach" loop to iterate through the list
        for (Map.Entry arr: cricketPlayers.entrySet()){
            System.out.println(arr.getKey()+" "+arr.getValue());
        }
    }
}
