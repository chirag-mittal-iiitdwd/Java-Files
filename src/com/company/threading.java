package com.company;

class myThread extends Thread{
    @Override
    public void run(){
        while (true){
            System.out.println("My Thread is running");
            System.out.println("I am Happy");
        }
    }
}

class myThread2 extends Thread{
    @Override
    public void run(){
        while (true){
            System.out.println("My Thread2 is running 1214132");
            System.out.println("I am Sad");
        }
    }
}

public class threading {
    public static void main(String[] args) {
        myThread t1=new myThread();
        myThread2 t2=new myThread2();
        t1.start();
        t2.start();
    }
}
