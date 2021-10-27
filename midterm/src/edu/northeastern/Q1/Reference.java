package edu.northeastern.Q1;

public class Reference extends Book{
    public String category;
    public String title;
    public double price;
    public String publishYear;

    public Reference(String category, String title, double price, String publishYear) {
        super();
        this.category = category;
        this.title = title;
        this.price = price;
        this.publishYear = publishYear;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String getPublishYear() {
        return publishYear;
    }

    @Override
    public void setPublishYear(String publishYear) {
        this.publishYear = publishYear;
    }

    @Override
    public String description() {
        return (title+ " all information is real.");
    }
}
