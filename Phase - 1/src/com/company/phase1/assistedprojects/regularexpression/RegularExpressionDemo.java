package com.company.phase1.assistedprojects.regularexpression;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegularExpressionDemo {
    public static void main(String args[]){
        String pattern = "[a-z]+";
        String str = "Regular Expressions";
        Pattern p = Pattern.compile(pattern);
        Matcher c = p.matcher(str);

        while (c.find())
            System.out.println( str.substring( c.start(), c.end() ) );
    }
}
