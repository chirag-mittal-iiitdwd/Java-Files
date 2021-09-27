package com.company;
class phone{
    public void showTime(){
        System.out.println("The time is 8AM");
    }
    public void turnOn(){
        System.out.println("Turning on Phone ...");
    }
    public void condition(){
        System.out.println("Only the overridden functions and the functions in phone can be executed");
    }
}

class smartPhone extends phone{
    public void music(){
        System.out.println("Playing Music...");
    }
    public void turnOn(){
        System.out.println("Turning on Smartphone ...");
    }
}

public class dynamic_method_dispatch {
    public static void main(String[] args) {
        phone obj=new smartPhone();
        obj.showTime();
        obj.turnOn();
        obj.condition();
//        obj.music();  not allowed

        smartPhone x=new smartPhone();
        x.music();
    }
}