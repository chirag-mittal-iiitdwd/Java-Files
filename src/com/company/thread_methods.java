package com.company;

class MyThread_1 extends Thread{
    @Override
    public void run(){
        while(true){
            System.out.println("Thank you 1");
        }
    }
}

class MyThread_2 extends Thread{
    @Override
    public void run() {
        System.out.println("Thank You 2");
    }
}

public class thread_methods {
    public static void main(String[] args) {
        MyThread_1 t1=new MyThread_1();
        MyThread_2 t2=new MyThread_2();
        t1.start();
        try{
            t1.join();
        }
        catch (Exception e){
            System.out.println(e);
        }
        t2.start();
    }
}
