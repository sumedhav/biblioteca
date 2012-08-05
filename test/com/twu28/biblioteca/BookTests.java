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
    public void checkIfBookIsAvailable() throws Exception{
        Book book=new Book("sometitle","someauthor","ISBN-0000","available");
        assertEquals(true, book.isAvailable());
    }

    @Test
    public void checkIfBookIsNotAvailable() throws Exception{
        assertEquals(false, new Book().isAvailable());
    }

    @Test
    public void setBookAvailabilityToAvailable() throws Exception{
        Book book=new Book();
        book.setAvailability("available");
        assertEquals(true, book.isAvailable());
    }

    @Test
    public void setBookAvailabilityToNotAvailable() throws Exception{
        Book book=new Book("sometitle","someauthor","ISBN-0000","available");
        book.setAvailability("not available");
        assertEquals(false, book.isAvailable());
    }

    @Test
    public void checkBookTitle() throws Exception {
        assertEquals("default title",new Book().getTitle());
    }

    @Test
    public void checkBookAuthor() throws Exception {
        assertEquals("default author",new Book().getAuthor());
    }

    @Test
    public void checkBookIsbn() throws Exception {
        assertEquals("default isbn",new Book().getIsbnNumber());
    }

    @Test
    public void checkBookAvailability() throws Exception {
        assertEquals("not available",new Book().getAvailability());
    }
}
