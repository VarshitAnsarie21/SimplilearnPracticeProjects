package com.company.phase1.assistedprojects.exceptionhandling;

public class ThrowCustomExceptionDemo {
    public static void main(String[] args) {

        int num1 = 45;
        int num2 = 0;
        int result;

        try {
            if(num2==0)
                throw(new ArithmeticException("Can't divide by zero."));
            else {
                result = num1 / num2;
                System.out.println("The result is : " + result);
            }
        }catch(ArithmeticException Ex) {
            System.out.println("Exception is : " + Ex.getMessage());
        }

        System.out.println("End of try-catch.");
    }
}
