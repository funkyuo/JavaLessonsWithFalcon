package com.walking.figuresPolymorphism.task2;

import com.walking.figuresPolymorphism.task2.model.*;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[]{new Cat(), new Dog(), new Cow()};
        soundAll(animals);
    }
    private static void soundAll(Animal... animals){
    for(Animal animal:animals){
        animal.sound();
    }

    }
}
