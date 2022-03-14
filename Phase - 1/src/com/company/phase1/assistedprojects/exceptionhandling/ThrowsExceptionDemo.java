package com.company.phase1.assistedprojects.exceptionhandling;

public class ThrowsExceptionDemo {
    void Division() throws ArithmeticException {
        int num1 = 45;
        int num2 = 0;
        int result;
        result = num1 / num2;
        System.out.println("The result is : " + result);
    }
    public static void main(String[] args) {

        ThrowsExceptionDemo thExc = new ThrowsExceptionDemo();

        try {
            thExc.Division();
        }catch(ArithmeticException Ex) {
            System.out.println("Exception is : " + Ex.getMessage());
        }

        System.out.println("End of program.");
    }

}
