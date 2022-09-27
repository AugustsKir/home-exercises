package io.codelex.classesandobjects.practice.Exercise11Videostore;

import java.util.ArrayList;
import java.util.Scanner;

public class VideoStore {
    private static final int COUNT_OF_MOVIES = 3;
    static ArrayList<Video> inventory = new ArrayList<>();


    public VideoStore() {
    }

    static public boolean containsMovie(ArrayList<Video> inventory, String title) {
        return inventory.stream().anyMatch(o -> Video.getTitle().equals(title));
    }

    public static void fillVideoStore(Scanner scanner) {
        System.out.println("Enter movie name");
        String movieName = scanner.next();
        Video newMovie = new Video(movieName);
        inventory.add(newMovie);


    }

    static void rentVideo() {
        System.out.println("Enter a movie name to rent");
        Scanner in = new Scanner(System.in);
        String movieName = in.nextLine();
        for (Video obj : inventory) {
            if (Video.title.equals(movieName) && !Video.getCheckedOut()) {
                obj.setCheckedOut(true);
                System.out.println(movieName + " rented successfully");
            } else System.out.println("Movie not in our catalog");
        }
    }


    static void returnVideo() {
        System.out.println("Enter a movie name to return");
        Scanner in = new Scanner(System.in);
        String movieName = in.nextLine();
        for (Video obj : inventory) {
            if (Video.title.equals(movieName)) {
                inventory.add(obj);
                obj.setCheckedOut(false);
                System.out.println(movieName + " returned successfully");
            } else System.out.println("Movie not in our catalog");
        }
    }

    static void addRating() {
        System.out.println("Enter the movie name that you want to rate");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        if (!Video.title.equals(name)) {
            System.out.println("Movie not found");
        } else {
            System.out.println("Enter the rating");
            Video.ratings.add(in.nextInt());
        }


    }

    static void calcRating() {
        System.out.println("Enter the movie name to get average rating");
        Scanner in = new Scanner(System.in);
        String title = in.nextLine();
        if (Video.title.equals(title)) {
            if (Video.ratings.isEmpty()) {
                System.out.println("No ratings present");
            } else System.out.println(Video.ratings.stream().mapToDouble(d -> d).average());
        } else System.out.println("Movie not present");
        ;
    }

    static void getInfo(Scanner scanner) {
        System.out.println(inventory);
    }


}
