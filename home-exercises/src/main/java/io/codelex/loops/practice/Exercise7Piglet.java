package io.codelex.loops.practice;

import java.util.Random;
import java.util.Scanner;

public class Exercise7Piglet {
    public static void main(String[] args) {
        System.out.println("Welcome to piglet! ");
        Random ran = new Random();
        int finalSum = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Press y to roll the dice! ");
        in.nextLine().equalsIgnoreCase("y");
        while (true) {
            int dice = ran.nextInt(5) + 1;
            System.out.println("You rolled " + dice);
            if (dice == 1) {
                System.out.println("Game over, your total score is 0 points ");
                break;
            } else {
                finalSum += dice;
                System.out.println("Your total score is " + finalSum);
                System.out.println("Do you want to keep playing or stop? y/n");
                if (in.nextLine().equalsIgnoreCase("n")) {
                    System.out.println("Game over, your total score is " + finalSum + " points.");
                    break;
                }
            }
        }
    }
}
