package com.company;

import java.util.Locale;
import java.util.Scanner;
public class strings {
    public static void main(String args[]){
        int [] arr;
        arr = new int [3];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++){
            System.out.print("Enter the number : ");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<3;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n");
        String x="Hello";
        System.out.println(x);
        System.out.println(x.length());
        System.out.println(x.toLowerCase());
        System.out.println(x.toUpperCase(Locale.ROOT));

        String nonTrimmedString="  Chirag   ";
        System.out.println(nonTrimmedString.trim());
    }
}
