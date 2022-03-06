package com.company.phase1.assistedprojects.methods;

class MethodsExecution {
    public int myNum = 105;

    //creating the method which adds the two numbers of integer type
    int add(int i, int j){
        int z = i+j;
        return z;
    }

    //call by value method
    void showNumber(int num){
        this.myNum = this.myNum + num;
        System.out.println("number value in this method: "+ num);
    }

    //example of method overloading
    void multiplyNumbers(int num1, int num2){
        int result = num1*num2;
        System.out.println("Multiplication of two numbers is: "+result);
    }

    void multiplyNumbers(int num1, int num2, int num3){
        int result = num1*num2*num3;
        System.out.println("Multiplication of three numbers is: "+result);
    }
}

public class MethodsDemo {
    public static void main(String args[]){
        MethodsExecution obj = new MethodsExecution();

        System.out.println("Addition of numbers is: " + obj.add(5,8)); // calling the add() method and printing its result

        System.out.println("My number before calling showNumber: " + obj.myNum);
        obj.showNumber(15);
        System.out.println("My number after calling showNumber: " + obj.myNum);

        obj.multiplyNumbers(65,3);

        obj.multiplyNumbers(12,3,6);

    }
}
