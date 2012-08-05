package com.twu28.biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: sumedhav
 * Date: 2/8/12
 * Time: 8:43 PM
 * To change this template use File | Settings | File Templates.
 */
public class LibraryFactory {

    public Library createLibrary() {
        return new Library(new BookRepository(), new MovieRepository(), new UserRepository());
    }

}
