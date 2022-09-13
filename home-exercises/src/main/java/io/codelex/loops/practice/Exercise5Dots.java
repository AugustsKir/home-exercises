package io.codelex.loops.practice;

import java.util.Scanner;

public class Exercise5Dots {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first word! ");
        String firstWord = in.nextLine();
        System.out.println("Enter the second word! ");
        String secondWord = in.nextLine();
        int wordLength = (firstWord +  "" + secondWord).length();
        int spaces = 30 - wordLength;
        int i;
        String dots = ".";
        String finalDots = "";


        //System.out.println(firstWord + ".".repeat(spaces) + secondWord);

         for (i = 1; i < spaces; i++) {
             finalDots = dots.repeat(i);
        }
        System.out.println(firstWord + finalDots + secondWord);
    }
}
