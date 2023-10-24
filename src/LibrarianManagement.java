import java.util.ArrayList;
import java.util.List;

public class LibrarianManagement {
    private static LibrarianManagement instance = null;

    private LibrarianManagement() {}

    public static LibrarianManagement getInstance() {
        if (instance == null) {
            instance = new LibrarianManagement();
        }
        return instance;
    }

    private final String libraryPassword = "password";

    private static ArrayList<Librarian> librarians = new ArrayList<>();
    private static ArrayList<Book> books = new ArrayList<>();
    private static ArrayList<Patron> patrons = new ArrayList<>();

    public void addBook(Book newBook) {
        books.add(newBook);
        System.out.println("new book added - "+newBook);
    }

    public void addLibrarian(Librarian newLibrarian) {
        librarians.add(newLibrarian);
        System.out.println("new book added - "+newLibrarian);
    }

    public void addPatron(Patron newPatron) {
        patrons.add(newPatron);
    }

    public boolean login(String firstName, String lastName, String password) {
        for (Librarian librarian : librarians) {
            if (librarian.getFirstName().equals(firstName) &&
                    librarian.getLastName().equals(lastName) &&
                    password.equals(libraryPassword)) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<Book> getBooksList(){
        return books;
    }
    public ArrayList<Patron> getPatronsList() {
        return patrons;
    }
}
