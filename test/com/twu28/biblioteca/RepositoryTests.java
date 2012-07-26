package com.twu28.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: Sumedha Verma
 * Date: 7/26/12
 * Time: 12:44 PM
 * To change this template use File | Settings | File Templates.
 */
public class RepositoryTests {

    @Test
    public void findingABookThatExists() throws Exception {
        new Repository().initializeLists();
        assertEquals(new Book("Book1", "Author1", "ISBN-1111", "available"), Repository.findBook(1));
    }

}
