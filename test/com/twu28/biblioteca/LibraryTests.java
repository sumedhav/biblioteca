package com.twu28.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: Sumedha Verma
 * Date: 7/13/12
 * Time: 5:55 PM
 *
 * This class is used to test the functions of the Library class
 */
public class LibraryTests {

    @Test
    public void optionEnteredIsOne() throws Exception {
        new Repository().initializeLists();
        assertEquals("view books", new Library().checkOption("1"));
    }

    @Test
    public void optionEnteredIsFour() throws Exception {
        assertEquals("view movies", new Library().checkOption("4"));
    }

    @Test
    public void optionEnteredIsSix() throws Exception {
        assertEquals("Select a valid option!", new Library().checkOption("6"));
    }

    @Test
    public void optionEnteredIsNotNumerical() throws Exception {
        assertEquals("Select a valid option!", new Library().checkOption("hi"));
    }

    @Test
    public void reserveBookNumberOne() throws Exception {
        assertEquals("Thank You! Enjoy the book.", new Library().reserveBook("1"));
    }

    @Test
    public void reserveBookNumberTwo() throws Exception {
        assertEquals("Sorry we don't have that book yet.", new Library().reserveBook("2"));
    }

    @Test
    public void reserveBookNumberNotNumerical() throws Exception {
        assertEquals("Please enter a numerical value.", new Library().reserveBook("not numerical"));
    }

    @Test
    public void checkLibraryNumberWhenUserIsNotLoggedIn() throws Exception {
        assertEquals("Please talk to Librarian. Thank you.", new Library().checkLibraryNumber(false));
    }

    @Test
    public void checkLibraryNumberWhenUserIsLoggedIn() throws Exception {
        assertEquals("library number printed", new Library().checkLibraryNumber(true));
    }
}
