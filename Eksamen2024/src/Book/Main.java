package Book;

public class Main {
    public static void main(String[] args) {
        BookLibrary library = new BookLibrary();

        library.addBook(new Book("1984", "George Orwell", 1949));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee", 1960));
        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925));
        library.addBook(new Book("Moby Dick", "Herman Melville", 1851));

        System.out.println("Books sorted by title:");
        library.sortBooksByTitle(); // Sort by title using Comparable
        for (Book book : library) {
            System.out.println(book);
        }

        System.out.println("\nBooks sorted by author:");
        library.sortBooks(new AuthorComparator());
        for (Book book : library) {
            System.out.println(book);
        }

        System.out.println("\nBooks sorted by year:");
        library.sortBooks(new YearComparator());
        for (Book book : library) {
            System.out.println(book);
        }
    }
}

