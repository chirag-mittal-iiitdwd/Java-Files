package com.company;

abstract class Base2{
    public Base2(){
        System.out.println("Mai base2 ka constructor hoon");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
}

class Child2 extends Base2{
    @Override
    public void greet(){
        System.out.println("Good Morning");
    }
}

public class abstract_ {
    public static void main(String[] args) {

    }
}
