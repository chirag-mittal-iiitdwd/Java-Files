package com.company;

import java.util.Locale;

public class strings {
    public static void main(String args[]){
        String x="Hello";
        System.out.println(x);
        System.out.println(x.length());
        System.out.println(x.toLowerCase());
        System.out.println(x.toUpperCase(Locale.ROOT));

        String nonTrimmedString="  Chirag   ";
        System.out.println(nonTrimmedString.trim());
    }
}
