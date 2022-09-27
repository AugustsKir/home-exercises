package io.codelex.classesandobjects.practice.Exercise7Dogs;

import java.util.Objects;

public class Dog {
    private String name;
    private String gender;
    private String mother;
    private String father;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMother() {
        return mother;
    }

    public void setMother(String mother) {
        this.mother = mother;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public Dog(String name, String gender, String mother, String father) {
        this.name = name;
        this.gender = gender;
        this.mother = mother;
        this.father = father;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public Dog(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public String fathersName() {
        return Objects.requireNonNullElse(this.father, "Unknown");

    }

    public boolean hasSameMotherAs(Dog dog) {
        return Objects.equals(this.mother, dog.getMother());
    }
}
