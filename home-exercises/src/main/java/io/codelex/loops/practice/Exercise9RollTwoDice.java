package io.codelex.loops.practice;

import java.util.Random;
import java.util.Scanner;

public class Exercise9RollTwoDice {
    public static void main(String[] args) {
        Random ran = new Random();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number! ");
        int num1 = in.nextInt();
        System.out.println("Enter the second number! ");
        int num2 = in.nextInt();
        int desiredSum = num1 + num2;
        int diceSum = 0;
        while (desiredSum != diceSum) {
            int dice1 = ran.nextInt(5) + 1;
            int dice2 = ran.nextInt(5) + 1;
            diceSum = dice1 + dice2;
            if (diceSum == desiredSum) {
                System.out.println("You won! " + dice1 + " + " + dice2 + " = " + desiredSum + " | Your desired sum was " + desiredSum);
                break;
            } else {
                in.nextLine().equalsIgnoreCase("y");
                System.out.println("The result was " + dice1 + " + " + dice2 + " = " + diceSum + " | Your desired sum was " + desiredSum + " . Press y to try again!");


            }


        }
    }
}

