package io.codelex.polymorphism.practice.exercise6;

public class Cat extends Felime {
    private final String breed;

    public Cat(String animalName, String animalType, Double animalWeight, Integer foodEaten, String livingRegion, String breed) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
        this.breed = breed;
    }

    @Override
    void makeSound() {
        System.out.println("Meow");
    }

    @Override
    void eat(String typeOfFood, Integer num) {
        if (typeOfFood.equals("Vegetable") || typeOfFood.equals("Meat")) {
            super.addFood(num);
        } else System.out.println("Cats don't eat that type of food!");
    }
}




