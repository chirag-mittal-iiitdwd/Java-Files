package com.company;

interface Bycycle{
    int a=45;
    void decrement(int slowDown);
    void increment(int fastUp);
}

class AvonCycle implements Bycycle{
    int c=45;
    public void decrement(int slowDown) {
        System.out.println("Cycle is now running at slower speed");
    }

    public void increment(int fastUp){
        System.out.println("Cycle is now running at a faster speed");
    }
}

public class interfaces {
    public static void main(String[] args) {
        AvonCycle samurai=new AvonCycle();
        samurai.decrement(1);
        samurai.increment(2);
        System.out.println(samurai.c);
        samurai.c++;
        System.out.println(samurai.c);
        System.out.println(Bycycle.a);
//        Bycycle.a++; // Cannot update the value of a variable in Bycycle
    }
}
