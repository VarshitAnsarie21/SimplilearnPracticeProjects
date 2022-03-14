package com.company.phase1.assistedprojects.stringexamples;

public class StringsDemo {
    public static void main(String args[]){
        //methods of strings
        System.out.println("Methods of Strings");

        String sl = new String("Hello World");//creating String object i.e. "String" class object
        System.out.println();

        //length() --> Gives the length of a string
        System.out.println("Length of String is: "+sl.length());
        System.out.println();

        //substring() --> returns a part of the string
        String sub=new String("Welcome");
        System.out.println(sub.substring(2)); //returns string from index "2" i.e. from letter "l"
        System.out.println();

        //compareTo() --> compares the given string with the current string n the basis of the Unicode value of each character in the strings.
        String s1 = "hello";
        String s2 = "hello";
        String p1 = "sello";
        String p2 = "flag";
        System.out.println(s1.compareTo(s2));//0 because both are equal
        System.out.println(s1.compareTo(p1));
        System.out.println(s1.compareTo(p2));
        System.out.println();

        //IsEmpty() --> checks if the input string is empty or not.
        String s4="";
        System.out.println(s4.isEmpty()); //if empty gives "true", if not it gives "false"
        System.out.println();

        //toLowerCase() --> returns the string in lowercase letter
        String s5 = "Hello";
        System.out.println(s1.toLowerCase());
        System.out.println();

        //replace() --> returns the string in uppercase letter
        String s6 = "Heldo";
        String replace=s2.replace('d', 'l');
        System.out.println(replace);
        System.out.println();

        //equals() --> compares the two given strings based on the content of the string
        String x = "Welcome to Java";
        String y = "WeLcOmE tO JaVa";
        System.out.println(x.equals(y));
        System.out.println();

        System.out.println("Creating StringBuffer");
        //Creating StringBuffer and append method
        StringBuffer s = new StringBuffer("Welcome to Java!"); //class is used to create mutable (modifiable) String objects
        s.append("Enjoy your learning");
        System.out.println(s);
        System.out.println();

        //insert method
        s.insert(0, 'w');
        System.out.println(s);
        System.out.println();

        //replace method
        StringBuffer sb = new StringBuffer("Hello");
        sb.replace(0, 2, "hEl");
        System.out.println(sb);
        System.out.println();

        //delete method
        sb.delete(0, 1);
        System.out.println(sb);
        System.out.println();

        //StringBuilder
        System.out.println("Creating StringBuilder");
        StringBuilder sb1 = new StringBuilder("Happy");
        sb1.append("Learning");
        System.out.println(sb1);

        System.out.println(sb1.delete(0, 1));

        System.out.println(sb1.insert(1, "Welcome"));

        System.out.println(sb1.reverse());
        System.out.println();

        //conversion
        System.out.println("Conversion of Strings to StringBuffer and StringBuilder");

        String str = "Hello";

        // conversion from String object to StringBuffer
        StringBuffer sbr = new StringBuffer(str);
        sbr.reverse();
        System.out.println("String to StringBuffer");
        System.out.println(sbr);

        // conversion from String object to StringBuilder
        StringBuilder sbl = new StringBuilder(str); //create mutable (modifiable) String
        sbl.append("world");
        System.out.println("String to StringBuilder");
        System.out.println(sbl);

    }
}
