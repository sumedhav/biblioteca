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
        assertEquals("view books", new Library().checkOption("1"));
    }

    @Test
    public void optionEnteredIsTwo() throws Exception {
        assertEquals("reserve books", new Library().checkOption("2"));
    }

    @Test
    public void optionEnteredIsThree() throws Exception {
        assertEquals("check library number", new Library().checkOption("3"));
    }

    @Test
    public void optionEnteredIsFour() throws Exception {
        assertEquals("Select a valid option!", new Library().checkOption("4"));
    }

    @Test
    public void optionEnteredIsNotNumerical() throws Exception {
        assertEquals("Select a valid option!", new Library().checkOption("hi"));
    }
}
