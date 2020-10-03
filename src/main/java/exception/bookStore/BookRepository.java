package exception.bookStore;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BookRepository {

    private List<Book> books = new ArrayList<>();

    public void addBook(Book book){
        this.books.add(book);
    }

    public void removeBookByISBN(String isbn) throws NoBookFoundException {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
               books.remove(book);
               return;
            }
        }
        throw new NoBookFoundException("Can't remove book with isbn: " + isbn);
    }

    public Book findByIsbn(String isbn) throws NoBookFoundException {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        throw new NoBookFoundException("Can't find book with isbn: " + isbn);
    }

    public List<Book> findByTitle(String name) throws NoBookFoundException {
        List<Book> booksByName = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equals(name)) {
                booksByName.add(book);
            }
        }
        if (booksByName.isEmpty()) {
            throw new NoBookFoundException("Can't find book with title: " + name);
        }
        return booksByName;
    }

    public List<Book> findByAuthor(String name) throws NoBookFoundException {
        List<Book> byAuthor = books.stream()
                .filter(book -> name.equals(book.getAuthor()))
                .collect(Collectors.toList());
        return byAuthor;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "BookRepository{" +
                "books=" + books +
                '}';
    }
}
