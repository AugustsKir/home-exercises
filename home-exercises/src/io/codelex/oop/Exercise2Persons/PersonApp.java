package io.codelex.oop.Exercise2Persons;

import java.time.LocalDate;

public class PersonApp {
    public static void main(String[] args) {
        Employee worker = new Employee("John", "Brown", "201198-7108", 23, "Worker", LocalDate.of(2019, 11, 19));
        Customer customer = new Customer("Peter", "Smith", "190202-20911", 20, "PS-2111", 16);
        System.out.println(worker.getInfo());
        System.out.println(customer.getInfo());
    }
}
