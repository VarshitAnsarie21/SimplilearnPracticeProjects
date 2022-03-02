package com.company.assistedprojects.datastructuresortingandsearching;

import java.util.Scanner;
import java.util.Arrays;

public class ExponentialSearchingDemo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int choice;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Please enter element to search:");

            int numberToFind = sc.nextInt();

            int result = ExponentialSearchingDemo.exponentialSearch(arr, numberToFind);
            if (result < 0) {
                System.out.println("\nElement not found in array:");
            } else {
                System.out.println("\nElement found in array at index :" + result);
            }

            System.out.println("\nPress any number to continue.");
            System.out.println("Press '0' to Stop.");
            choice = sc.nextInt();

        } while (choice != 0);

        System.out.println("\nSearching has been done");
    }

    public static int exponentialSearch(int[] arr, int number) {
        int n = arr.length;

        if (arr[0] == number) {
            return 0;
        }

        int i = 1;
        while(i<n && arr[i] <= number) {
            i *=2;
        }

        return Arrays.binarySearch(arr, i/2, Math.min(i, n), number);
    }
}
