package com.company.phase1.assistedprojects.arrayexample;

public class OneDimensionalArrayDemo {
    public static void main(String args[]){

        //One Dimensional Array
        int arr[] = new int[5]; //declaration and instantiation

        arr[0]=10;//initialization
        arr[1]=20;
        arr[2]=70;
        arr[3]=40;
        arr[4]=50;

        System.out.println("Elements of array are:");

        //traversing array
        for(int array: arr){
            System.out.println(array);
        }

    }
}
