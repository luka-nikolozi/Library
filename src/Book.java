public class Book {
    private String title;
    private String author;
    private int ISBN;
    private String genre;
    private boolean available;

    private static int bookIdTracker;

    public Book(String title, String author, String genre, LibrarianManagement library) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.available = true;
        this.ISBN = ++bookIdTracker;
        library.addBook(this);
    }

    @Override
    public String toString(){
        return title + ", " + author + ", " + ISBN + ", "+ genre;
    }

}