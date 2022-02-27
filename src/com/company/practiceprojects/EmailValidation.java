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
        //String emailIDWithTwoDots = ".*[.]{2}.*"; //regex pattern for emailID consist of two consecutive dots
        String emailPattern ="[a-zA-Z0-9!#$&'*+-/=?^_`{|}~]*@[a-zA-Z0-9][a-zA-Z0-9-]*[a-zA-Z0-9][.][a-zA-Z]*"; // rules for writing the email ID

//        Pattern ptr = Pattern.compile(emailIDWithTwoDots);//passing the emailID to pattern check
//        Matcher mat = ptr.matcher(emailID);

//        if(mat.matches()) { //condition for checking the entered emailID for having 2 dots
//            System.out.println("Invalid email format ! Entered emailID is having two consecutive dots(.)");
//        }else {
        Pattern  ptr = Pattern.compile(emailPattern);//passing pattern for valid emailID
        Matcher    mat = ptr.matcher(emailID);
            if(mat.matches()) {
                for (String s : employeeEmailsList) {
                    if (s.equalsIgnoreCase(emailID)) {
                        System.out.println("Employee Email ID Found");
                        return true;
                    }
                }
                System.out.println("Email not recognized");
            }
            else {
                System.out.println("Invalid Email ID format");
            }
      //  }
        return false;
    }

    public static void main(String[] args) {
        EmailValidation employee = new EmailValidation();
        Scanner sc = new Scanner(System.in);
        String employeeEmail;
        do {
            System.out.println("Enter your email:");
            employeeEmail = sc.next();
        }while (!employee.validateEmail(employeeEmail));
        System.out.println("Email Validation Process Finished !");
        sc.close();
    }
}
