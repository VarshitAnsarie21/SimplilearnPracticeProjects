package com.company.assistedprojects.datastructuresortingandsearching;

import java.util.Scanner;

public class BubbleSortingDemo {
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

        bubbleSort(array);

        System.out.println();

        System.out.println("Array after sorting:");
        for (int arr : array) {
            System.out.print(arr + " ");
        }
    }

    public static void bubbleSort(int[] arr){
        int len = arr.length;
        int temp = 0;

        for(int i=0; i<len; i++){
            for (int j=1; j<(len); j++){
                if(arr[j-1] > arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
