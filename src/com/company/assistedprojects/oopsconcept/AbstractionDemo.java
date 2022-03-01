package com.company.assistedprojects.oopsconcept;

abstract class Shape{
    abstract void draw();
}

class Rectangle extends Shape{
    void draw() {
        System.out.println("drawing rectangle");
    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("drawing circle");
    }
}

public class AbstractionDemo {
    public static void main(String[] args){

        Shape obj = new Rectangle();
        obj.draw();

        Shape obj1 = new Circle();
        obj1.draw();
    }
}
