package com.company.practiceprojects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class LISOperation {

    //Creating the function that find the longest increasing subsequence
    static List<Integer> findLIS(int[] arr) {

        //Creating object of list type which takes integer value
        List<List<Integer>> lisObj = new ArrayList<>();

        //adding values of array that passed as argument into arrayList
        for (int i = 0; i < arr.length; i++) {
            lisObj.add(new ArrayList<>());
        }

        //adding zeroth element of array at 0 index
        lisObj.get(0).add(arr[0]);

        //finding the longest increasing subsequence
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j] && lisObj.get(i).size() < lisObj.get(j).size() + 1) {
                    lisObj.set(i, new ArrayList<>(lisObj.get(j)));
                }
            }
            lisObj.get(i).add(arr[i]);
        }

        //making another array of the longest increasing subsequence
        List<Integer> longest = lisObj.get(0);
        for (List<Integer> integers : lisObj) {
            if (longest.size() < integers.size()) {
                longest = new ArrayList<>(integers);
            }
        }
        return longest; //return array of the longest increasing subsequence
    }
}

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {

        int arraySize;

        Scanner sc =new Scanner(System.in);

        //Taking the input for length of array
        System.out.println("Enter the numbers of elements you want to add in array:");
        arraySize = sc.nextInt();

        //declaring the array of size entered by user
        int[] array = new int[arraySize];

        //Taking the elements for array as input from user
        System.out.println("Enter the values in array:");
        for(int i=0; i<arraySize; i++){
            array[i] = sc.nextInt();
        }

        //Printing the elements of array that is entered by user
        System.out.println("Elements of array are: ");
        for (int arr: array){
            System.out.print(arr+" ");
        }

        System.out.println();

        System.out.println("\nThe longest increasing subsequence is:");
        System.out.println(LISOperation.findLIS(array)); //calling the function that find the longest increasing subsequence
    }
}
