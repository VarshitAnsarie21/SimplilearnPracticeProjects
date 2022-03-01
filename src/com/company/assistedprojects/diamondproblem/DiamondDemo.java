package com.company.assistedprojects.diamondproblem;

interface Drawable{
    void draw();
}

class Rectangle implements Drawable{
    public void draw(){
        System.out.println("drawing rectangle");
    }
}
class Circle implements Drawable{
    public void draw(){
        System.out.println("drawing circle");
    }
}

public class DiamondDemo {
    public static void main(String[] args) {

        Drawable obj = new Rectangle();
        obj.draw();

        Drawable obj1 = new Circle();
        obj1.draw();
    }
}
