package AbstractionConcept;

// Interface Definition
interface LibraryItem {
    String getTitle();
    String getAuthor();
    int getYear();
    boolean isAvailable();
}

// Class implementing the interface
class Book implements LibraryItem {
    private String title;
    private String author;
    private int year;
    private boolean available;

    // Constructor
    public Book(String title, String author, int year, boolean available) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.available = available;
    }

    // Implementing interface methods
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public boolean isAvailable() {
        return available;
    }

    // Optional: For display purposes
    public void displayInfo() {
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Year: " + getYear());
        System.out.println("Available: " + (isAvailable() ? "Yes" : "No"));
        System.out.println();
    }
}

// Main class to test
public class LibraryManagement {
    public static void main(String[] args) {
        Book book1 = new Book("Atomic Habits", "James Clear", 2018, true);
        Book book2 = new Book("The Hobbit", "J.R.R. Tolkien", 1937, false);

        System.out.println("--- Library Items ---");
        book1.displayInfo();
        book2.displayInfo();
    }
}
