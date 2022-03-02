package com.company.practiceprojects.fixbugsofapplicationproject;

import java.util.ArrayList;
import java.util.Scanner;

public class ApplicationDemo {
    public static void main(String[] args) {
        /*System.out.println("Hello World!");*/
        System.out.println("\n**************************************");
        System.out.println("\tWelcome to The Desk");
        System.out.println("**************************************");
        optionsSelection();
    }

    private static void optionsSelection() {
        Scanner sc = new Scanner(System.in);

        String[] arr = {"1. I wish to review my expenditure",
                "2. I wish to add my expenditure",
                "3. I wish to delete my expenditure",
                "4. I wish to sort the expenditures",
                "5. I wish to search for a particular expenditure",
                "6. Close the application"
        };

       // int[] arr1 = {1,2,3,4,5,6};
        int  sLen = arr.length;

        System.out.println();

        for (String s : arr) {
            // display the all the Strings mentioned in the String array
            System.out.println(s);
        }

        //ArrayList<Integer> arrayList = new ArrayList<Integer>();
        ArrayList<Integer> expenses = new ArrayList<>();

        expenses.add(1000);
        expenses.add(2300);
        expenses.add(45000);
        expenses.add(32000);
        expenses.add(110);

        //expenses.addAll(arrayList);

        System.out.println("\nEnter your choice:\t");
        int  options =  sc.nextInt();

        for(int j=1; j<=sLen; j++){
            if(options == j){
                switch (options){

                    case 1:
                        System.out.println("Your saved expenses are listed below: \n");
                        System.out.println(expenses+"\n");
                        optionsSelection();
                        break;

                    case 2:
                        System.out.println("Enter the value to add your Expense: \n");
                        int value = sc.nextInt();
                        expenses.add(value);
                        System.out.println("Your value is updated\n");
                        //expenses.addAll(arrayList);
                        System.out.println(expenses+"\n");
                        optionsSelection();
                        break;

                    case 3:
                        System.out.println("You are about the delete all your expenses! \nConfirm again by selecting the same option...\n");
                        int con_choice = sc.nextInt();
                        if(con_choice == options){
                            expenses.clear();
                            System.out.println(expenses+"\n");
                            System.out.println("All your expenses are erased!\n");
                        } else {
                            System.out.println("Oops... try again!");
                        }
                        System.out.println();

                        optionsSelection();
                        break;

                    case 4:
                        sortExpenses(expenses);
                        System.out.println();

                        optionsSelection();
                        break;

                    case 5:
                        int result = searchExpenses(expenses);

                        if(result < 0) {
                            System.out.println("Expense is not present in the list");
                        } else {
                            System.out.println("Expense is found at position: "+result+1);
                        }
                        System.out.println();
                        optionsSelection();
                        break;

                    case 6:
                        closeApp();
                        break;

                    default:
                        System.out.println("You have made an invalid choice!");
                        break;
                }
            }
        }
    }

    private static void closeApp() {
        System.out.println("Closing your application... \nThank you!");
    }

    private static int searchExpenses(ArrayList<Integer> arrayList) {
        Scanner sc = new Scanner(System.in);

        int len = arrayList.size();
        System.out.println("Enter the expense you need to search:\t");
        int number = sc.nextInt();
        //Complete the method
        for(int i=0; i<len; i++) {
            if(arrayList.get(i) == number) {
                return i;
            }
        }
        return -1;
    }

    private static void sortExpenses(ArrayList<Integer> arrayList) {
        //Complete the method. The expenses should be sorted in ascending order.
        int arrLength =  arrayList.size();
        int temp = 0;

        int[] expensesArray = new int[arrLength];

        for (int i=0; i<arrLength; i++){
            expensesArray[i] = arrayList.get(i);
        }

        for(int i=0; i<expensesArray.length; i++){
            for (int j=1; j<(expensesArray.length); j++){
                if(expensesArray[j-1] > expensesArray[j]){
                    temp = expensesArray[j-1];
                    expensesArray[j-1] = expensesArray[j];
                    expensesArray[j] = temp;
                }
            }
        }

        System.out.println("\nExpenses after sorting:");
        for (int arr : expensesArray) {
            System.out.print(arr + " ");
        }
    }
}
