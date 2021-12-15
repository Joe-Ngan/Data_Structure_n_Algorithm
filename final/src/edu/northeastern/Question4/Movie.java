package edu.northeastern.Question4;

import java.util.*;

public class Movie {
    String title;
    Date releasedDate;
    List<String> actors;
    String directors;
    public Movie(String title, GregorianCalendar gregorianCalendar) {
        this.title = title;
        this.releasedDate = gregorianCalendar.getTime();
        this.actors = new ArrayList<>();
        this.directors = "";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getReleasedDate() {
        return releasedDate;
    }

    public void setReleasedDate(GregorianCalendar gregorianCalendar) {
        this.releasedDate = gregorianCalendar.getTime();
    }

    public List<String> getActors() {
        return actors;
    }

    public void setActors(List<String> actors) {
        this.actors = actors;
    }

    public String getDirectors() {
        return directors;
    }

    public void setDirectors(String directors) {
        this.directors = directors;
    }
}
