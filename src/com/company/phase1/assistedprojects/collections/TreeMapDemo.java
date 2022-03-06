package com.company.phase1.assistedprojects.collections;

import java.util.TreeMap;
import java.util.Collection;
import java.util.Set;

public class TreeMapDemo {
    public static void main(String[] args) {
        //TreeMap Example --> displaying elements in ascending order of keys
        TreeMap<String, String> actors = new TreeMap<>(); //creating LinkedHashMap object

        actors.put("second", "Salman Khan"); // put is used to insert the elements into map
        actors.put("third", "Robert Downey Jr");
        actors.put("first", "Chris Evans");

        //Ctrl + Shift + O
        Set<String> keys = actors.keySet(); // taking the keys of map

        System.out.println("The Keys of map are: ");
        //iterating the keys of map
        for(String key : keys) {
            System.out.println(key);
        }

        Collection<String> arrayActors = actors.values();

        System.out.println();
        System.out.println("List of actors are: ");
        for(String val : arrayActors) {
            System.out.println(val);
        }
    }
}
