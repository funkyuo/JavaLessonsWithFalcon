package com.walking.animalsInheritance.task2;

public class Cat extends Animal{
    String says="meow";
    public void meow(){
        System.out.println(says);
    }
    public void hello(){
        meow();
    }
}
