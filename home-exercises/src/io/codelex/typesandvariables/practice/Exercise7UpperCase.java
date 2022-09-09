package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Exercise7UpperCase {
    public static void main(String[] args) {
        int upper = 0;
        String sentence;
        Scanner sent = new Scanner(System.in);
        System.out.println("Enter Your Sentence Here: ");
        sentence = sent.nextLine();
        for (int i = 0; i < sentence.length(); i++) {
            char let = sentence.charAt(i);
            if (let>='A' && let <='Z') {
                upper++;
            }
        }
        System.out.println("Number Of Uppercase Letters: " + upper);
    }
}
