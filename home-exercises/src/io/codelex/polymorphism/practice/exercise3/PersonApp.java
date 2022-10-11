package io.codelex.polymorphism.practice.exercise3;

public class PersonApp {
    public static void main(String[] args) {
        Employee employee = new Employee("John", "Brown", "Johnson street 55", 245443, "Welder");
        Student student = new Student("Mike", "Smith", "Mountain street 25", 43243, 4.0);
        employee.display();
        student.display();
    }
}
