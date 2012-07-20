package com.twu28.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: Sumedha Verma
 * Date: 7/18/12
 * Time: 7:19 PM
 * To change this template use File | Settings | File Templates.
 */
public class BookTests {

    @Test
    public void checkIfBookIsAvailable() {
        Book book=new Book("sometitle","someauthor","ISBN-0000","available");
        assertEquals(true, book.isAvailable());
    }

    @Test
    public void checkIfBookIsNotAvailable() {
        assertEquals(false, new Book().isAvailable());
    }

    @Test
    public void setBookAvailabilityToAvailable() {
        Book book=new Book();
        book.setAvailability("available");
        assertEquals(true, book.isAvailable());
    }

    @Test
    public void setBookAvailabilityToNotAvailable() {
        Book book=new Book("sometitle","someauthor","ISBN-0000","available");
        book.setAvailability("not available");
        assertEquals(false, book.isAvailable());
    }
}
