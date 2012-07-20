package com.twu28.biblioteca;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Sumedha Verma
 * Date: 7/14/12
 * Time: 6:47 PM
 *
 * This class creates a list of books and a list of customers.
 */
public class Repository {
    static ArrayList<Book> bookList=new ArrayList<Book>();
    static ArrayList<User> userList =new ArrayList<User>();
    static ArrayList<Movie> movieList=new ArrayList<Movie>();

    public void initializeLists() {
        initializeBookList();
        initializeUserList();
        initializeMovieList();
    }

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

    //creates a list of customers
    public void initializeUserList() {
        addCustomer("111-1111","abcdef123","user1");
        addCustomer("111-1112","password2","user2");
        addCustomer("111-1113","password3","user3");
        addCustomer("111-1114","password4","user4");
        addCustomer("111-1115","password5","user5");
    }

    //adds a customer to the list of customers
    public void addCustomer(String library_no, String password, String name) {
        User user =new User();
        user.setUserDetails(library_no,password, name);
        userList.add(user);
    }

    public void initializeMovieList() {
        addMovie("Sholay","Ramesh Sippy","8");
        addMovie("Golmaal","H. Mukherjee","8");
        addMovie("Dark Knight Rises","Nolan","N/A");
        addMovie("Dark Knight","Nolan","7");
        addMovie("Hera Pheri","Priyadarshan","7");
        addMovie("Movie name1","Director1","5");
        addMovie("Movie name2","Director2","6");
        addMovie("Movie name3","Director3","7");
        addMovie("Movie name4","Director4","9");
        addMovie("Movie name5","Director5","8");
        addMovie("Movie name6","Director6","4");
        addMovie("Movie name7","Director7","7");
        addMovie("Movie name8","Director8","6");
        addMovie("Movie name9","Director9","7");
        addMovie("Movie name10","Director10","5");
    }

    public void addMovie(String movieName, String director, String rating) {
        Movie movie=new Movie();
        movie.setMovieDetails(movieName, director, rating);
        movieList.add(movie);
    }

    public static Book findBook(int bookNumber) {
        return bookList.get(bookNumber-1);
    }
}
