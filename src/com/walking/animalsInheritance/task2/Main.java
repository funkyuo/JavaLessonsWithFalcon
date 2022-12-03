package com.walking.animalsInheritance.task2;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Cow cow = new Cow();
        Animal[] animalsArr = {cat, dog, cow};
        animalsSays(animalsArr);
    }
    private static void animalsSays(Animal[] animals) {
        for (Animal animal : animals) {
            animal.hello();

        }
    }
}
