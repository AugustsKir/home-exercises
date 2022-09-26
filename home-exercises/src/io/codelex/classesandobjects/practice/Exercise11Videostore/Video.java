package io.codelex.classesandobjects.practice.Exercise11Videostore;

import java.util.ArrayList;
import java.util.Scanner;

public class Video {

    static String title;
    boolean checkedOut;

    static ArrayList<Integer> ratings = new ArrayList<>();
    public Video(String title) {
        this.title = title;
        checkedOut = false;


    }

    public void setCheckedOut(boolean checkedOut) {
        this.checkedOut = checkedOut;
    }

    @Override
    public String toString() {
        return " || Current inventory status : " + title + " is the movie rented out: " + checkedOut;
    }


}
