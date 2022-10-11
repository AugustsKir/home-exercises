package io.codelex.polymorphism.practice.exercise6;

public class Mouse extends Mammal {
    public Mouse(String animalName, String animalType, Double animalWeight, Integer foodEaten, String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
    }


    @Override
    void makeSound() {
        System.out.println("Peep");
    }

    @Override
    void eat(String typeOfFood, Integer num) {
        if (typeOfFood.equals("Vegetable")) {
            super.addFood(num);
        } else System.out.println("Mouses don't eat that type of food!");
    }
}
