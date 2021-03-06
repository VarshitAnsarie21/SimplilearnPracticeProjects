package com.company.phase1.assistedprojects.accessmodifiers;

class PrivateDemo{     // this class showing the "private access modifier" functionality
    private int num = 10;

    private void showNumber(){
        System.out.println(num);
    }
}

public class PrivateAccessModifierDemo {

    public static void main(String[] args) {
        PrivateDemo obj = new PrivateDemo();
        /*
         System.out.println(obj.num); --> 'num' is not accessible because its private variable of class
         obj.showNumber(); --> method declared with 'private' access modifier
        */
    }
}
