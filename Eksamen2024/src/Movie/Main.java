package Movie;

public class Main {
    public static void main(String[] args) {
        MovieLibrary library = new MovieLibrary();

        library.addMovie(new Movie("Inception", 2010, 8.8));
        library.addMovie(new Movie("The Godfather", 1972, 9.2));
        library.addMovie(new Movie("Interstellar", 2014, 8.6));
        library.addMovie(new Movie("The Dark Knight", 2008, 9.0));

        System.out.println("Movies sorted by title:");
        library.sortMoviesByTitle(); // Sort by title using Comparable
        for (Movie movie : library) {
            System.out.println(movie);
        }

        System.out.println("\nMovies sorted by year:");
        library.sortMovies(new YearComparator());
        for (Movie movie : library) {
            System.out.println(movie);
        }

        System.out.println("\nMovies sorted by rating:");
        library.sortMovies(new RatingComparator());
        for (Movie movie : library) {
            System.out.println(movie);
        }
    }
}
