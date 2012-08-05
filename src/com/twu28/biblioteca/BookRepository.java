package com.twu28.biblioteca;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Sumedha Verma
 * Date: 7/26/12
 * Time: 12:29 PM
 * To change this template use File | Settings | File Templates.
 */
public class BookRepository {

    static ArrayList<Book> bookList=new ArrayList<Book>();

    //creates a list of books
    public void initializeBookList() {
        addBook("Book1","Author1","ISBN-1111","available");
        addBook("Book2","Author2","ISBN-2222","not available");
        addBook("Book3","Author3","ISBN-3333","available");
        addBook("Book4","Author4","ISBN-4444","available");
        addBook("Book5","Author5","ISBN-5555","not available");
    }

    //adds a book to the list of books
    public void addBook(String title, String author, String isbn_no, String availability) {
        Book book=new Book(title, author, isbn_no, availability);
        bookList.add(book);
    }

    public static Book findBook(int bookNumber) {
        return bookList.get(bookNumber-1);
    }

}
