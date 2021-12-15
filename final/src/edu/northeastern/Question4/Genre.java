package edu.northeastern.Question4;

import java.util.ArrayList;
import java.util.List;

public class Genre {
    String name;
    List<Movie> movies;


    public Genre(String name) {
        this.name = name;
        this.movies = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addMovie(Movie movie){
        movies.add(movie);
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }
}
