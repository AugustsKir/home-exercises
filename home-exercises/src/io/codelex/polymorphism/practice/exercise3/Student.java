package io.codelex.polymorphism.practice.exercise3;

public class Student extends Person {
    private double gpa;

    public Student(String firstName, String lastName, String address, int id, double gpa) {
        super(firstName, lastName, address, id);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    void display() {
        System.out.println("ID number : " + getId() +  " | Address : " + getAddress() +  " | Full Name :  " + getFirstName() + " " + getLastName() +  " | GPA :  " + getGpa());
    }
}
