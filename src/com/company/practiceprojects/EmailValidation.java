package com.company.practiceprojects;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {

    //Default list of employees emailID's
    private final String[] employeeEmailsList = {
            "vikas@gmail.com",
            "matt@gmail.com",
            "samson@gmail.com",
            "chris@yahoo.com",
            "rohit20@yahoo.com",
            "virat18@yahoo.com"
    };

    boolean validateEmail(String emailID) {
        // rules or pattern for writing the valid email ID. We are regular expression for validation of emailID
        String emailPattern = "[a-zA-Z0-9!#$&'*+-/=?^_`{|}~]*@[a-zA-Z0-9][a-zA-Z0-9-]*[a-zA-Z0-9][.][a-zA-Z]*";

        //passing pattern for valid emailID to pattern class object
        Pattern ptr = Pattern.compile(emailPattern);

        //checking the pattern for valid email entered by user
        Matcher mat = ptr.matcher(emailID);

        //if entered Email ID is matches with existing email ID in the List, "if block" will be executed otherwise "else block".
        if (mat.matches()) {   //first checking for the pattern of emailID entered by user
             for (String s : employeeEmailsList) {

                 //checking the emailID which is existed in the list or not
                if (s.equalsIgnoreCase(emailID)) {
                    System.out.println("Employee Email ID Found");
                    return true;
                }
            }
            System.out.println("Email not recognized"); //if emailID not found, then this message will get printed
        } else {
            System.out.println("Invalid Email ID format"); //if entered emailID not matched with the pattern, then this message will get printed
        }
        return false;
    }

    public static void main(String[] args) {

        //Creating the EmailValidation class's object
        EmailValidation employee = new EmailValidation();
        Scanner sc = new Scanner(System.in);

        String employeeEmail;
        do {
            System.out.println("Enter your email:"); //taking input from user i.e. emailID
            employeeEmail = sc.next();
        }while (!employee.validateEmail(employeeEmail)); //This loop executed until user found the valid emailID existed in the given list
        System.out.println("Email Validation Process Finished !");
        sc.close();
    }
}
