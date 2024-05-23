package Book;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class BookLibrary implements Iterable<Book> {
    private List<Book> books;

    public BookLibrary() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void sortBooks(Comparator<Book> comparator) {
        books.sort(comparator);
    }

    public void sortBooksByTitle() {
        books.sort(Comparator.naturalOrder());
    }

    @Override
    public Iterator<Book> iterator() {
        return books.iterator();
    }
}

