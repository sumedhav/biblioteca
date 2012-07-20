package com.twu28.biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: Sumedha Verma
 * Date: 7/18/12
 * Time: 7:31 PM
 *
 * This class contains attributes of a movie and methods to handle them.
 */
public class Movie {

    String movie_name, director, rating;

    public void setMovieDetails(String movie_name, String director, String rating) {
        this.movie_name=movie_name;
        this.director=director;
        this.rating=rating;
    }

    public void viewMovieDetails() {
        System.out.printf("%-25s%-20s%-5s\n",movie_name,director,rating);
    }

}
