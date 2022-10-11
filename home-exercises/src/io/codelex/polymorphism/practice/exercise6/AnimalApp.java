package io.codelex.polymorphism.practice.exercise6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnimalApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Animal> animalList = new ArrayList<>();
        while (true) {
            System.out.println("Enter which animal would you like to create! - (Cat, Mouse, Tiger, Zebra). Enter End to exit!");
            String name = in.nextLine();
            if (name.equals("End")) {
                System.out.println(animalList);
                System.out.println("Shutting Down!");
                break;
            }
            switch (name) {
                case "Cat":
                    System.out.println("Enter information about the cat! (Seperate everything with commas) -> Example - Tom, Cat, 5.0, 2, USA, Persian");
                    String info = in.nextLine();
                    String[] arr = info.replace(" ", "").split(",");
                    Integer weight = Integer.valueOf(arr[3]);
                    Cat cat = new Cat("Cat", arr[1], Double.valueOf(arr[2]), weight, arr[4], arr[5]);
                    info = "";
                    arr = null;
                    animalList.add(cat);
                    cat.makeSound();
                    System.out.println("Enter the food for the animal and the quantity seperated by a whitespace! (Meat or Vegetable) ");
                    String food = in.nextLine();
                    String[] foodArr = food.split(" ");
                    cat.eat(foodArr[0], Integer.valueOf(foodArr[1]));
                    continue;


                case "Mouse":
                    System.out.println("Enter information about the mouse! (Seperate everything with commas) -> Example - Tom, Mouse, 5.0, 2, USA, Persian ");
                    info = in.nextLine();
                    arr = info.replace(" ", "").split(",");
                    Mouse mouse = new Mouse("Mouse", arr[1], Double.valueOf(arr[2]), Integer.valueOf(arr[3]), arr[4]);
                    info = "";
                    arr = null;
                    animalList.add(mouse);
                    mouse.makeSound();
                    System.out.println("Enter the food for the animal and the quantity seperated by a whitespace! (Meat or Vegetable)");
                    food = in.nextLine();
                    foodArr = food.split(" ");
                    mouse.eat(foodArr[0], Integer.valueOf(foodArr[1]));
                    continue;
                case "Tiger":
                    System.out.println("Enter information about the tiger! (Seperate everything with commas) -> Example - Tom, Tiger, 5.0, 2, USA, Persian ");
                    info = in.nextLine();
                    arr = info.replace(" ", "").split(",");
                    Tiger tiger = new Tiger("Tiger", arr[1], Double.valueOf(arr[2]), Integer.valueOf(arr[3]), arr[4]);
                    info = "";
                    arr = null;
                    animalList.add(tiger);
                    tiger.makeSound();
                    System.out.println("Enter the food for the animal and the quantity seperated by a whitespace! (Meat or Vegetable)");
                    food = in.nextLine();
                    foodArr = food.split(" ");
                    tiger.eat(foodArr[0], Integer.valueOf(foodArr[1]));
                    continue;
                case "Zebra":
                    System.out.println("Enter information about the zebra! (Seperate everything with commas) -> Example - Tom, Zebra, 5.0, 2, USA, Persian ");
                    info = in.nextLine();
                    arr = info.replace(" ", "").split(",");
                    Zebra zebra = new Zebra("Mouse", arr[1], Double.valueOf(arr[2]), Integer.valueOf(arr[3]), arr[4]);
                    info = "";
                    arr = null;
                    animalList.add(zebra);
                    zebra.makeSound();
                    System.out.println("Enter the food for the animal and the quantity seperated by a whitespace! (Meat or Vegetable)");
                    food = in.nextLine();
                    foodArr = food.split(" ");
                    zebra.eat(foodArr[0], Integer.valueOf(foodArr[1]));
                    continue;
            }
        }

    }
}
