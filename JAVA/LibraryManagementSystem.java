import java.util.Scanner;

class BookNotAvailableException extends Exception 
{
    public BookNotAvailableException(String message) 
    {
        super(message);
    }
}

class LibraryManagement 
{
    String bookTitle;
    boolean isBorrowed;
    int daysBorrowed;

    LibraryManagement(String title) 
    {
        bookTitle = title;
        isBorrowed = false;
        daysBorrowed = 0;
    }

    public void borrowBook() throws BookNotAvailableException 
    {
        if (!isBorrowed) 
        {
            isBorrowed = true;
            System.out.println("You have borrowed '" + bookTitle + "'.");
        } 
        else 
        {
            throw new BookNotAvailableException("Sorry, '" + bookTitle + "' is already borrowed.");
        }
    }

    public void returnBook(int daysLate) 
    {
        if (isBorrowed) 
        {
            isBorrowed = false;
            if (daysLate > 0) 
            {
                System.out.println("Since you have exceeded the deadline of returning '" + bookTitle + "' book You would be charged " + daysLate + " days penalty");
                int penalty = 70 + daysLate * 5;
                System.out.println("Thanks for returning '" + bookTitle + "' late. Your Bill + Penalty: Rs " + penalty);
            } 
            else 
            {
                System.out.println("Thanks for returning '" + bookTitle + "'  Your bill = 70 .");
            }
        } 
        else 
        {
            System.out.println("This book is not borrowed.");
        }
    }
}

class Library extends LibraryManagement 
{
    public Library(String title) 
    {
        super(title);
    }

    public void displayBookInfo() 
    {
        System.out.println("Book Title: " + bookTitle);
        System.out.println("Availability: " + (isBorrowed ? "Borrowed" : "Available"));
    }
}

class LibraryManagementSystem 
{
    public static void main(String[] args) 
    {
        Library[] books = new Library[3];
        books[0] = new Library("Introduction to Java");
        books[1] = new Library("Data Structures and Algorithms");
        books[2] = new Library("Design Patterns");

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nLibrary Management System Menu:");
            System.out.println("1. Display Available Books");
            System.out.println("2. Borrow a Book");
            System.out.println("3. Return a Book");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
        
            switch (choice) 
            {
                case 1:
                    System.out.println("\nAvailable Books:");
                    for (int i = 0; i < books.length; i++) 
                    {
                        Library book = books[i];
                        if (!book.isBorrowed) 
                        {
                            book.displayBookInfo();
                        }
                    }
                    break;
                case 2:
                    sc.nextLine();
                    System.out.print("Enter the Book title to borrow: ");
                    String borrowTitle = sc.nextLine();
                    boolean bookFound = false;
                    for (int i = 0; i < books.length; i++) 
                    {
                        Library book = books[i];
                        if (book.bookTitle.equals(borrowTitle)) 
                        {
                            try
                            {
                                book.borrowBook();
                                bookFound = true;
                            } 
                            catch (BookNotAvailableException e) 
                            {
                                System.out.println("Book Not Available"+e);
                            }
                        }
                    }
                    if (!bookFound) 
                    {
                        System.out.println("Book '" + borrowTitle + "' not found.");
                    }
                    break;
                case 3:
                    sc.nextLine();
                    System.out.print("Enter the Book title to return: ");
                    String returnTitle = sc.nextLine();
                    boolean validBook = false;
                    for (int i = 0; i < books.length; i++) 
                    {
                        Library book = books[i];
                        if (book.bookTitle.equals(returnTitle)) 
                        {
                            validBook = true;
                            System.out.print("Enter the number of days late: ");
                            int daysLate;
                            try 
                            {
                                daysLate = sc.nextInt();
                            } 
                            catch (java.util.InputMismatchException e) 
                            {
                                System.out.println("Invalid input. Please enter a valid number of days.");
                                sc.nextLine(); // Consume the invalid input
                                continue;
                            }
                            book.returnBook(daysLate);
                            break;
                        }
                    }
                    if (!validBook) 
                    {
                        System.out.println("Invalid Book '" + returnTitle + "'.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting the Library Management System.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 4);

        sc.close();
    }
}
