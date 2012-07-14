package com.twu28.biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: Sumedha Verma
 * Date: 7/13/12
 * Time: 11:21 PM
 *
 * This class contains the attributes of a book and provides methods to handle them.
 */
public class Book {

    String title, author, isbn_number, availability;
    public Book() {
        title="default title";
        author="default author";
        isbn_number="default isbn";
        availability="not available";
    }

    public Book(String title,  String author, String isbn_number, String availability) {
        this.title=title;
        this.author=author;
        this.isbn_number=isbn_number;
        this.availability=availability;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability=availability;
    }

    public void viewBookDetails() {
        System.out.printf("%-15s%-15s%-15s%-12s\n", title, author, isbn_number, availability);
    }

}
