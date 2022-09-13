package io.codelex.loops.practice;

import java.util.Scanner;

public class Exercise7Piglet {
    public static void main(String[] args) {
        System.out.println("Welcome to piglet! ");
        int min = 1;
        int max = 6;
        int dice;
        int finalSum = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Press y to roll the dice! ");
        in.nextLine().equalsIgnoreCase("y");
        while (true) {
            dice = (int)(Math.random()*(max-min+1)+min);
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
