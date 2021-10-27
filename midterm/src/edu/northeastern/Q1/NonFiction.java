package edu.northeastern.Q1;

public class NonFiction extends Book implements iBorrowable{
    public String title;
    public double price;
    public String publishYear;
    public NonFiction(String title, double price, String publishYear) {
        super();
        this.price = price;
        this.title = title;
        this.publishYear = publishYear;
    }

    @Override
    public String description() {
        return (title + " all events are true and based on real facts.");
    }

    @Override
    public void setBorrowDate(int day) {

    }

    @Override
    public void setReturnDate(int day) {

    }

    @Override
    public boolean isAvailable(int day) {
        return false;
    }
}
