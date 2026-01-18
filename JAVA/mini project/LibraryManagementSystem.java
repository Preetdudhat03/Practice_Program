import java.util.*;
class BookNotAvailableException extends Exception {
    public BookNotAvailableException(String message) {
        super(message);
    }
}

class LibraryManagement {
    String bookTitle;
    String bookAuthor;
    String bookPublisher;
    boolean isBorrowed;
    int daysBorrowed;

    LibraryManagement(String title, String author, String publisher) {
        bookTitle = title;
        bookAuthor = author;
        bookPublisher = publisher;
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
class Library extends LibraryManagement {
    public Library(String title, String author, String publisher) {
        super(title, author, publisher);
    }
    public void displayBookInfo() 
    {
        System.out.println("Book Title: " + bookTitle);
        System.out.println("Book Author: " + bookAuthor);
        System.out.println("Book Publisher: " + bookPublisher);
        System.out.println("Availability: " + (isBorrowed ? "Borrowed" : "Available"));
        System.out.println();
    }


}
class LibraryManagementSystem 
{
    public static void main(String args[]) 
    {
        Library books[] = new Library[10];
        books[0] = new Library("Rich Dad Poor Dad","Robert Kiosaki","Plata Publishing");
        books[1] = new Library("Think And Grow Rich","Napolean Hill","Ralston Society");
        books[2] = new Library("The 48 Laws Of Power","Robert Greene","Viking Press");
        books[3] = new Library("The Secret","Rhonda Byrne","Atria Books");
        books[4] = new Library("Think Like A Monk","Jay Shetty","Simon And Schuster");
        books[5] = new Library("Lupin","Maurice Leblanc","Sixty Novels");
        books[6] = new Library("The Psychology Of Money","Morgan Housel","Harriman House");
        books[7] = new Library("Believe In Your Self","Joseph Murray","Simon And Schuster");
        books[8] = new Library("The Monk Sold His Ferrari","Robin Sharma","Harper Collins");
        books[9] = new Library("Wings Of Fire","A.P.J Abdul Kalam","Universities Press");


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
                    System.out.println("Enter the Book title to borrow: ");
                    String borrowTitle = sc.nextLine();
                    System.out.println("Enter the Author name: ");
                    String borrowAuthor = sc.nextLine();
                    System.out.println("Enter the Publisher name: ");
                    String borrowPublisher = sc.nextLine();
                    boolean bookFound = false;
                    for (int i = 0; i < books.length; i++) {
                        Library book = books[i];
                    if(book.bookTitle.equals(borrowTitle) && book.bookAuthor.equals(borrowAuthor) && book.bookPublisher.equals(borrowPublisher)) {
                    try {
                    book.borrowBook();
                    bookFound = true;
                    }catch (BookNotAvailableException e) {
                    System.out.println("Book Not Available: " + e);
                }
            }   
        }
        System.out.println("70 rs Base fare of renting book : "+ borrowTitle);
        System.out.println("You Should return '" + borrowTitle +"' book within 7 days Otherwise 5rs Penalty will be added for each day \nafter exceeding the deadline.:)");
        if (!bookFound) 
        {
            System.out.println("Book '" + borrowTitle + "' not found.");
        }
        break;

                case 3:
                    sc.nextLine();
                    System.out.print("Enter the Book title to return: ");
                    String returnTitle = sc.nextLine();
                    System.out.print("Enter the Author name: ");
                    String returnAuthor = sc.nextLine();
                    System.out.print("Enter the Publisher name: ");
                    String returnPublisher = sc.nextLine();
                    boolean validBook = false;
                    for (int i = 0; i < books.length; i++) {
                        Library book = books[i];
                        if (book.bookTitle.equals(returnTitle) && book.bookAuthor.equals(returnAuthor) && book.bookPublisher.equals(returnPublisher)) {
                            validBook = true;
                            System.out.print("Enter the number of days late: ");
                            int daysLate;
                            try {
                                daysLate = sc.nextInt();
                            } catch (java.util.InputMismatchException e) {
                                System.out.println("Invalid input. Please enter a valid number of days.");
                                sc.nextLine();
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
    }
}

