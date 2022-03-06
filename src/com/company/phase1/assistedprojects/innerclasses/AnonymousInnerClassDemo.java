package com.company.phase1.assistedprojects.innerclasses;

//To make anonymous class, we have declared the class as abstract
abstract class Customer{
     abstract void showCustomerDetail();
}

public class AnonymousInnerClassDemo {
    public static void main(String args[]){

       Customer obj = new Customer() { //defining the anonymous class
           @Override
           void showCustomerDetail() {
               System.out.println("Customer is having two products");
           }
       };

       obj.showCustomerDetail();//object of anonymous class
    }
}
