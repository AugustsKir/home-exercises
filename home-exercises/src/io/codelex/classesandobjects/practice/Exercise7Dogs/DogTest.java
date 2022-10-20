package io.codelex.classesandobjects.practice.Exercise7Dogs;

public class DogTest {
    public static void main(String[] args) {
        Dog dog1max = new Dog("Max", "Male");
        Dog dog2rocky = new Dog("Rocky", "Male");
        Dog dog3sparky = new Dog("Sparky", "Male");
        Dog dog4buster = new Dog("Buster", "Male");
        Dog dog5sam = new Dog("Sam", "Male");
        Dog dog6lady = new Dog("Lady", "Female");
        Dog dog7molly = new Dog("Molly", "Female");
        Dog dog8coco = new Dog("Coco", "Female");

        dog1max.setFather(dog2rocky.getName());
        dog1max.setMother(dog6lady.getName());

        dog8coco.setFather(dog4buster.getName());
        dog8coco.setMother(dog7molly.getName());

        dog2rocky.setFather(dog5sam.getName());
        dog2rocky.setMother(dog7molly.getName());

        dog4buster.setFather(dog3sparky.getName());
        dog4buster.setMother(dog6lady.getName());
        System.out.println(dog3sparky.fathersName());
        System.out.println(dog8coco.fathersName());
        System.out.println(dog8coco.hasSameMotherAs(dog2rocky));


    }
}
