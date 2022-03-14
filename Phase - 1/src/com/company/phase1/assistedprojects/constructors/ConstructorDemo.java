package com.company.phase1.assistedprojects.constructors;

class Employee{
    public int salary;
    public String name;

    //Declaring default constructor manually but if you not define it manually then there is a default constructor automatically in every class
    Employee(){
        this.name = "Mathew";
        this.salary = 280000;
    }

    //Declaring parameterised constructor, it assigns the value to data members of class passed by object at the time of object creation
    Employee(int salary, String name){
        this.name = name;
        this.salary = salary;
    }

    void showDetails(){
        System.out.println("Name of Employee: "+this.name);
        System.out.println("Salary of Employee: "+this.salary);
    }
}

public class ConstructorDemo {
    public static void main(String args[]){

        //creating the object and it is calling the default constructor
        Employee emp1 = new Employee();

        //creating the object and it is calling the parameterised constructor because we are passing values to constructor
        Employee emp2 = new Employee(300000, "John");

        emp1.showDetails();
        emp2.showDetails();
    }
}
