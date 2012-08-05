package com.twu28.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: sumedhav
 * Date: 5/8/12
 * Time: 5:51 PM
 * To change this template use File | Settings | File Templates.
 */
public class MovieTests {

    private Movie movie;

    @Before
    public void initialize() throws Exception {
        movie=new Movie();
        movie.setMovieDetails("moviename","moviedirector","10");
    }

    @Test
    public void checkMovieName() throws Exception {
        assertEquals("moviename",movie.getMovieName());
    }

    @Test
    public void checkMovieDirector() throws Exception {
        assertEquals("moviedirector",movie.getDirector());
    }

    @Test
    public void checkMovieRating() throws Exception {
        assertEquals("10",movie.getRating());
    }

}
