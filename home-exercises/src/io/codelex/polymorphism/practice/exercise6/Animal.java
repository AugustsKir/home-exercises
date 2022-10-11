package io.codelex.polymorphism.practice.exercise6;

public abstract class Animal {
    private final String animalName;
    private final String animalType;
    private final Double animalWeight;
    private Integer foodEaten;

    public Animal(String animalName, String animalType, Double animalWeight, Integer foodEaten) {
        this.animalName = animalName;
        this.animalType = animalType;
        this.animalWeight = animalWeight;
        this.foodEaten = foodEaten;
    }

    abstract void makeSound();

    void addFood(int num) {
        foodEaten += num;
    }

    abstract void eat(String typeOfFood, Integer num);

    @Override
    public String toString() {
        return "Animal{" +
                "animalType='" + animalName + '\'' +
                ", animalName='" + animalType + '\'' +
                ", animalWeight=" + animalWeight +
                ", foodEaten=" + foodEaten +
                '}';
    }
}
