package com.walking.animalsInheritance.task2;

public class Cat extends Animal{
    private final String says="meow";
    private void meow(){
        System.out.println(says);
    }
    @Override
    public void hello(){
        System.out.print("Cat says ");meow();
    }
}
