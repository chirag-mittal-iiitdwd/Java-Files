package com.company;

public class method {
    static int logic(int x,int y){
        int z=0;
        if(x>y){
            x=x+y;
        }
        else{
            z=(x+y)*5;
        }
        return z;
    }
    int add(int x,int y){
        return x+y;
    }
    public static void main(String[]args){
        int a=5;
        int b=7;
        // Using static way to call a method
        System.out.println(logic(a,b));

        // Calling non  static method
        method obj=new method();
        int x=obj.add(a,b);
        System.out.println(x);
    }
}
