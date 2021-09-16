package com.company;
class MyEmployee{
    private int id;
    private String name;
    public void setName(String n){
        name=n;
    }
    public int getId(){
        return id;
    }
}
public class accessModifiers {
    public static void main(String[] args) {
        MyEmployee chirag=new MyEmployee();
    }
}
