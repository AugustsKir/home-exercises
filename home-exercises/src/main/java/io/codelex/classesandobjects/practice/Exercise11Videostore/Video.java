package io.codelex.classesandobjects.practice.Exercise11Videostore;

import java.util.ArrayList;

public class Video {

    private String title;
    static boolean checkedOut;

    public Video(String title) {
        this.title = title;
        checkedOut = false;
    }

    static ArrayList<Integer> ratings = new ArrayList<>();

    public  String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public static boolean getCheckedOut() {
        return checkedOut;
    }




    public void setCheckedOut(boolean checkedOut) {
        this.checkedOut = checkedOut;
    }

    @Override
    public String toString() {
        return " || Current inventory status : " + title + " is the movie rented out: " + checkedOut + " Average rating: " + Video.ratings.stream().mapToDouble(d -> d).average();
    }


}
