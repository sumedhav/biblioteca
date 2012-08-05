package com.twu28.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: sumedhav
 * Date: 5/8/12
 * Time: 6:03 PM
 * To change this template use File | Settings | File Templates.
 */
public class BookRepositoryTests {

    @Test
    public void findingABookThatExists() throws Exception{
        new BookRepository().initializeBookList();
        Book book=BookRepository.findBook(3);
        assertEquals("Book3",book.getTitle());
        assertEquals("Author3",book.getAuthor());
        assertEquals("ISBN-3333",book.getIsbnNumber());
        assertEquals("available",book.getAvailability());
    }

}
