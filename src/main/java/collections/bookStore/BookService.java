package collections.bookStore;

import java.util.*;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collectors;

public class BookService {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public List<Book> allBooks() {
        return books;
    }

    public List<Book> findByGenre(Genre genre) {
        List<Book> results = new ArrayList<>();
        for (Book book : books) {
            if (book.getGenre() == genre) {
                results.add(book);
            }
        }
        return results;
    }

    public List<Book> findByYear(int releaseYear) {
        List<Book> results = new ArrayList<>();
        for (Book book : books) {
            if (book.getYearOfRelease() == releaseYear) {
                results.add(book);
            }
        }
        return results;
    }

    public Book findMostExpensiveBook() {
        Book result = null;
        for (Book book : books) {
            if (result == null || result.getPrice() < book.getPrice()) {
                result = book;
            }
        }
        return result;
    }

    public Book findCheapestBook() {
        Book result = null;
        for (Book book : books) {
            if (result == null || result.getPrice() < book.getPrice()) {
                result = book;
            }
        }
        return result;
    }

    public List<Book> findByNumberOfAuthors(int numberOfAuthors) {
        List<Book> results = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthors().size() == numberOfAuthors) {
                results.add(book);
            }
        }
        return results;
    }

    public List<Book> sortByTitleAsc() {
        Collections.sort(books);
        return books;
    }

    public List<Book> sortByTitleDsc() {
        Collections.reverse(books);
        return books;
    }

    public boolean isBookInRepo(Book book) {
        return books.contains(book);
    }

    public List<Book> findByAuthor(Author author) {
        List<Book> results = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthors().contains(author)) {
                results.add(book);
            }
        }
        return results;
    }

    public Map<Genre, String> mapBooks() {
        Map<Genre, String> booksMap = new HashMap<>();
        for (Book book : books) {
            booksMap.put(book.getGenre(), book.getTitle());
        }
        return booksMap;
    }

    public Stack<Book> createBookStack() {
        Collections.sort(books, Comparator.comparingDouble(new ToDoubleFunction<Book>() {
            @Override
            public double applyAsDouble(Book value) {
                return value.getPrice();
            }
        }));
        Stack<Book> bookStack = new Stack<>();
        for (Book book : books) {
            bookStack.push(book);
        }
        return bookStack;
    }
}
