package com.company.assistedprojects.datastructuresortingandsearching;

import java.util.Scanner;

public class BinarySearchingDemo {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int choice;

        Scanner sc = new Scanner(System.in);

        try {
            do {
                System.out.println("Please enter element to search:");

                int numberToFind = sc.nextInt();

                int result = BinarySearchingDemo.binarySearch(arr, numberToFind);
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

        }catch (Exception e){
            System.out.println("Exception found: "+e);
        }
    }

    public static int binarySearch(int[] arr, int number) {
        int start = 0;
        int length = arr.length;
        int mid = (start+length)/2;

        while(start <= length) {

            if(arr[mid] < number) {
                start=mid+1;
            } else if(arr[mid] == number) {
                return mid;
            } else {
                length = mid -1;
            }

            mid = (start+length)/2;
        }

        return -1;
    }
}
