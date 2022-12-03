package com.walking.animalsInheritance.task1;

public class Dog extends Animal{
    private Dog(){
        System.out.println("I'am a dog");
    }
    public Dog(String color){
        this();
        System.out.println("I'am a " + color + "dog");
    }
}
