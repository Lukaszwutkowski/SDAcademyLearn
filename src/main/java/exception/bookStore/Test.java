package exception.bookStore;

public class Test {

    public static void main(String[] args) throws NoBookFoundException {
        BookRepository bookRepository = new BookRepository();
        bookRepository.addBook(new Book("3323-434ds", "Harry Potter Part 1", "J.K. Rowling"));
        bookRepository.addBook(new Book("3623-435hs", "Harry Potter Part 2", "J.K. Rowling"));
        bookRepository.addBook(new Book("7936-464ks", "Harry Potter Part 3", "J.K. Rowling"));
        bookRepository.addBook(new Book("5723-434ls", "Harry Potter Part 4", "J.K. Rowling"));
        bookRepository.addBook(new Book("3343-432bs", "Lord of the Rings Part 1", "J.R.R. Tolkien"));
        bookRepository.addBook(new Book("3318-434dc", "Lord of the Rings Part 2", "J.R.R. Tolkien"));
        bookRepository.addBook(new Book("3903-434ds", "Lord of the Rings Part 3", "J.R.R. Tolkien"));
        bookRepository.addBook(new Book("3343-434dj", "This", "Stephen King"));
        bookRepository.addBook(new Book("0923-434da", "Romeo and Juliet", "William Shakespeare"));
        bookRepository.addBook(new Book("7823-434dl", "The adventure of Tom Sawyer", "Mark Twain"));
        bookRepository.addBook(new Book("3156-434dw", "The adventure of Huckleberry Finn", "Mark Twain"));

        System.out.println(bookRepository);

        System.out.println(bookRepository.findByAuthor("Mark Twain"));

       // System.out.println(bookRepository.findByIsbn("7867-546gf"));

        System.out.println(bookRepository.findByTitle("This"));
    }
}
