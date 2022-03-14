package com.company.phase1.assessmentproject;

import java.util.Scanner;
import java.io.IOException;

public class LockerLtd {

    public static void main(String[] args) throws IOException {
        int ch=0, choice=0;
        Scanner sc =new Scanner(System.in);

        System.out.println("\t**********************");
        System.out.println("\t Welcome to LockedMe.com ");
        System.out.println("\t By, Locker Pvt Ltd.");
        System.out.println("\t**********************");

        while(true) {
            System.out.println("\nPlease choose one of the following options :");
            System.out.println("1. List Current Files");
            System.out.println("2. Business Operations");
            System.out.println("3. Close Application");
            try{
                ch = sc.nextInt();
            }
            catch(Exception e) {
                System.out.println("Null Exception occurred");
            }

            switch(ch) {
                case 1: //List function feature to list all files in ascending order.
                    BusinessOperations.listFiles();
                    break;

                case 2:

                    System.out.println("\nPlease choose one of the following business operation you want to perform :");
                    System.out.println("1. Add a File");
                    System.out.println("2. Delete a File");
                    System.out.println("3. Search for a File");
                    try{
                        choice = sc.nextInt();
                    }
                    catch(Exception e) {
                        System.out.println("Null Exception occurred");
                    }

                    switch(choice) {
                        case 1:
                            //Creation of a file takes place
                            System.out.print("\nInput the name of the file you want to create (write the full name, eg: 'file.txt'): ");
                            String fileCreate = sc.next();

                            // Calling the function to create the file
                            BusinessOperations.createFile(fileCreate);
                            break;

                        case 2:
                            //deletion of a file takes place
                            System.out.print("\nInput the name of the file you want to delete (write the full name, eg: 'file.txt'): ");
                            String fileDelete = sc.next();

                            // Calling the function to delete the file
                            BusinessOperations.deleteFile(fileDelete);
                            break;

                        case 3:
                            //Search for a file takes place
                            System.out.print("\nInput the name of the file you want to search (write the full name, eg: 'file.txt'): ");
                            String fileSearch = sc.next();

                            // Calling the function to search the file
                            BusinessOperations.searchFile(fileSearch);
                            break;

                        default:
                            //In the case of unprecedented input execute this
                            System.out.println("\nInvalid Choice ! you input the wrong option.\n");
                            break;
                    }
                    break;

                case 3:

                    //Voluntarily exiting the application
                    sc.close();
                    System.out.println("\nThank you for using the application");
                    System.out.println("It was a nice time to have you here! See you again...");
                    System.exit(1);
                    break;

                default:
                    //In the case of unprecedented input execute this
                    System.out.println("\nOops! Invalid Input, Select within the range of 1-3");
                    break;
            }
        }
    }
}
