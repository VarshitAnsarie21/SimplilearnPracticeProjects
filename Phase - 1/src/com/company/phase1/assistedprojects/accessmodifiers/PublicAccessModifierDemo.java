package com.company.phase1.assistedprojects.accessmodifiers;

class PublicDemo{ // this class showing the "Public access modifier" functionality
    void showMessage(){
        System.out.println("This is Public modifier");
    }
}

public class PublicAccessModifierDemo {
    public static void main(String[] args) {
        PublicDemo obj1 = new PublicDemo();
        obj1.showMessage(); // we can call method or variable with public modifier anywhere using obj
    }
}
