package com.company.assistedprojects.exceptionhandling;

class MyException extends Exception{
    public static String message;

    MyException(String message){
        this.message = message;
    }

    public static void printExceptionMessage(){
        System.out.println("The exception is: "+message);
    }
}

public class ExceptionHandlersDemo {
    public static void main(String[] args){
        try {
            System.out.println("Starting of try block");
            throw new MyException("Invalid Operation !");
        } catch (MyException exception){
            System.out.println("Executing catch block");
            MyException.printExceptionMessage();
        }
    }
}
