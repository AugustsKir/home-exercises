package io.codelex.arithmetic.practice;

import java.util.Scanner;


public class Exercise5RandomNum {
    public static void main(String[] args) {
        int max = 100;
        int min = 1;
        System.out.println("I'm thinking of a number between 1-100.  Try to guess it.");
        Scanner n = new Scanner(System.in);
        int number = n.nextInt();
        int randomNum = (int)(Math.random()*(max-min+1)+min);
        if(number < randomNum) {
            System.out.println("Sorry, you are too low.  I was thinking of " + randomNum);
        } else if (number > randomNum) {
            System.out.println("Sorry, you are too high.  I was thinking of " + randomNum);
        } else System.out.println("You guessed it!  What are the odds?!?");


    }
}
