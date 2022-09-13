package io.codelex.loops.practice;

import java.util.Scanner;

public class Exercise9RollTwoDice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number! ");
        int num1 = in.nextInt();
        System.out.println("Enter the second number! ");
        int num2 = in.nextInt();
        int desiredSum = num1 + num2;
        int min = 1;
        int max = 6;
        int dice1;
        int dice2;
        int diceSum = 0;
        while (desiredSum != diceSum) {
            dice1 = (int)(Math.random()*(max-min+1)+min);
            dice2 = (int)(Math.random()*(max-min+1)+min);
            diceSum = dice1 + dice2;
            if(diceSum == desiredSum) {
                System.out.println("You won! " + dice1 + " + " + dice2 + " = " + desiredSum + " | Your desired sum was " + desiredSum);
                break;
            } else {
                in.nextLine().equalsIgnoreCase("y");
                System.out.println("The result was " + dice1 + " + " + dice2 + " = " + diceSum + " | Your desired sum was " + desiredSum + " . Press y to try again!");



            }


            }
        }
    }

