package collections.bookStore;

import java.util.Arrays;
import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        Author author1 = new Author("John", "Smith", 'M');
        Author author2 = new Author("Jessica", "Albana", 'F');
        Author author3 = new Author("Roger", "Moore", 'M');
        Author author4 = new Author("Catherin", "Nadie", 'F');
        Book book1 = new Book("Book 1", 34, 2000, Arrays.asList(author1), Genre.FANTASY);
        Book book3 = new Book("Book 3", 26, 2010, Arrays.asList(author2), Genre.ACTION);
        Book book2 = new Book("Book 2", 56, 1999, Arrays.asList(author2, author3, author4), Genre.ACTION);
        BookService bookService = new BookService();
        bookService.addBook(book1);
        bookService.addBook(book2);
        bookService.addBook(book3);
        System.out.println("Find books by Author: " + bookService.findByAuthor(author2));
        System.out.println("\nShow all books: " + bookService.allBooks());
        System.out.println("\nFind most expensive book: " + bookService.findMostExpensiveBook());
        System.out.println("\nFind cheapest book: " + bookService.findCheapestBook());
        System.out.println("\nIs book in repo: " + bookService.isBookInRepo(book1));
        System.out.println("\nFind by year: " + bookService.findByYear(2010));
        System.out.println("\nSort Asc: " + bookService.sortByTitleAsc());
        System.out.println("\nSort Dsc: " + bookService.sortByTitleDsc());
        System.out.println("\nMap books: " + bookService.mapBooks());

        Stack<Book> bookStack = bookService.createBookStack();
        System.out.println("\nBook Stack:");
        while (!bookStack.isEmpty()) {
            System.out.println(bookStack.pop());
        }
    }
}
