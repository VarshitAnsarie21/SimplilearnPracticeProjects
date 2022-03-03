package com.company.practiceprojects.fixbugsofapplicationproject;

import java.util.ArrayList;
import java.util.Scanner;

public class ApplicationDemo {
    public static void main(String[] args) {
        //printing welcome message
        System.out.println("\n**************************************");
        System.out.println("\tWelcome to The Desk");
        System.out.println("**************************************");
        optionsSelection();
    }

    //function to perform task which is listed in string array below
    private static void optionsSelection() {
        Scanner sc = new Scanner(System.in);

        //list of the task
        String[] arr = {"1. I wish to review my expenditure",
                "2. I wish to add my expenditure",
                "3. I wish to delete my expenditure",
                "4. I wish to sort the expenditures",
                "5. I wish to search for a particular expenditure",
                "6. Close the application"
        };

       //taking length of array
        int  sLen = arr.length;

        System.out.println();

        for (String s : arr) {
            // display the all the Strings mentioned in the String array
            System.out.println(s);
        }

        //crating the arraylist of expenses
        ArrayList<Integer> expenses = new ArrayList<>();

        //adding the expenses into the array
        expenses.add(1000);
        expenses.add(2300);
        expenses.add(45000);
        expenses.add(32000);
        expenses.add(110);

        //enter the choice of task user want to perform
        System.out.println("\nEnter your choice:\t");
        int  options =  sc.nextInt();

        //looping the below statement to length of array
        for(int j=1; j<=sLen; j++){
            //if option matches the choice, that particular switch case will execute
            if(options == j){
                switch (options){

                    //Printing all the expenses in the list
                    case 1:
                        System.out.println("Your saved expenses are listed below: \n");
                        System.out.println(expenses+"\n");
                        optionsSelection();
                        break;

                    //add the new expense into array
                    case 2:
                        System.out.println("Enter the value to add your Expense: \n");
                        int value = sc.nextInt();
                        expenses.add(value);
                        System.out.println("Your value is updated\n");
                        //expenses.addAll(arrayList);
                        System.out.println(expenses+"\n");
                        optionsSelection();
                        break;

                    //Delete all the expenses present in the array
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

                    //sort all the expenses present in the array in ascending order
                    case 4:
                        sortExpenses(expenses);
                        System.out.println();

                        optionsSelection();
                        break;

                    //search for specific expense which is present in the array
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

                    //close the application
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

    //function to print the closing statement
    private static void closeApp() {
        System.out.println("Closing your application... \nThank you!");
    }

    //function to search for the expense entered by user
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

    //function to sort the expense array
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
