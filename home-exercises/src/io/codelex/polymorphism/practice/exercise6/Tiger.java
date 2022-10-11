package io.codelex.polymorphism.practice.exercise6;

public class Tiger extends Felime {
    private String livingRegion;

    public Tiger(String animalName, String animalType, Double animalWeight, Integer foodEaten, String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
    }

    @Override
    void makeSound() {
        System.out.println("Roar");
    }

    @Override
    void eat(String typeOfFood, Integer num) {
        if (typeOfFood.equals("Meat")) {
            super.addFood(num);
        } else System.out.println("Tigers don't eat that type of food!");
    }
}
