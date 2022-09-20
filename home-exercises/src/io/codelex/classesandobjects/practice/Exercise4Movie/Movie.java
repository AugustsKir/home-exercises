package io.codelex.classesandobjects.practice.Exercise4Movie;

public class Movie {
    private String title;
    private String studio;
    private String rating;
    private final String pg = "PG13";

    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "PG13";
    }
    public static Movie[] getPG(Movie[] film) {
        Movie[] pgFilm = new Movie[film.length];
        int index = 0;
        for (int i = 0; i < film.length ; i++) {
            if (film[i].rating.equals("PG")) {
                pgFilm[index] = film[i];
                index++;
            }
        }
        return pgFilm;
    }
}
