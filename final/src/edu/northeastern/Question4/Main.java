package edu.northeastern.Question4;


import java.text.SimpleDateFormat;
import java.util.*;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Netflix netflix = new Netflix("netflix");
        Genre musical = new Genre("Musical");
        Genre romance = new Genre("Romance");
        Genre action = new Genre("Action");
        Genre documentary = new Genre("Documentary");
        Genre horror = new Genre("Horror");

        netflix.addGenres(musical);
        netflix.addGenres(romance);
        netflix.addGenres(action);
        netflix.addGenres(documentary);
        netflix.addGenres(horror);

        //Task1: Add List of movies based on the classes created above.
        Random r = new Random();
        Movie movie1 = new Movie("Story of Eighty-Nine", new GregorianCalendar(1989, r.nextInt(11)+1,r.nextInt(28)+1));
        Movie movie2 = new Movie("Story of Ninety-One", new GregorianCalendar(1991, r.nextInt(11)+1,r.nextInt(28)+1));
        Movie movie3 = new Movie("Story of Ninety-Four", new GregorianCalendar(1994, r.nextInt(11)+1,r.nextInt(28)+1));
        Movie movie4 = new Movie("Story of Ninety-Nine", new GregorianCalendar(1999, r.nextInt(11)+1,r.nextInt(28)+1));
        Movie movie5 = new Movie("Story of Two-thousand", new GregorianCalendar(2000, r.nextInt(11)+1,r.nextInt(28)+1));
        Movie movie6 = new Movie("Story of Twenty-O-one", new GregorianCalendar(2001, r.nextInt(11)+1,r.nextInt(28)+1));
        Movie movie7 = new Movie("Story of Twenty-O-three", new GregorianCalendar(2003, r.nextInt(11)+1,r.nextInt(28)+1));

        musical.addMovie(movie1);
        romance.addMovie(movie2);
        action.addMovie(movie3);
        documentary.addMovie(movie4);
        horror.addMovie(movie5);
        romance.addMovie(movie6);
        documentary.addMovie(movie7);

        //Task2: For all movies released before 2000, add the string "(Classic)" to the title of the movie using flatMap.
        netflix.getGenres().stream().flatMap(genre -> genre.getMovies().stream())
                .filter(movie -> movie.getReleasedDate().before(new GregorianCalendar(2000, Calendar.JANUARY, 1).getTime()))
                .forEach(movie -> movie.setTitle("Classic "+movie.getTitle()));

        //Task3: Get the latest 3 movies released using .limit() method of stream.
        List<Movie> sortedList = netflix.getGenres().stream().flatMap(genre -> genre.getMovies().stream())
                .sorted((m1, m2) -> m2.getReleasedDate().compareTo(m1.getReleasedDate()))
                .limit(3)
                .collect(Collectors.toList());

        //Task4: Create a predicate for release date before 2000 and a predicate for release date after 1990 and then Chain the predicates for finding movies between 1990 and 2000.
        IntPredicate before2000 = i -> i<2000;
        IntPredicate after1990 = i -> i>1990;

        List<Movie> movieListIn1990s = netflix.getGenres().stream().flatMap(genre -> genre.getMovies().stream())
                .filter(movie -> before2000.and(after1990).test(Integer.parseInt(new SimpleDateFormat("yyyy").format(movie.getReleasedDate()))))
                .collect(Collectors.toList());


        //Task5: Write a method which that will add release year in the title of the movie and return the title and then use this method for all the movies.
        netflix.getGenres().stream().flatMap(genre -> genre.getMovies().stream())
                .forEach(movie -> movie.setTitle(movie.getTitle()+ (new SimpleDateFormat("yyyy").format(movie.getReleasedDate()))));

        //Task6: Sorting on one of the feature(Ex: Released year or title) which will use comparator.
        List<Movie> sortedByTitle = netflix.genres.stream().flatMap(genre -> genre.getMovies().stream())
                .collect(Collectors.toList());
        Collections.sort(sortedByTitle, new Comparator<Movie>() {
            @Override
            public int compare(Movie movie1, Movie movie2) {
                return movie1.getTitle().compareTo(movie2.getTitle());
            }
        });
        for(Movie movie : sortedByTitle) {
            System.out.println(movie.title);
        }

    }
}
