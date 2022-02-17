package com.company.AssistedProjects.AccessModifiers;

class DefaultDemo{ // this class showing the "default access modifier" functionality
    void showMessage(){
        System.out.println("This is default modifier");
    }
}

public class DefaultAccessModifierDemo {

    public static void main(String[] args) {
        DefaultDemo obj1 = new DefaultDemo();
        obj1.showMessage(); // we can call method or variable with default modifier within the same package using obj
    }
}
