package io.codelex.polymorphism.practice.exercise6;

public class Zebra extends Mammal {
    public Zebra(String animalName, String animalType, Double animalWeight, Integer foodEaten, String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
    }

    @Override
    void makeSound() {
        System.out.println("Zebra sounds");
    }

    @Override
    void eat(String typeOfFood, Integer num) {
        if (typeOfFood.equals("Vegetable")) {
            super.addFood(num);
        } else System.out.println("Zebras don't eat that type of food!");
    }
}
