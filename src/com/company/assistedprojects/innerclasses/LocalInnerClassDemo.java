package com.company.assistedprojects.innerclasses;

public class LocalInnerClassDemo {
    private int salary = 28000; //declaring private data member of class MemberInnerClassDemo i.e. outer class object

    void showSalary(){

        //Local inner class
        class EmployeeDetailInnerClass{
            void show(){
                System.out.println("The salary of employee is "+salary);
            }
        }

        EmployeeDetailInnerClass emp = new EmployeeDetailInnerClass(); // creating inner class object inside the method of outer class
        emp.show(); //Calling inner class method
    }


    public static void main(String args[]){

        //Creating outer class object i.e. LocalInnerClassDemo object
        LocalInnerClassDemo obj = new LocalInnerClassDemo();

        obj.showSalary(); //calling outer class method
    }
}
