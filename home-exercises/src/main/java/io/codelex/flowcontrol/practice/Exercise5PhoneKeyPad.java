package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class Exercise5PhoneKeyPad {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Here's a phone keypad, enter a letter! ");
        int numSum = 0;
        System.out.println();
        char charInput = in.nextLine().toLowerCase().charAt(0);


        switch (charInput) {
            case 'a', 'b', 'c' -> System.out.print(2);
            case 'd', 'e', 'f' -> System.out.print(3);
            case 'g', 'h', 'i' -> System.out.print(4);
            case 'j', 'k', 'l' -> System.out.print(5);
            case 'm', 'n', 'o' -> System.out.print(6);
            case 'p', 'q', 'r', 's' -> System.out.print(7);
            case 't', 'u', 'v' -> System.out.print(8);
            case 'w', 'x', 'y', 'z' -> System.out.print(9);
            default -> System.out.println("Unknown input entered");
        }




        }

    }

