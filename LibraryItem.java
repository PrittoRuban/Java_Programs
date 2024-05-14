abstract class LibraryItem {

    protected String title;
    protected String publisher;

    public LibraryItem(String title, String publisher) {
        this.title = title;
        this.publisher = publisher;
    }

    public abstract String getItemDetails();

    public abstract String calculateDueDate();
}

class Book extends LibraryItem {

    private final String author;

    public Book(String title, String publisher, String author) {
        super(title, publisher);
        this.author = author;
    }

    @Override
    public String getItemDetails() {
        return "Book Title: " + title + ", Publisher: " + publisher + ", Author: " + author;
    }

    @Override
    public String calculateDueDate() {
        return "Due date is in 14 days";
    }
}

class Journal extends LibraryItem {

    private final String issueNumber;

    public Journal(String title, String publisher, String issueNumber) {
        super(title, publisher);
        this.issueNumber = issueNumber;
    }

    @Override
    public String getItemDetails() {
        return "Journal Title: " + title + ", Publisher: " + publisher + ", Issue Number: " + issueNumber;
    }

    @Override
    public String calculateDueDate() {
        return "Due date is in 7 days";
    }
}

class DVD extends LibraryItem {

    private final String director;

    public DVD(String title, String publisher, String director) {
        super(title, publisher);
        this.director = director;
    }

    @Override
    public String getItemDetails() {
        return "DVD Title: " + title + ", Publisher: " + publisher + ", Director: " + director;
    }

    @Override
    public String calculateDueDate() {
        return "Due date is in 2 days";
    }
}
