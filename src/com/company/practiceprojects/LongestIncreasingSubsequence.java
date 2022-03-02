package com.company.practiceprojects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class LISOperation {

    static List<Integer> findLIS(int[] arr) {

        List<List<Integer>> cache = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            cache.add(new ArrayList<>());
        }

        cache.get(0).add(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j] && cache.get(i).size() < cache.get(j).size() + 1) {
                    cache.set(i, new ArrayList<>(cache.get(j)));
                }
            }
            cache.get(i).add(arr[i]);
        }

        List<Integer> longest = cache.get(0);
        for (List<Integer> integers : cache) {
            if (longest.size() < integers.size()) {
                longest = new ArrayList<>(integers);
            }
        }
        return longest;
    }
}

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        //        int[] arr = {0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15};
        int arraySize;

        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the numbers of elements you want to add in array:");
        arraySize = sc.nextInt();

        int[] array = new int[arraySize];

        System.out.println("Enter the values in array:");
        for(int i=0; i<arraySize; i++){
            array[i] = sc.nextInt();
        }

        System.out.println("Elements of array are: ");
        for (int arr: array){
            System.out.print(arr+" ");
        }

        System.out.println();

        System.out.println("\nThe longest increasing subsequence is:");
        System.out.println(LISOperation.findLIS(array));
    }
}
