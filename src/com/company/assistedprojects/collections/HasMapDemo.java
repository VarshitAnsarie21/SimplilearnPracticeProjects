package com.company.assistedprojects.collections;

import java.util.HashMap;
import java.util.Map;

/*
    getKey() --> To get the key of elements
    getValue() --> To get the value of elements

    Map.Entry --> This interface contains the getKey() and getValue() methods
    entrySet() --> This method of Map interface to get the instance of Map.Entry
 */

public class HasMapDemo {
    public static void main(String args[]){
        //HashMap Example --> only display the values that is not repeating
        HashMap<Integer,String> nations = new HashMap<>(); //creating arrayList object

        nations.put(1, "America");// put is used to insert the elements into map
        nations.put(2, "Germany");
        nations.put(3, "India");
        nations.put(1, "America");//trying to insert duplicate value

        System.out.println("List of nations are: ");
        //We can also use "forEach" loop to iterate through the list
        for (Map.Entry arr: nations.entrySet()){
            System.out.println(arr.getKey()+" "+arr.getValue());
        }
    }
}
