package com.company.phase1.assistedprojects.oopsconcept;

class Animal {

    public void eat(){
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {

    public void bark(){
        System.out.println("Dog is barking");
    }
}


public class InheritanceDemo {
    public static void main(String[] args) {
        Dog obj = new Dog();

        obj.bark();

        obj.eat();
    }
}
