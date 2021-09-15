package com.company;

public class varArgs {
    static int sum(int ...arr){
        int sum=0;
        for(int a:arr){
            sum+=a;
        }
        return sum;
    }
    public static void main(String[]args){

        System.out.println("The sum of n values is "+sum(7,3,5,2,6,3,5));
    }
}
