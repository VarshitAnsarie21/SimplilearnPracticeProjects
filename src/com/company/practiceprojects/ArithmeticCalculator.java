package com.company.practiceprojects;

import java.util.Scanner;

public class ArithmeticCalculator {
    public static void main(String args[]){

        //declaring the two numbers and storing the result in the third variable i.e. operation output
        double num1, num2, operationOutput;

        //declaring the variable for choice of operation which is entered by user
        int choice;

        //declaring the scanner class object
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the numbers on which you want to perform the operation");

        //taking inputs from user i.e. the two numbers
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();

        System.out.println("Enter the type operation you want to perform: ");
        System.out.println("Press 1 for 'ADDITION'");
        System.out.println("Press 2 for 'SUBTRACTION");
        System.out.println("Press 3 for 'MULTIPLICATION");
        System.out.println("Press 4 for 'DIVISION");

        //taking the input from user for the choice of arithmetic operation based on above instructions
        choice = sc.nextInt();

        //taking switch statement which takes the choice and performs the user opted operation
        switch (choice){
            case 1: operationOutput = num1 + num2;
                    System.out.println("The addition of two numbers is "+ num1 + " + "+num2 +" = "+ operationOutput );
                    break;

            case 2: operationOutput = num1 - num2;
                    System.out.println("The subtraction of two numbers is "+ num1 + " - "+num2 +" = "+ operationOutput );
                    break;

            case 3: operationOutput = num1 * num2;
                    System.out.println("The multiplication of two numbers is "+ num1 + " * "+num2 +" = "+ operationOutput );
                    break;

            case 4: operationOutput = num1 / num2;
                    System.out.println("The division of two numbers is "+ num1 + " / "+num2 +" = "+ operationOutput );
                    break;

            default:
                    System.out.println("You entered the wrong option !");
                    break;
        }
    }
}