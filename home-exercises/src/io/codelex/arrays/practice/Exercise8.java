package io.codelex.arrays.practice;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Exercise8 {
    public static final String[] LV_CITIES = {
            "Riga", "Liepaja", "Daugavpils", "Jurmala", "Aizkraukle",
            "Ventspils", "Adazi", "Sigulda", "Ogre", "Ikskile",
            "Vecpiebalga", "Cesis", "Ergli", "Olaine", "Jaunolaine"
    };
    public static final Random rn = new Random();
    public static final int MAX_MISSES = 5;

    private char[] wordProgress;
    private static ArrayList<Character> lettersEntered = new ArrayList<>();

    private static String selectedWord = LV_CITIES[rn.nextInt(LV_CITIES.length)];

    public static void main(String[] args) {
        System.out.println("Hangman ar Latvijas pilsetam.");
        while (true) {
            wordStatus(selectedWord, lettersEntered);

            getChar();
            wordStatus(selectedWord, lettersEntered);
            if (wordStatus(selectedWord, lettersEntered)) {
                System.out.println("Congrats, you guessed it!");
                break;
            }
            //if(missedExceeded()) {
            //System.out.println("Too many misses!");
            //break;
            //}
        }

    }


    private static void getChar() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Letter: ");
        String guess = in.nextLine();
        lettersEntered.add(guess.charAt(0));
    }

    private static boolean missedExceeded() {
        int count = 0;
        for (int i = 0; i < selectedWord.length(); i++) {
            if (!lettersEntered.contains(selectedWord.charAt(i))) {
                count++;
            }
        }
        return count == MAX_MISSES;
    }


    private static boolean wordStatus(String selectedWord, ArrayList<Character> lettersEntered) {
        int correctCount = 0;
        int incorrectCount = 0;
        for (int i = 0; i < selectedWord.length(); i++) {
            if (lettersEntered.contains(selectedWord.charAt(i))) {
                System.out.print(selectedWord.charAt(i));
                correctCount++;
            } else {
                System.out.print("-");

            }
        }
        System.out.println();
        return correctCount == selectedWord.length();
    }


}
