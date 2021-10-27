package edu.northeastern.Q1;

public class Fiction extends Book implements iBorrowable {
    public String title;
    public double price;
    public String publishYear;

    public int borrowDate;
    public int returnDate;
    @Override
    public String description() {
        return (title +" all events are imaginary and not based on real facts");
    }

    public Fiction(String title, double price, String publishYear) {
        super(title, price, publishYear);
        this.title = title;
        this.price = price;
        this.publishYear = publishYear;
    }

    @Override
    public void setBorrowDate(int day) {
        this.borrowDate = day;
    }

    @Override
    public void setReturnDate(int day) {
        this.returnDate = day;
    }

    @Override
    public boolean isAvailable(int day) {
        return (day<borrowDate)||(day>returnDate);
    }
}
