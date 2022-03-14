package com.company.phase1.assistedprojects.oopsconcept;

class ArithmeticOperations {
    public void multi(int num1, int num2) {
        int result = num1 * num2;
        System.out.println("Multiplication of two number is: " + result);
    }

    public void sumInteger(int num1, int num2, int num3) {
        int result = num1 + num2 + num3;
        System.out.println("Addition of three number is: " + result);
    }

    public void sumDouble(double num1, double num2) {
        double result = num1 + num2;
        System.out.println("Addition of two decimal point number is: " + result);
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        ArithmeticOperations obj = new ArithmeticOperations();

        System.out.println("Arithmetic operations is performing:");
        obj.sumInteger(51,23,85);
        obj.sumDouble(15.236, 25.654);
        obj.multi(15,98);
    }
}
