package com.twu28.biblioteca;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Sumedha Verma
 * Date: 7/26/12
 * Time: 12:33 PM
 * To change this template use File | Settings | File Templates.
 */
public class MovieRepository {

    static ArrayList<Movie> movieList=new ArrayList<Movie>();

    public void initializeMovieList() {
        addMovie("Sholay","Ramesh Sippy","8");
        addMovie("Golmaal","H. Mukherjee","8");
        addMovie("Dark Knight Rises","Nolan","N/A");
        addMovie("Dark Knight","Nolan","7");
        addMovie("Hera Pheri","Priyadarshan","7");
        addMovie("Movie name1","Director1","5");
        addMovie("Movie name2","Director2","6");
        addMovie("Movie name3","Director3","7");
        addMovie("Movie name4","Director4","9");
        addMovie("Movie name5","Director5","8");
        addMovie("Movie name6","Director6","4");
        addMovie("Movie name7","Director7","7");
        addMovie("Movie name8","Director8","6");
        addMovie("Movie name9","Director9","7");
        addMovie("Movie name10","Director10","5");
    }

    public void addMovie(String movieName, String director, String rating) {
        Movie movie=new Movie();
        movie.setMovieDetails(movieName, director, rating);
        movieList.add(movie);
    }

}
