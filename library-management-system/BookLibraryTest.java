import java.util.Scanner;

class BookLibraryTest {
    public static void main(String args[]) {
        Library lib = new Library();
        Scanner scan = new Scanner(System.in);
        
        while(true) {
            System.out.println("\n=== Welcome to Library Management System ===");
            System.out.println("What do you want to do today?");
            System.out.println("1. Add book");
            System.out.println("2. Find book by title");
            System.out.println("3. Borrow book");
            System.out.println("4. Return book");
            System.out.println("5. Show books");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scan.nextInt();
            scan.nextLine(); // FIX: Clear the buffer after nextInt()
            
            switch(choice) {
                case 1: // Add book - FIXED: Need to create Book object
                    System.out.print("Enter book title: ");
                    String title = scan.nextLine();
                    
                    System.out.print("Enter author: ");
                    String author = scan.nextLine();
                    
                    System.out.print("Enter ISBN: ");
                    String isbn = scan.nextLine();
                    
                    Book newBook = new Book(title, author, isbn);
                    lib.addBook(newBook); // Pass Book object, not String
                    break;
                    
                case 2: // Find book - FIXED: Handle return value
                    System.out.print("Enter book title to search: ");
                    String bookTitle = scan.nextLine();
                    Book foundBook = lib.findBookByTitle(bookTitle); // Fixed method name
                    
                    if(foundBook != null) {
                        System.out.println("Book found:");
                        foundBook.printBookInfo();
                    } else {
                        System.out.println("Book not found in library.");
                    }
                    break;
                    
                case 3: // Borrow book
                    System.out.print("Enter book title to borrow: ");
                    String bookBorrow = scan.nextLine();
                    lib.borrowBook(bookBorrow);
                    break;
                    
                case 4: // Return book
                    System.out.print("Enter book title to return: ");
                    String bookReturn = scan.nextLine();
                    lib.returnBook(bookReturn);
                    break;
                    
                case 5: // Show books - FIXED: No input needed
                    lib.displayAllBooks();
                    break;
                    
                case 6: // ADDED: Exit option
                    System.out.println("Thank you for using the Library Management System!");
                    scan.close();
                    return;
                    
                default:
                    System.out.println("Invalid choice! Please enter 1-6.");
            }
            
            // Pause before next iteration
            System.out.println("\nPress Enter to continue...");
            scan.nextLine();
        }
    }
}