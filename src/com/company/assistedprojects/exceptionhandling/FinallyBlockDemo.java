package com.company.assistedprojects.exceptionhandling;

public class FinallyBlockDemo {
    public static void main(String[] args) {
        int num1 = 45;
        int num2 = 0;
        int result = 0;

        try{
            result = num1 / num2;

        }catch(ArithmeticException Ex){
           System.out.println("Exception is : " + Ex.getMessage());

        }finally {
           System.out.println("The result is : " + result);
        }
    }

}
