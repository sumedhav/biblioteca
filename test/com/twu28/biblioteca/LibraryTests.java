package com.twu28.biblioteca;

import org.junit.Before;
import org.junit.BeforeClass;
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

    private Library library;
    @BeforeClass
    public static void initializeLists() throws Exception {
        new BookRepository().initializeBookList();
        new MovieRepository().initializeMovieList();
        new UserRepository().initializeUserList();
    }

    @Before
    public void createLibraryObject() throws Exception {
        library=new LibraryFactory().createLibrary();
    }

    @Test
    public void optionEnteredIsOne() throws Exception {
        assertEquals("view books", library.checkOption("1"));
    }

    @Test
    public void optionEnteredIsFour() throws Exception {
        assertEquals("view movies", library.checkOption("4"));
    }

    @Test
    public void optionEnteredIsSix() throws Exception {
        assertEquals("Select a valid option!", library.checkOption("6"));
    }

    @Test
    public void optionEnteredIsNotNumerical() throws Exception {
        assertEquals("Select a valid option!", library.checkOption("hi"));
    }

    @Test
    public void reserveBookNumberOne() throws Exception {
        assertEquals("Thank You! Enjoy the book.", library.reserveBook("1"));
    }

    @Test
    public void reserveBookNumberTwo() throws Exception {
        assertEquals("Sorry we don't have that book yet.", library.reserveBook("2"));
    }

    @Test
    public void reserveBookNumberNotNumerical() throws Exception {
        assertEquals("Please enter a numerical value.", library.reserveBook("not numerical"));
    }

    @Test
    public void checkLibraryNumberWhenUserIsNotLoggedIn() throws Exception {
        assertEquals("Please talk to Librarian. Thank you.", library.checkLibraryNumber(false));
    }

    @Test
    public void checkLibraryNumberWhenUserIsLoggedIn() throws Exception {
        assertEquals("library number printed", library.checkLibraryNumber(true));
    }

    @Test
    public void checkForAnExistingUser() throws Exception {
        assertEquals(true, library.checkIfUserExists("111-1111","abcdef123"));
    }

    @Test
    public void checkForANonExistingUser() throws Exception {
        assertEquals(false, library.checkIfUserExists("111-1119","password9"));
    }
}
