package io.codelex.polymorphism.practice.exercise6;

public abstract class Mammal extends Animal {
    private final String livingRegion;

    public Mammal(String animalName, String animalType, Double animalWeight, Integer foodEaten, String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten);
        this.livingRegion = livingRegion;
    }


    abstract void makeSound();


    abstract void eat(String typeOfFood, Integer num);
}
