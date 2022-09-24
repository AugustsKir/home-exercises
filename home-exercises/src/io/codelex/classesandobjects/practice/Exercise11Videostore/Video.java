package io.codelex.classesandobjects.practice.Exercise11Videostore;

import java.util.Scanner;

public class Video {
    @Override
    public String toString() {
        return " || Current inventory status : " + title + " is the movie rented out: " + checkedOut + "Average rating: " + rating;
    }
    int countRate = 1;
    String title;
    boolean checkedOut;
    int rating;
    public Video(String title) {
        this.title = title;
        checkedOut = false;
        rating = 0;
    }

    public void setCheckedOut(boolean checkedOut) {
        this.checkedOut = checkedOut;
    }

    public void calcRating(String title, int ratingNew) {
        for (Video obj : VideoStore.inventory) {
            if (obj.title.contains(title)) {
                rating += ratingNew;
                rating /= countRate;
                countRate++;
            } else System.out.println("This movie isn't in our catalog");
        }
    }


}
