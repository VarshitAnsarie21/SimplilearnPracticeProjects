package com.company.phase1.assistedprojects.exceptionhandling;

public class TryCatchDemo {
    public static void main(String[] args){
        int num1 = 15;
        int num2 = 0;

        System.out.println("Starting the try-catch block");

        try {
            int result = num1/num2;
            System.out.println(result);
        } catch (Exception e){
            System.out.println("The exception is: "+e);
        } finally {
            System.out.println("This block will always execute");
        }

        System.out.println("End of try-catch block");
    }
}
