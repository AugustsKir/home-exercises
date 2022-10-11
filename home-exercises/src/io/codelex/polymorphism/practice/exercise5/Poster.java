package io.codelex.polymorphism.practice.exercise5;

public class Poster extends Advert {
    private final int LARGE_POSTER_PRICE = 1000;
    private final int SMALL_POSTER_PRICE = 500;
    private final int numOfCopies;
    private final int costPerCopy;
    private final boolean largeSize;


    public Poster(int fee, int numOfCopies, int costPerCopy, boolean largeSize) {
        super(fee);
        this.numOfCopies = numOfCopies;
        this.costPerCopy = costPerCopy;
        this.largeSize = largeSize;
    }

    @Override
    public int cost() {
        if (largeSize) {
            return super.cost() + numOfCopies * costPerCopy + LARGE_POSTER_PRICE;
        } else return super.cost() + numOfCopies * costPerCopy + SMALL_POSTER_PRICE;
    }

    public String toString() {
        return super.toString() + " Number of copies: " + numOfCopies + ". Price per copy: " + costPerCopy + ". Large poster: " + largeSize;
    }
}
