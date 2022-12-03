package com.walking.animalsInheritance.task2;

public class Dog extends Animal{
    String says="woof";
    public void woof(){
        System.out.println(says);
    }
    public void hello(){
        woof();
    }
}
