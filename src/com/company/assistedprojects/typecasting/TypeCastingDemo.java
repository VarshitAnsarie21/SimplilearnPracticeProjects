package com.company.assistedprojects.typecasting;

public class TypeCastingDemo {

    public static void main(String[] args) {
        //Example of Widening or implicit typecasting
        int var1 = 20;
        float var2 = var1;       //implicit typecasting

        System.out.println(var1);
        System.out.println(var2);

        //Example of Narrowing or explicit typecasting
        double var3 = 20.55;
        int var4 = (int)var3;     //explicit typecasting

        //int var4 = var3; --> this shows the compile time error

        System.out.println(var3);
        System.out.println(var4);
    }
}