package io.codelex.classesandobjects.practice.Exercise11Videostore;

import java.util.ArrayList;
import java.util.Scanner;

public class VideoStore {
    private static final int COUNT_OF_MOVIES = 3;
    static ArrayList<Video> inventory = new ArrayList<>();
    static ArrayList<Video> fullInventory = new ArrayList<>();

    public VideoStore() {
    }
    public static void fillVideoStore(Scanner scanner) {
            System.out.println("Enter movie name");
            String movieName = scanner.next();
            Video newMovie = new Video(movieName);
            inventory.add(newMovie);
            fullInventory.add(newMovie);


    }

    static void rentVideo(Scanner scanner) {
        System.out.println("Enter a movie name to rent");
        String movieName = scanner.nextLine();
        for(Video obj : inventory) {
            if (obj.title.equals(movieName)) {
            inventory.remove(obj);
            obj.setCheckedOut(true);
                System.out.println(movieName + " rented successfully");
            }
        }
    }

    static void returnVideo(Scanner scanner) {
        System.out.println("Enter a movie name to return");
        String movieName = scanner.nextLine();
        for (Video obj : fullInventory) {
            if(obj.title.equals(movieName)) {
                inventory.add(obj);
                System.out.println(movieName + " returned successfully");
            }
        }
    }
    static void getInfo(Scanner scanner) {
        System.out.println(inventory);
    }


}
