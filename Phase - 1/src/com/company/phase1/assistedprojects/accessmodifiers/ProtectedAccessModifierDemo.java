package com.company.phase1.assistedprojects.accessmodifiers;

class Demo{  // this class showing the "protected access modifier" functionality
    protected int num = 20;

    protected void showNum(){
        System.out.println(num);
    }
}

class ProtectedAccessModifierDemo extends Demo{ // this class inheriting demo class to use its protected member
    public static void main(String args[]){
        ProtectedAccessModifierDemo obj = new ProtectedAccessModifierDemo();
        obj.showNum();    //accessing protected member of demo class using object
    }
}

