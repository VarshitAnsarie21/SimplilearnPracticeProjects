package com.company.PracticeProjects;

import java.util.*;

public class ArithmeticCalculator {
    public static void main(String args[]){
        double num1, num2, operationOutput;
        int choice;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the numbers on which you want to perform the operation");

        num1 = sc.nextDouble();
        num2 = sc.nextDouble();

        System.out.println("Enter the type operation you want to perform: ");
        System.out.println("Press 1 for 'ADDITION'");
        System.out.println("Press 2 for 'SUBTRACTION");
        System.out.println("Press 3 for 'MULTIPLICATION");
        System.out.println("Press 4 for 'DIVISION");

        choice = sc.nextInt();

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