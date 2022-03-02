package com.company.assistedprojects.datastructuresortingandsearching;

import java.io.IOException;
import java.util.Scanner;

public class LinearSearchingDemo {
    public static void main(String[] args) throws IOException {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int choice;

        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Please enter element to search:");

            int numberToFind = sc.nextInt();

            int result = LinearSearchingDemo.linearSearch(arr, numberToFind);

            if(result<0) {
                System.out.println("\nElement not found in array:");
            } else {
                System.out.println("\nElement found in array at index :"+result);
            }

            System.out.println("\nPress any number to continue.");
            System.out.println("Press '0' to Stop.");
            choice = sc.nextInt();

        }while(choice !=0);

        System.out.println("\nSearching has been done");
    }

    public static int linearSearch(int[] arr, int number) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == number) {
                return i;
            }
        }
        return -1;
    }
}
