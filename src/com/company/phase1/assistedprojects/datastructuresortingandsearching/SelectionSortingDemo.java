package com.company.phase1.assistedprojects.datastructuresortingandsearching;

import java.util.Scanner;

public class SelectionSortingDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements ypu want to insert into array:");
        int arrayLength= sc.nextInt();

        int[] array = new int[arrayLength];
        System.out.println("\nEnter the elements into array: ");
        for (int i=0; i<arrayLength; i++){
            array[i] = sc.nextInt();
        }

        System.out.println("\nArray before sorting: ");
        for(int arr:array){
            System.out.print(arr+" ");
        }

        selectionSort(array);

        System.out.println("Array after sorting:");
        for(int arr:array){
            System.out.print(arr+" ");
        }
    }

    public static void selectionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int index =i;

            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[index]){
                    index = j;
                }
            }

            int smallNumber = arr[index];
            arr[index]= arr[i];
            arr[i]= smallNumber;
        }
    }
}
