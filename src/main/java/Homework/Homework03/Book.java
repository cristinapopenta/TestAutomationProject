package Homework.Homework03;

public class Book {
    private String bookName;
    private int bookYear;
    private Author bookAuthor;
    private double bookPrice;

    public Book(String name, int year, Author author, double price) {
        this.bookName = name;
        this.bookYear = year;
        this.bookAuthor = author;
        this.bookPrice = price;
    }
    public String getName() {
        return bookName;
    }
    public int getYear() {
        return bookYear;
    }
    public Author getAuthor() {
        return bookAuthor;
    }
    public double getPrice() {
        return bookPrice;
    }

}
