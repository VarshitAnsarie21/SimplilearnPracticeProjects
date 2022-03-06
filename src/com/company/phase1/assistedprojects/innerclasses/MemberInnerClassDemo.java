package com.company.phase1.assistedprojects.innerclasses;

public class MemberInnerClassDemo {
    private int salary = 28000; //declaring private data member of class MemberInnerClassDemo i.e. outer class object

    //member inner class
    class EmployeeDetail{
        void showDetails(){ // method of member inner class i.e. EmployeeDetail
            System.out.println("The salary of employee is "+salary);
        }
    }

    public static void main(String args[]){

        //Creating outer class object
        MemberInnerClassDemo obj = new MemberInnerClassDemo();

        //Creating the object of inner class i.e. EmployeeDetail Object
        MemberInnerClassDemo.EmployeeDetail  emp = obj.new EmployeeDetail();

        emp.showDetails(); //calling inner class method
    }
}
