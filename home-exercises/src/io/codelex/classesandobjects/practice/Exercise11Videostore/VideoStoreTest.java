package io.codelex.classesandobjects.practice.Exercise11Videostore;

import java.util.Scanner;

import static io.codelex.classesandobjects.practice.Exercise11Videostore.VideoStore.*;

public class VideoStoreTest {


    public static void main(String[] args) {
        final Scanner keyboard = new Scanner(System.in);

        while (true) {
            System.out.println("Choose the operation you want to perform ");
            System.out.println("Choose 0 for EXIT");
            System.out.println("Choose 1 to fill video store");
            System.out.println("Choose 2 to rent video (as user)");
            System.out.println("Choose 3 to return video (as user)");
            System.out.println("Choose 4 to add a rating");
            System.out.println("Choose 5 to check inventory status");
            System.out.println("Choose 6 to check a movie's average rating");

            int n = keyboard.nextInt();

            switch (n) {
                case 0 -> System.exit(0);
                case 1 -> fillVideoStore(keyboard);
                case 2 -> rentVideo();
                case 3 -> returnVideo();
                case 4 -> addRating();
                case 5 -> getInfo(keyboard);
                case 6 -> calcRating();
                default -> {
                }
            }

        }
    }
}
