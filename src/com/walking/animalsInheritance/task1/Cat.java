package com.walking.animalsInheritance.task1;

public class Cat extends Animal {
    private Cat() {
        System.out.println("I'am a cat");
    }

    public Cat(String color) {
        this();
        System.out.println("I'am a " + color + "cat");

    }
}

