package com.company;

// There can be only one public class in any programme
class employee{
    int id;
    String name;
}
public class custom_class {
    public static void main(String[] args) {
        System.out.println("This is a custom class");

        // Instantiating a new Employee Object
        employee chirag =new employee();
        System.out.println(chirag.id+" "+chirag.name);

        // setting Properties
        chirag.id=12;
        chirag.name="Chirag";
        System.out.println(chirag.id+" "+chirag.name);
    }
}
