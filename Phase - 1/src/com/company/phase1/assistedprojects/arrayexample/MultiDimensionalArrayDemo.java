package com.company.phase1.assistedprojects.arrayexample;

public class MultiDimensionalArrayDemo {
    public static void main(String args[]){

        //Multi Dimensional Array
        int arr[][] = new int[3][3]; //declaration of 2-D array with 3 rows and 3 columns

        arr[0][0]=1;
        arr[0][1]=2;
        arr[0][2]=3;
        arr[1][0]=4;
        arr[1][1]=5;
        arr[1][2]=6;
        arr[2][0]=7;
        arr[2][1]=8;
        arr[2][2]=9;

        System.out.println("Elements of array are:");

        //traversing array
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(arr[i][j]);//printing the row
            }
            System.out.println();//after end of every row, it moves the cursor to next line
        }
    }
}
