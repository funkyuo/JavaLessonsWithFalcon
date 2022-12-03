package com.walking.animalsInheritance.task2;

public class Cow extends Animal {
    String says = "moo";
    public void moo() {
        System.out.println(says);
    }
    public void hello() {
        moo();
    }
}
