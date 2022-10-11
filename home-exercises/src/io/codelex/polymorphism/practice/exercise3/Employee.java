package io.codelex.polymorphism.practice.exercise3;

public class Employee extends Person {
    private String jobTitle;

    public Employee(String firstName, String lastName, String address, int id, String jobTitle) {
        super(firstName, lastName, address, id);
        this.jobTitle = jobTitle;
    }

    @Override
    void display() {
        System.out.println("ID number : " + getId() +  " | Address :  " + getAddress() +  " | Full Name : " + getFirstName() + " " + getLastName() +  " | Job title :  " + getJobTitle());
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
}
