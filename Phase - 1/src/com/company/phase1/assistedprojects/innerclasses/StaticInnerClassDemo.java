package com.company.phase1.assistedprojects.innerclasses;

public class StaticInnerClassDemo {
    static int salary = 300000;
    static String employee ="Matt Henry";

    static class InnerEmployeeClass{
        void showDetails(){
            System.out.println("Employee Name: "+employee);
            System.out.println("Employee salary: "+salary);
        }
    }

    public static void main(String args[]){
        StaticInnerClassDemo.InnerEmployeeClass obj = new StaticInnerClassDemo.InnerEmployeeClass();
        obj.showDetails();
    }
}
