package io.codelex.classesandobjects.practice.Exercise11Videostore;

import java.util.ArrayList;

public class Video {

    static String title;
    static boolean checkedOut;


    static ArrayList<Integer> ratings = new ArrayList<>();

    public static String getTitle() {
        return title;
    }

    public static void setTitle(String title) {
        Video.title = title;
    }

    public static boolean getCheckedOut() {
        return checkedOut;
    }

    public Video(String title) {
        this.title = title;
        checkedOut = false;


    }


    public void setCheckedOut(boolean checkedOut) {
        Video.checkedOut = checkedOut;
    }

    @Override
    public String toString() {
        return " || Current inventory status : " + title + " is the movie rented out: " + checkedOut + " Average rating: " + Video.ratings.stream().mapToDouble(d -> d).average();
    }


}
