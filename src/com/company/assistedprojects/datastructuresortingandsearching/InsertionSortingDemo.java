package com.company.assistedprojects.datastructuresortingandsearching;

import java.util.Scanner;

public class InsertionSortingDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements ypu want to insert into array:");
        int arrayLength = sc.nextInt();

        int[] array = new int[arrayLength];
        System.out.println("\nEnter the elements into array: ");
        for (int i = 0; i < arrayLength; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("\nArray before sorting: ");
        for (int arr : array) {
            System.out.print(arr + " ");
        }

       insertionSort(array);

        System.out.println();

        System.out.println("Array after sorting:");
        for (int arr : array) {
            System.out.print(arr + " ");
        }
    }

    public static void insertionSort(int[] arr){

        int len = arr.length;

        for(int j=1; j<len; j++){
            int key = arr[j];
            int i = j-1;
            while ((i > -1) && (arr[i] > key)){
                arr[i+1] = arr[i];
                i--;
            }

            arr[i+1] = key;
        }
    }
}
