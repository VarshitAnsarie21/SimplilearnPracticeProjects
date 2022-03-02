package com.company.assistedprojects.datastructuresortingandsearching;

import java.util.Scanner;

class MergeSortOperation{

    void merge(int arr[], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        int L[] = new int [n1];
        int R[] = new int [n2];

        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i)
            L[i] = arr[l + i];
        for (int j=0; j<n2; ++j)
            R[j] = arr[m + 1+ j];

        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }else {
                arr[k] = R[j];
                j++;
            }

            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    void sort(int arr[], int l, int r) {

        if (l < r) {
            int m = (l+r)/2;

            sort(arr, l, m);
            sort(arr , m+1, r);

            merge(arr, l, m, r);
        }
    }
}

public class MergeSortingDemo {
    public static void main(String[] args) {

        MergeSortOperation obj = new MergeSortOperation();

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
