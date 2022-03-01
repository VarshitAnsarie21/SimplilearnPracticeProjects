package com.company.assistedprojects.oopsconcept;

class StudentDetail {
    private String name;
    private int rollNo;
    private int age;

   public StudentDetail(String name, int rollNo, int age){
       this.name = name;
       this.rollNo = rollNo;
       this.age = age;
   }

    public int getAge(){
        return age;
    }

    public String getName() {
        return name;
    }

    public int getRoll() {
        return rollNo;
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        StudentDetail obj =  new StudentDetail("Matt", 21564, 15);

        System.out.println("Name of student: "+obj.getName());
        System.out.println("Age of student: "+obj.getAge());
        System.out.println("Roll no. of student: "+obj.getRoll());
    }
}
