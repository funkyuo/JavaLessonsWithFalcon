package com.walking.animalsInheritance.task2;

public class Cow extends Animal {
    String says = "moo";
    public void moo() {
        System.out.println(says);
    }
    @Override
    public void hello() {
        System.out.print("Cow says ");moo();
    }
}
