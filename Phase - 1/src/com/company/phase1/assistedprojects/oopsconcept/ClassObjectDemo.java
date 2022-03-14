package com.company.phase1.assistedprojects.oopsconcept;

class DogFeatures {
    String name;
    String breed;
    int age;
    String color;

    public DogFeatures(String name, String breed, int age, String color) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }

    public void printDetails() {
        System.out.println("Hi my name is " + this.name + ".\nMy breed,age and color are " + this.breed + ", " + this.age + ", and" + this.color + ".");
    }
}

public class ClassObjectDemo {
    public static void main(String[] args){
        DogFeatures obj = new DogFeatures("Harry", "pub", 12, "Brown");
    }
}
