// 3. You are developing a library management system and need to implement a Book class. The Book class should have 
// private instance variables for the book title, author name, and publication year. Implement appropriate getter and 
// setter methods to ensure encapsulation. Additionally, include a private variable to track the availability of the book 
// (e.g., true if available, false if borrowed), and provide a public method to borrow the book, updating its availability status.

public class Book {
    // Private variables
    private String title;
    private String author;
    private int publicationYear;
    private boolean isAvailable;

    // Constructor
    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.isAvailable = true; // Book is available by default
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int year) {
        this.publicationYear = year;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    // Method to borrow the book
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book is already borrowed.");
        }
    }

    // Optional: method to return the book
    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("Book was not borrowed.");
        }
    }
}
