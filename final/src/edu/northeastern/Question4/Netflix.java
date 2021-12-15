package edu.northeastern.Question4;

import java.util.ArrayList;
import java.util.List;

public class Netflix {
    String name;
    List<Genre> genres;

    public Netflix(String name) {
        this.name = name;
        this.genres = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public void addGenres(Genre genre){
        genres.add(genre);
    }

    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }
}
