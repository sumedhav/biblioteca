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
    BookRepository bookRepository=new BookRepository();
    MovieRepository movieRepository=new MovieRepository();
    UserRepository userRepository=new UserRepository();

    public void initializeLists() {
        bookList=bookRepository.initializeBookList();
        userList=userRepository.initializeUserList();
        movieList=movieRepository.initializeMovieList();
    }

    public static Book findBook(int bookNumber) {
        return bookList.get(bookNumber-1);
    }
}
