package com.company.phase1.assistedprojects.datastructuresarrayandlist;

import java.util.*;
import java.util.LinkedList;

public class QueueDemo {
    public static void main(String[] args) {

        Queue<String> locationsQueue = new LinkedList<>();

        locationsQueue.add("Kolkata");
        locationsQueue.add("Patna");
        locationsQueue.add("Delhi");
        locationsQueue.add("Gurgaon");
        locationsQueue.add("Noida");

        System.out.println("Queue is : ");
        for (String place: locationsQueue){
            System.out.print(place+" ");
        }

        System.out.println();

        System.out.println("Head of Queue : " + locationsQueue.peek());

        locationsQueue.remove();

        System.out.println("After removing Head of Queue : ");
        for (String place: locationsQueue){
            System.out.print(place+" ");
        }

        System.out.println();

        System.out.println("Size of Queue : " + locationsQueue.size());
    }
}
