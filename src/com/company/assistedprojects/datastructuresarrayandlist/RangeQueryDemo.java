package com.company.assistedprojects.datastructuresarrayandlist;

import java.util.Scanner;

class RangeOperation{
    public static int sumRange(int[] arr, int l, int j) {
        int sum = 0;
        for (int i = l; i <= j; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int sumRange1(int[] arr, int l, int r) {

        // Populating pre array
        int[] pre = new int[arr.length];
        pre[0] = arr[0];

        for(int i=1; i<arr.length; i++) {
            pre[i] = arr[i] + pre[i-1];
        }

        return pre[r] -pre[l-1];

    }
}

public class RangeQueryDemo {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Please enter value of l:");
            int l = sc.nextInt();

            System.out.println("Please enter value of r:");
            int r = sc.nextInt();

            System.out.println("Result:"+RangeOperation.sumRange1(arr, l, r));
            System.out.println("Result:"+RangeOperation.sumRange(arr, l, r));
        }
    }
}
