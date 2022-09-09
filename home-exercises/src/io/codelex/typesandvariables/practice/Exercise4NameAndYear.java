package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Exercise4NameAndYear {
    public static void main(String[] args) {
        Scanner y=new Scanner(System.in);
        Scanner n=new Scanner(System.in);
        System.out.println("Enter Your Full Name");
        String name = n.nextLine();
        System.out.println("Enter Your Birth Year:");
        int year = y.nextInt();
        System.out.println("My name is " + name +  " and I was born in " + year + ".");
    }
}
