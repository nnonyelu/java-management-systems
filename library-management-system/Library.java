import java.util.*;

class Library {
    private List<Book> bookList = new ArrayList<>();
    
    // Constructor should initialize empty list, not take a book parameter
    public Library() {
        // bookList is already initialized above
    }
    
    public void addBook(Book book) {
        bookList.add(book);
        System.out.println("Added: " + book.getTitle());
    }
    
    public Book findBookByTitle(String title) {
        for(Book book : bookList) {
            if(book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null; // Book not found
    }
    
    public void borrowBook(String title) {
        Book book = findBookByTitle(title);
        if(book != null) {
            book.borrowBook();
        } else {
            System.out.println("Book '" + title + "' not found in library.");
        }
    }
    
    public void returnBook(String title) {
        Book book = findBookByTitle(title);
        if(book != null) {
            book.returnBook();
        } else {
            System.out.println("Book '" + title + "' not found in library.");
        }
    }
    
    public void displayAllBooks() {
        if(bookList.isEmpty()) {
            System.out.println("Library is empty.");
            return;
        }
        System.out.println("=== Library Books ===");
        for(Book book : bookList) {
            book.printBookInfo();
        }
    }
}