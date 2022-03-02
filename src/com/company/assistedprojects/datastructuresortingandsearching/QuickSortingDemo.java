package com.company.assistedprojects.datastructuresortingandsearching;

import java.util.Scanner;

class QuickSortOperation{
    int partition(int arr[], int low, int high) {

        int pivot = arr[high];
        int i = (low-1); // index of smaller element

        for (int j=low; j<high; j++) {
            if (arr[j] <= pivot) {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

    void sort(int arr[], int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }
}

public class QuickSortingDemo {
    public static void main(String[] args) {

        QuickSortOperation obj = new QuickSortOperation();

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

        obj.sort(array, 0, arrayLength - 1);

        System.out.println();

        System.out.println("Array after sorting:");
        for (int arr : array) {
            System.out.print(arr + " ");
        }
    }
}
