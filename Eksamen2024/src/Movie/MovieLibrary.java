package Movie;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class MovieLibrary implements Iterable<Movie> {
    private List<Movie> movies;

    public MovieLibrary() {
        movies = new ArrayList<>();
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public void sortMovies(Comparator<Movie> comparator) {
        movies.sort(comparator);
    }

    public void sortMoviesByTitle() {
        movies.sort(Comparator.naturalOrder());
    }

    @Override
    public Iterator<Movie> iterator() {
        return movies.iterator();
    }
}


